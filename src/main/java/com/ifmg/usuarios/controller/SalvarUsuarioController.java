package com.ifmg.usuarios.controller;

import com.ifmg.usuarios.dto.UsuarioDto;
import com.ifmg.usuarios.service.SalvarUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalvarUsuarioController {

    @Autowired
    private SalvarUsuarioService salvarUsuarioService;

    @PostMapping
    public ResponseEntity<Object> salvarUsuario(@RequestBody UsuarioDto usuarioDto){
        salvarUsuarioService.salvaUsuario(usuarioDto.getNome(),
                usuarioDto.getCpf(), usuarioDto.getDataDeNascimento());

        return ResponseEntity.ok().body("Usuario foi salvo no banco!");
    }
}
