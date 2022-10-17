package com.jenniferch.reto3.reto3.Service;

import com.jenniferch.reto3.reto3.Model.Categoria;
import com.jenniferch.reto3.reto3.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return (List<Categoria>) categoriaRepository.getAll();
    }

    public Categoria save(Categoria categoria){
        if(categoria.getId() ==null){
            return categoriaRepository.save(categoria);
        }else{
            Optional<Categoria> categoriaOptional=categoriaRepository.getCategoria(categoria.getId());
            if(categoriaOptional.isEmpty()){
                return categoriaRepository.save(categoria);
            }else{
                return categoria;
            }
        }

    }
    /*public Categoria update(Categoria categoria){
        return categoriaRepository.update(categoria);
    }
    public void delete(int id){
        categoriaRepository.delete(id);
    }
    */


}
