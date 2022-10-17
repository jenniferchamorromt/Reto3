package com.jenniferch.reto3.reto3.Repository;


import com.jenniferch.reto3.reto3.Model.Mensaje;
import com.jenniferch.reto3.reto3.Repository.crud.MensajeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MensajeRepository {

    @Autowired
    private MensajeCrudRepository mensajeCrudRepository;

    public List<Mensaje> getAll(){
        return  (List<Mensaje>) mensajeCrudRepository.findAll();
    }
    public Optional<Mensaje> getMensaje(int id){
        return mensajeCrudRepository.findById(id);
    }
    public Mensaje save(Mensaje mensaje){
        return mensajeCrudRepository.save(mensaje);
    }
}
