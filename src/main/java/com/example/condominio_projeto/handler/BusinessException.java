package com.example.condominio_projeto.handler;

public class BusinessException extends RuntimeException{
    public BusinessException(String mensagem){

    }
    public BusinessException(String mensagem, Object ... params){
        super(String.format(mensagem, params));
    }

}
