package com.jenniferch.reto3.reto3.Web;


import com.jenniferch.reto3.reto3.Model.Reserva;
import com.jenniferch.reto3.reto3.Service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReservaController {

    @Autowired
    private ReservaService reservaService;
    @GetMapping("/all")
    public List<Reserva> getReservas(){
        return reservaService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reserva save(@RequestBody Reserva reserva){
        return  reservaService.save(reserva);
    }
}
