package com.ghassen.rent.car.controllers;

import com.ghassen.rent.car.entities.Client;
import com.ghassen.rent.car.entities.EmailDetails;
import com.ghassen.rent.car.services.ClientService;
import com.ghassen.rent.car.utilities.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private EmailService emailService;


    @PostMapping("addClient")
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @GetMapping("getAllClients")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("{client_id}")
    public Client getClientById(@PathVariable("client_id") Long clientId){
        return clientService.getClientById(clientId);
    }

    @PutMapping("updateClient")
    public Client updateClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping("{client_id}")
    public void deleteClient(@PathVariable("client_id") Long clientId ){
        clientService.deleteClientById(clientId);
    }

    @PostMapping("sendEmail")
    public String sendEmail(@RequestBody(required = false) EmailDetails emailDetails){
        return emailService.sendEmail(emailDetails);
    }

}
