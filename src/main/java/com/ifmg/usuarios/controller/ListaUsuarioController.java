package com.ifmg.usuarios.controller;

import com.ifmg.usuarios.domain.Usuario;
import com.ifmg.usuarios.service.ListaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/all")
public class ListaUsuarioController {

    @Autowired
    private ListaUsuarioService listaUsuarioService;

    @GetMapping
    public List<Usuario> listaUsuario() {
        return listaUsuarioService.listaUsuario();
    }
}
