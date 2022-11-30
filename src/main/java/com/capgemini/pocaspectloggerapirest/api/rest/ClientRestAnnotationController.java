package com.capgemini.pocaspectloggerapirest.api.rest;

import com.capgemini.pocaspectloggerapirest.aop.annotation.LogAround;
import com.capgemini.pocaspectloggerapirest.api.rest.dto.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientRestAnnotationController {
    public ClientRestAnnotationController() {
    }

    @GetMapping("/client/search")
    @LogAround
    public List<Client> findClients(@RequestParam String test) {
        Client c1 = new Client(1L,"John Doe","doe@example.com");
        Client c2 = new Client(2L,"John Titor","titor@example.com");
        return List.of(c1, c2);
    }

    @PostMapping("/client/adding")
    @LogAround
    public Client addClient(@RequestBody String name) {
        return new Client();
    }
}
