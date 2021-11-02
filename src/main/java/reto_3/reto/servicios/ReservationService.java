package reto_3.reto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reto_3.reto.modelo.Reservation;
import reto_3.reto.repositorio.ReservationRepository;

/**
 * 
 * @author Janus
 */
@Service
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;

    public List<Reservation> getAll() {
        return reservationRepository.getAll();
    }

    public Optional<Reservation> getReservation(int id) {
        return reservationRepository.getReservation(id);
    }

    public Reservation salvar(Reservation reserva) {
        if(reserva.getIdReservation() == null) {
            reservationRepository.salvar(reserva);
        }else {
            Optional<Reservation> consultar = reservationRepository.getReservation(reserva.getIdReservation());
            if(consultar.isEmpty()) {
                return reservationRepository.salvar(reserva);
            }else {
                return reserva;
            }
        }
        return reserva;
    }
    
}
