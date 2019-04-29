package pl.vm.library.service;

import pl.vm.library.to.ReservationTo;

import java.util.List;

/**
 * The Service which contains business logic for Reservation.
 */
public interface ReservationService {

    /**
     * Returns all Reservations.
     *
     * @return all Reservations
     */
    public List<ReservationTo> findAll();


	// TODO Create reservation.

    /**
     * Creates a new Entity for the given object.
     *
     * @param ReservationTo
     * @return the persisted Book
     */
    public ReservationTo create(ReservationTo reservation);




	// TODO Extend reservation - change the "toDate" Date in the given reservation
    /**
     * Updates Entity for the given object.
     *
     * @param ReservationTo
     * @return the persisted Book
     */
    public ReservationTo update(ReservationTo reservation);
}
