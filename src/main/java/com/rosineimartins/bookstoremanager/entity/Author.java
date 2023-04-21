package com.rosineimartins.bookstoremanager.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    @Column(name = "id", nullable = false)
    private Long id;

    @Column (nullable = false, unique = true )        //não permite a tabela como nula, unique/ nome unico
    private String name;
    @Column(nullable = false)
    private Integer chapter;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
