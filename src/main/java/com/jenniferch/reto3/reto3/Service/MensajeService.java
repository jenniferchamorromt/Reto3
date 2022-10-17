package com.jenniferch.reto3.reto3.Service;

import com.jenniferch.reto3.reto3.Model.Finca;
import com.jenniferch.reto3.reto3.Model.Mensaje;
import com.jenniferch.reto3.reto3.Repository.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    public List<Mensaje> getAll(){
        return  (List<Mensaje>) mensajeRepository.getAll();
    }

    public Mensaje save(Mensaje mensaje){
        if(mensaje.getId() ==null){
            return mensajeRepository.save(mensaje);
        }else{
            Optional<Mensaje> categoriaOptional=mensajeRepository.getMensaje(mensaje.getId());
            if(categoriaOptional.isEmpty()){
                return mensajeRepository.save(mensaje);
            }else{
                return mensaje;
            }
        }
    }
}
