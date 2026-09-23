package com.javanauta.agendadortarefas.infrastructure.exceptions;

import org.springframework.http.ResponseEntity;

public class ResourceNotFoundExceptions extends RuntimeException {

    public ResourceNotFoundExceptions(String mensagem){
        super(mensagem);
    }

    public ResourceNotFoundExceptions(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }
}
