package reto_3.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_3.reto.modelo.Message;

/**
 * 
 * @author Janus
 */
public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
    
}
