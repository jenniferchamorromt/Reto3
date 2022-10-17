package com.jenniferch.reto3.reto3.Service;

import com.jenniferch.reto3.reto3.Model.Cliente;
import com.jenniferch.reto3.reto3.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll(){
        return (List<Cliente>) clienteRepository.getAll();
    }

    public Cliente save(Cliente cliente){

        if(cliente.getId() ==null){
            return clienteRepository.save(cliente);
        }else{
            Optional<Cliente> categoriaOptional=clienteRepository.getCliente(cliente.getId());
            if(categoriaOptional.isEmpty()){
                return clienteRepository.save(cliente);
            }else{
                return cliente;
            }
        }
    }
}
