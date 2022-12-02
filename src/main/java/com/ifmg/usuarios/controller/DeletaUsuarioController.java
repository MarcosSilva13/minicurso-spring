package com.ifmg.usuarios.controller;

import com.ifmg.usuarios.service.DeletaUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeletaUsuarioController {

    @Autowired
    private DeletaUsuarioService deletaUsuarioService;

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> deletaUsuario(@PathVariable Long id) {
        deletaUsuarioService.deletaUsuarioById(id);

        return ResponseEntity.ok().body("Usuário deletado com sucesso!");
    }

    /*
    @DeleteMapping
    public void deletaUsuario(@RequestBody UsuarioDto usuarioDto) {
        deletaUsuarioService.deletaUsuarioById(usuarioDto.getId());
    }
    */
}
