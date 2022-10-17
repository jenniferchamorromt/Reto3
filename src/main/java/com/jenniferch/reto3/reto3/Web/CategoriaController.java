package com.jenniferch.reto3.reto3.Web;

import com.jenniferch.reto3.reto3.Model.Categoria;
import com.jenniferch.reto3.reto3.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/all")
    public List<Categoria> getCategorias(){
        return categoriaService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria save(@RequestBody Categoria categoria){
        return  categoriaService.save(categoria);
    }

    /*@PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria update(@RequestBody Categoria categoria){
        return  categoriaService.update(categoria);
    }

    @DeleteMapping("/{id}")
    public List<Categoria> delete(@PathVariable("id") int id){
        categoriaService.delete(id);
        return categoriaService.getAll();
    }*/

}
