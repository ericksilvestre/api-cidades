package com.dvlp.study.apicidades.domain.model;

import javax.persistence.*;

@Entity
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="nome")
    private String nomeEstado;

    @Column(name ="uf")
    private String siglaEstado;

    @Column(name ="ibge")
    private String codigoIbge;

    @Column(name="pais")
    private Integer pais;

    @Column(name = "ddd")
    private String ddd;


}
