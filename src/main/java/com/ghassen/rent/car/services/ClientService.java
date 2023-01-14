package com.ghassen.rent.car.services;

import com.ghassen.rent.car.entities.Client;

import java.util.List;

public interface ClientService {

    Client getClientById(Long id);

    List<Client> getAllClients();

    Client addClient(Client client);

    Client updateClient(Client client);

    Client deleteClientById(Long id);


}
