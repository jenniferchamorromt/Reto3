package com.jenniferch.reto3.reto3.Repository;

import com.jenniferch.reto3.reto3.Repository.crud.CalificacionCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CalificacionRepository {
    
    @Autowired
    private CalificacionCrudRepository calificacionCrudRepository;
}
