package reto_3.reto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reto_3.reto.modelo.Category;
import reto_3.reto.repositorio.CategoryRepository;

/**
 * 
 * @author Janus
 */
@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int id) {
        return categoryRepository.getCategory(id);
    }

    public Category salvar(Category categoria) {
        if(categoria.getId() == null) {
            categoryRepository.salvar(categoria);
        }else {
            Optional<Category> consultar = categoryRepository.getCategory(categoria.getId());
            if(consultar.isEmpty()) {
                return categoryRepository.salvar(categoria);
            }else {
                return categoria;
            }
        }
        return categoria;
    }

}
