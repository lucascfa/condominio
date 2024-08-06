package com.example.condominio_projeto;

import com.example.condominio_projeto.repository.CondominioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

@Repository
public class IniciadorAplicacao implements CommandLineRunner {
    @Autowired
    private CondominioRepository repository;

    @Override
    public void run(String... args) throws Exception {

    }
}

