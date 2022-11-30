package com.ifmg.usuarios.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_USUARIOS")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long cpf;
    private LocalDate dataDeNascimento;
    private LocalDateTime dataDeCriacao;
    private LocalDateTime dataDeAtualizacao;
}
