package com.ifmg.usuarios.service;

import com.ifmg.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@RequiredArgsConstructor
public class DeletaUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void deletaUsuarioById(@PathVariable Long id) {
        usuarioRepository.deleteById(id);
    }
}
