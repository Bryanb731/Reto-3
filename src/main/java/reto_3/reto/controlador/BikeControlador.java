package reto_3.reto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reto_3.reto.modelo.Bike;
import reto_3.reto.servicios.BikeService;

/**
 * 
 * @author Janus
 */
@RestController
@RequestMapping("/api/Bike")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class BikeControlador {

    @Autowired
    private BikeService bikeService;

    @GetMapping("/all")
    public List<Bike> getBike() {
        return bikeService.getll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Bike salvar(@RequestBody Bike bicicleta) {
        return bikeService.salvar(bicicleta);
    }

}
