package reto_3.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_3.reto.modelo.Client;

/**
 * 
 * @author Janus
 */
public interface ClientCrudRepository  extends CrudRepository<Client, Integer> {
    
}
