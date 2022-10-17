package com.jenniferch.reto3.reto3.Service;

import com.jenniferch.reto3.reto3.Model.Finca;
import com.jenniferch.reto3.reto3.Repository.FincaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FincaService {

    @Autowired
    private FincaRepository fincaRepository;
    public List<Finca> getAll(){
        return (List<Finca>) fincaRepository.getAll();
    }
    public Finca save(Finca finca){
        if(finca.getId() ==null){
            return fincaRepository.save(finca);
        }else{
            Optional<Finca> categoriaOptional=fincaRepository.getFinca(finca.getId());
            if(categoriaOptional.isEmpty()){
                return fincaRepository.save(finca);
            }else{
                return finca;
            }
        }
    }
}
