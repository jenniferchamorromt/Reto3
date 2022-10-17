package com.jenniferch.reto3.reto3.Service;


import com.jenniferch.reto3.reto3.Model.Reserva;
import com.jenniferch.reto3.reto3.Repository.ReservaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRespository reservaRespository;

    public List<Reserva> getAll(){
        return (List<Reserva>) reservaRespository.getAll();
    }

    public Reserva save(Reserva reserva){
        if(reserva.getId() ==null){
            return reservaRespository.save(reserva);
        }else{
            Optional<Reserva> categoriaOptional=reservaRespository.getReserva(reserva.getId());
            if(categoriaOptional.isEmpty()){
                return reservaRespository.save(reserva);
            }else{
                return reserva;
            }
        }
    }
}
