package com.ifmg.usuarios.controller;

import com.ifmg.usuarios.domain.Usuario;
import com.ifmg.usuarios.service.ListaUsuarioByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaUsuarioByIdController {

    @Autowired
    private ListaUsuarioByIdService listaUsuarioByIdService;

    @GetMapping(path = "/{id}")
    public Usuario listaUsuarioById(@PathVariable Long id) {
        Usuario usuario = listaUsuarioByIdService.listaUsuarioById(id);
        return usuario;
    }
}
