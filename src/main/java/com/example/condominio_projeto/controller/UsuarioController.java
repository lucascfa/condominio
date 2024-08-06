package com.example.condominio_projeto.controller;

import com.example.condominio_projeto.model.Usuario;
import com.example.condominio_projeto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository repositorio;
    @GetMapping("/usuarios")
    public List<Usuario> getUsers(){
        return repositorio.findAll();
    };
}
