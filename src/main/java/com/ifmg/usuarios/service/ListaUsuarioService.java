package com.ifmg.usuarios.service;

import com.ifmg.usuarios.domain.Usuario;
import com.ifmg.usuarios.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListaUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> listaUsuario() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }
}
