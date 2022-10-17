package com.jenniferch.reto3.reto3.Service;

import com.jenniferch.reto3.reto3.Repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorService {

    @Autowired
    private AdministratorRepository administratorRepository;

}
