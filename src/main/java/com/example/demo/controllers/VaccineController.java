package com.example.demo.controllers;

import com.example.demo.entities.Vaccine;
import com.example.demo.services.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccine")
public class VaccineController {
    @Autowired
    private VaccineService vaccineService;

    @PostMapping
    public ResponseEntity<Vaccine> saveVaccine(@RequestBody Vaccine vaccine){
        return new ResponseEntity<>(vaccineService.save(vaccine), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Vaccine>>getAll(){
        return ResponseEntity.ok(vaccineService.getAll());
    }

    @GetMapping ("/{id}")
    public ResponseEntity<Vaccine> getById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(vaccineService.getById(Long.valueOf(id)));
    }

}
