package reto_3.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_3.reto.modelo.Reservation;

/**
 * 
 * @author Janus
 */
public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
    
}
