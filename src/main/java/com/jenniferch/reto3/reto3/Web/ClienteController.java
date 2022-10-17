package com.jenniferch.reto3.reto3.Web;

import com.jenniferch.reto3.reto3.Model.Cliente;
import com.jenniferch.reto3.reto3.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @GetMapping("/all")
    public List<Cliente> getCliente(){
        return clienteService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@RequestBody Cliente cliente){
        return  clienteService.save(cliente);
    }
}
