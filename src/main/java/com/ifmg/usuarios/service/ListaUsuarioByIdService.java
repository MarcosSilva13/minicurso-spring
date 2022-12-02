package com.ifmg.usuarios.service;

import com.ifmg.usuarios.domain.Usuario;
import com.ifmg.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ListaUsuarioByIdService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario listaUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));

        return usuario;
    }
}
