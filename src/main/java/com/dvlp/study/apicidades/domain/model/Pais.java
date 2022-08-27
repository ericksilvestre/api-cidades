package com.dvlp.study.apicidades.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pais {

    @Id
    private Long id;

    @Column(name = "nome")
    private String nomePais;

    @Column(name ="nome_pt")
    private String nomePt;

    @Column(name ="sigla")
    private String siglaPais;

    @Column(name = "bacen")
    private Integer numeroBacen;
}
