package com.example.condominio_projeto.repository;

import com.example.condominio_projeto.model.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface  CondominioRepository extends JpaRepository <Condominio, Integer> {
    @Override
    Optional<Condominio> findById(Integer integer);

    Condominio findAllById(Integer id);

    @Override
    void deleteById(Integer integer);
}
