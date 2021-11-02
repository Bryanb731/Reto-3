package reto_3.reto.repositorio;

import org.springframework.data.repository.CrudRepository;

import reto_3.reto.modelo.Category;

/**
 * 
 * @author Janus
 */
public interface CategoryCrudRepository extends CrudRepository<Category, Integer> {
    
}
