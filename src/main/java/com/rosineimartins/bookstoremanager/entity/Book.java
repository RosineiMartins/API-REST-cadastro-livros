package com.rosineimartins.bookstoremanager.entity;

import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(nullable = false, unique = true)        //não permite a tabela como nula, unique/ nome unico
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapter;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})               //Faz o relacionamento com a classe Author 1x1
    @JoinColumn(name = "author_id")
    private Author author;
}