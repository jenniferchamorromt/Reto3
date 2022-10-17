package com.jenniferch.reto3.reto3.Service;

import com.jenniferch.reto3.reto3.Repository.CalificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalificacionService {

    @Autowired
    private CalificacionRepository calificacionRepository;
}
