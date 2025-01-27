package com.example.springweb.domain.db2;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table
@Getter
public class Item2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long item1Id;

    @Transient
    public void updateName(String name){
        this.name = name;
    }
}
