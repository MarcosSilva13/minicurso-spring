package com.ifmg.usuarios.controller;

import com.ifmg.usuarios.dto.UsuarioDto;
import com.ifmg.usuarios.service.EditaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditaUsuarioController {

    @Autowired
    private EditaUsuarioService editaUsuarioService;

    @PutMapping
    public ResponseEntity<Object> editaUsuario(@RequestBody UsuarioDto usuarioDto) {
        editaUsuarioService.editaUsuario(
                usuarioDto.getId(),
                usuarioDto.getNome(),
                usuarioDto.getCpf(),
                usuarioDto.getDataDeNascimento()
        );

        return ResponseEntity.ok().body("Usuário editado com sucesso!");
    }
}
