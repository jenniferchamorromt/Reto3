package com.jenniferch.reto3.reto3.Web;

import com.jenniferch.reto3.reto3.Model.Finca;
import com.jenniferch.reto3.reto3.Service.FincaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Farm")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class FincaController {

    @Autowired
    private FincaService fincaService;

    @GetMapping("/all")
    public List<Finca> getFincas(){
        return fincaService.getAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Finca save(@RequestBody Finca finca){

        return  fincaService.save(finca);
    }
}
