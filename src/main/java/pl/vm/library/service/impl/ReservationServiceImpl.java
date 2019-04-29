package pl.vm.library.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.vm.library.entity.Reservation;
import pl.vm.library.exception.ParameterValidationException;
import pl.vm.library.repository.ReservationRepository;
import pl.vm.library.service.ReservationService;
import pl.vm.library.to.ReservationTo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;


@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    private ModelMapper mapper = new ModelMapper();

    @Override
    public List<ReservationTo> findAll() {
        List<Reservation> reservations = (List<Reservation>) reservationRepository.findAll();

        return reservations.stream()
                .map(reservationEntity -> mapper.map(reservationEntity, ReservationTo.class))
                .collect(Collectors.toList());
    }


    // TODO Create reservation.
    @Override
    public ReservationTo create(ReservationTo reservationTo) {
        validateNewReservation(reservationTo);

        Reservation reservationEntity = mapper.map(reservationTo, Reservation.class);

        reservationRepository.save(reservationEntity);

        return mapper.map(reservationEntity, ReservationTo.class);
    }



    private void validateNewReservation(ReservationTo reservation) {
        if (reservation.getId() != null) {
            throw new ParameterValidationException("When creating new Reservation, the ID should be null.");
        }
    }

    // TODO Extend reservation - change the "toDate" Date in the given reservation
    @Override
    public ReservationTo update(ReservationTo reservation) {
        return null;
    }
}
