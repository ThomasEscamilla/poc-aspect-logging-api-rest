package com.capgemini.pocaspectloggerapirest.api.rest;


import com.capgemini.pocaspectloggerapirest.api.rest.dto.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ClientRestController {

    public ClientRestController() {
    }

    @GetMapping("/client")
    public String getClient(@RequestParam String name) {
        return "Client name : " + name;
    }

    @GetMapping("/client/{idClient}")
    public Client getDetail(@PathVariable String idClient) {
        return new Client(Long.parseLong(idClient),"John Doe","doe@example.com");
    }

}
