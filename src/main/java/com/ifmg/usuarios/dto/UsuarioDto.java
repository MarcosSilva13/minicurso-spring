package com.ifmg.usuarios.dto;

import lombok.Value;

import java.time.LocalDate;

@Value
public class UsuarioDto {
    private Long id;
    private String nome;
    private Long cpf;
    private LocalDate dataDeNascimento;
}
