package com.ghassen.rent.car.servicesimpl;

import com.ghassen.rent.car.entities.Client;
import com.ghassen.rent.car.repositories.ClientRepository;
import com.ghassen.rent.car.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client deleteClientById(Long id) {
        Client clientToDelete = clientRepository.findById(id).get();
        clientRepository.deleteById(id);
        return clientToDelete;
    }

}
