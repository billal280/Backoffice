package com.example.api.controllers;

import com.example.api.repository.EquipeRepository;
import com.example.api.model.Equipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/billet")
public class JoueurController {
    @Autowired
    public BilletController(BilletRepository billetRepository) {
        this.billetRepository = billetRepository;
    }


}