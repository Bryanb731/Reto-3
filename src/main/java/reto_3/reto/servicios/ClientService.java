package reto_3.reto.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reto_3.reto.modelo.Client;
import reto_3.reto.repositorio.ClientRepository;

/**
 * 
 * @author Janus
 */
@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Optional<Client> getClient(int id) {
        return clientRepository.getClient(id);
    }

    public Client salvar(Client cliente) {
        if(cliente.getIdClient() == null) {
            clientRepository.salvar(cliente);
        }else {
            Optional<Client> consutar = clientRepository.getClient(cliente.getIdClient());
            if(consutar.isEmpty()) {
                return clientRepository.salvar(cliente);
            }else {
                return cliente;
            }
        }
        return cliente;
    }
    
}
