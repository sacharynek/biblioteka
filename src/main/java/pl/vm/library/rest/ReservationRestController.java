package pl.vm.library.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.vm.library.service.ReservationService;
import pl.vm.library.to.ReservationTo;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationRestController {

    @Autowired
    private ReservationService reservationService;


    @ResponseStatus(HttpStatus.OK)
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ReservationTo> findAll() {
        return reservationService.findAll();
    }

    // TODO Create reservation.

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ReservationTo create(@Valid @RequestBody ReservationTo reservation) {
        return reservationService.create(reservation);
    }

    // TODO Extend reservation - change the "toDate" Date in the given reservation

    @ResponseStatus(HttpStatus.OK)
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void update(@Valid @RequestBody ReservationTo reservation) {
        reservationService.update(reservation);
    }
}
