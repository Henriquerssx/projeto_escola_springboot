package com.senai.projeto_escola.domain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data
@MappedSuperclass
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @NotBlank(message = "O campo nome não pode estar vazio")
    @Size(min = 5, max = 50, message = "O campo nome pode ter 5 a 50 caracteres")
    private String nome;

    private Long cpf;

    private String tipo;
}
