package com.jenniferch.reto3.reto3.Repository;

import com.jenniferch.reto3.reto3.Model.Categoria;
import com.jenniferch.reto3.reto3.Repository.crud.CategoriaCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {

    @Autowired
    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }
    public Optional<Categoria> getCategoria(int id){
        return categoriaCrudRepository.findById(id);
    }

    public Categoria save(Categoria categoria){

        return categoriaCrudRepository.save(categoria);
    }
    /*public void delete(int id){
        var categoria=categoriaCrudRepository.findById(id);
        if(categoria != null){
            categoriaCrudRepository.delete(categoria);
        }
    }
    public Categoria update(Categoria categoria){
        var categoriaFind=categoriaCrudRepository.findById(categoria.getId());
        if(categoriaFind != null){
            categoriaCrudRepository.save(categoria);
        }
        return categoria;
    }

     */

}
