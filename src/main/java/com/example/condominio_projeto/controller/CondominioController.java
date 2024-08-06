package com.example.condominio_projeto.controller;

import com.example.condominio_projeto.handler.BusinessException;
import com.example.condominio_projeto.handler.CampoObrigatorioException;
import com.example.condominio_projeto.model.Condominio;
import com.example.condominio_projeto.repository.CondominioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/condominios")
public class CondominioController {
    @Autowired
    private CondominioRepository repository;

    @GetMapping
    public List<Condominio> getCondominio(){
        return repository.findAll();
    }

    @GetMapping("{id}")
    public Condominio getOne(@PathVariable("id") Integer id){
        return (Condominio) repository.findAllById(id);
    }

    @DeleteMapping("{id}")
    public void deleteOne(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postCondominio(@RequestBody Condominio condominio) {
        if(condominio.getCep() == null)
           // throw new CampoObrigatorioException("nome");
            throw new BusinessException("Campos obrigatórios não informados");
        else
            repository.save(condominio);

    }

}
