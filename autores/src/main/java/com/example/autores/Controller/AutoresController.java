package com.example.autores.Controller;

import com.example.autores.Model.AutoresModel;
import com.example.autores.Service.AutoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/autores")
public class AutoresController {

    @Autowired
    private AutoresService autoresService;

    @GetMapping
    public List<AutoresModel> findAll(){
        return autoresService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<AutoresModel> buscarPorId(@PathVariable Long id){
        return autoresService.buscarPorId(id);
    }

    @PostMapping
    public AutoresModel criarAutor(@RequestBody AutoresModel autor){
        return autoresService.criarAutor(autor);
    }

    @DeleteMapping("/{id}")
    public void deletarAutor(@PathVariable Long id){
        autoresService.deletarAutor(id);
    }
}