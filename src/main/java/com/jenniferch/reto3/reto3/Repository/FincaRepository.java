package com.jenniferch.reto3.reto3.Repository;

import com.jenniferch.reto3.reto3.Model.Finca;
import com.jenniferch.reto3.reto3.Repository.crud.FincaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class FincaRepository {

    @Autowired
    private FincaCrudRepository fincaCrudRepository;

    public List<Finca> getAll(){
        return (List<Finca>) fincaCrudRepository.findAll();
    }
    public Optional<Finca> getFinca(int id){
        return fincaCrudRepository.findById(id);
    }
    public Finca save(Finca finca){
        return fincaCrudRepository.save(finca);
    }

}
