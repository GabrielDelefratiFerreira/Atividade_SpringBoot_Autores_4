package com.example.autores.Service;

import com.example.autores.Model.AutoresModel;
import com.example.autores.Repository.AutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoresService {

    @Autowired
    private AutoresRepository autoresRepository;

    public List<AutoresModel> findAll(){
        return autoresRepository.findAll();
    }

    public Optional<AutoresModel> buscarPorId(Long id){
        return autoresRepository.findById(id);
    }

    public AutoresModel criarAutor(AutoresModel autor){
        return autoresRepository.save(autor);
    }

    public void deletarAutor(Long id){
        autoresRepository.deleteById(id);
    }
}