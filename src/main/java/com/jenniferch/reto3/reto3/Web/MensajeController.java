package com.jenniferch.reto3.reto3.Web;

import com.jenniferch.reto3.reto3.Model.Mensaje;
import com.jenniferch.reto3.reto3.Service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MensajeController {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping("/all")
    public List<Mensaje> getMensajes(){
        return mensajeService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje save(@RequestBody Mensaje mensaje){
        return  mensajeService.save(mensaje);
    }

}
