package com.jenniferch.reto3.reto3.Repository;

import com.jenniferch.reto3.reto3.Model.Cliente;
import com.jenniferch.reto3.reto3.Repository.crud.ClienteCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;

    public List<Cliente> getAll(){
        return (List<Cliente>) clienteCrudRepository.findAll();
    }

    public Optional<Cliente> getCliente(int id){
        return clienteCrudRepository.findById(id);
    }

    public Cliente save(Cliente cliente){
        return clienteCrudRepository.save(cliente);
    }
}
