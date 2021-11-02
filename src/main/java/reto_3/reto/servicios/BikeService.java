package reto_3.reto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reto_3.reto.modelo.Bike;
import reto_3.reto.repositorio.BikeRepository;

/**
 * 
 * @author Janus
 */
@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getll() {
        return bikeRepository.getAll();
    }

    public Optional<Bike> getBike(int id) {
        return bikeRepository.getBike(id);
    }

    public Bike salvar(Bike bicicleta) {
        if(bicicleta.getId() == null) {
            bikeRepository.salvar(bicicleta);
        }else {
            Optional<Bike> consultar = bikeRepository.getBike(bicicleta.getId());
            if(consultar.isEmpty()) {
                return bikeRepository.salvar(bicicleta);
            }else {
                return bicicleta;
            }
        }
        return bicicleta;
    }

}
