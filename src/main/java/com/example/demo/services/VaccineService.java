package com.example.demo.services;

import com.example.demo.entities.Vaccine;
import com.example.demo.repositories.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VaccineService {
    @Autowired
    private VaccineRepository vaccineRepository;

    public List<Vaccine> getAll() {
        return vaccineRepository.findAll();
    }

    public Vaccine getById(Long Id) {
        Optional<Vaccine> byId = vaccineRepository.findById(Id);
        return byId.orElseGet(byId::get);
    }

    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }

    public Boolean delete(Vaccine vaccine) {
        vaccineRepository.delete(vaccine);
        return Boolean.TRUE;}


}

