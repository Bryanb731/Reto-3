package reto_3.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_3.reto.modelo.Bike;

/**
 * 
 * @author Janus
 */
public interface BikeCrudRepository extends CrudRepository<Bike, Integer> {
    
}
