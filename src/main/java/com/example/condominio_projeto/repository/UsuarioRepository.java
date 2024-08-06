package com.example.condominio_projeto.repository;

import com.example.condominio_projeto.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository  {
    public void salvar(Usuario usuario){
        if (usuario.getId()==null){
            System.out.println("SAVE - Recebendo usuário na camada de repositório");
        }else{
            System.out.println("UPDATE - Recebendo usuário na camada de repositório");
            System.out.println(usuario);
        }
    }
    public void deletarPorId(Integer id){
        System.out.println(String.format("DELETE/id - Recebeno usuário na camada de repositório"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println(String.format("LIST - Listando usuários do sistema"));
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("lucas","senha"));
        usuarios.add(new Usuario("caylin","senha"));
        usuarios.add(new Usuario("bento","senha"));
        return usuarios;
    };
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %s na camada de repositório", id));

        return new Usuario("karina","senha");
    }
    public Usuario findByName(String name){
        System.out.println(String.format("FIND/username - Recebendo username: %s na camada de repositório",name));

        return new Usuario("mae","senha");
    }


}
