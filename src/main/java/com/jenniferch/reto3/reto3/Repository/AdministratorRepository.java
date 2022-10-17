package com.jenniferch.reto3.reto3.Repository;

import com.jenniferch.reto3.reto3.Repository.crud.AdministradorCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdministratorRepository {

    @Autowired
    private AdministradorCrudRepository administradorCrudRepository;

}
