package reto_3.reto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reto_3.reto.modelo.Message;
import reto_3.reto.repositorio.MessageRepository;

/**
 * 
 * @author Janus
 */
@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll() {
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int id) {
        return messageRepository.getMessage(id);
    }

    public Message salvar(Message mensaje) {
        if(mensaje.getIdMessage() == null) {
            messageRepository.salvar(mensaje);
        }else {
            Optional<Message> consultar = messageRepository.getMessage(mensaje.getIdMessage());
            if(consultar.isEmpty()) {
                return messageRepository.salvar(mensaje);
            }else {
                return mensaje;
            }
        }
        return mensaje;
    }
    
}
