package com.jenniferch.reto3.reto3.Repository;

import com.jenniferch.reto3.reto3.Model.Reserva;
import com.jenniferch.reto3.reto3.Repository.crud.ReservaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservaRespository {

    @Autowired
    private ReservaCrudRepository reservaCrudRepository;

    public List<Reserva> getAll(){
        return (List<Reserva>) reservaCrudRepository.findAll();
    }

    public Optional<Reserva>  getReserva(int id){
        return reservaCrudRepository.findById(id);
    }
    public Reserva save(Reserva reserva){
        return reservaCrudRepository.save(reserva);
    }

}
