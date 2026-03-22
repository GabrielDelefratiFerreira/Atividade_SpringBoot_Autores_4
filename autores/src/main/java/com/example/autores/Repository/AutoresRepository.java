package com.example.autores.Repository;

import com.example.autores.Model.AutoresModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoresRepository extends JpaRepository<AutoresModel, Long> {
}
