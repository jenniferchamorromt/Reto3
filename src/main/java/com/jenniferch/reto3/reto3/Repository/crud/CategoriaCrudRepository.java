package com.jenniferch.reto3.reto3.Repository.crud;

import com.jenniferch.reto3.reto3.Model.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoriaCrudRepository extends CrudRepository<Categoria,Integer> {
    /*void delete(Optional<Categoria> categoria);*/
}
