package com.rosineimartins.bookstoremanager.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data  // (Lombok) Adiciona Getters e Setters...
@NoArgsConstructor  // Construtor Vazio
@AllArgsConstructor //Construtor
@Entity            //indica que é uma entidade
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)        //não permite a tabela como nula, unique/ nome unico
    private String name;
    @Column(nullable = false)
    private Integer age;
}