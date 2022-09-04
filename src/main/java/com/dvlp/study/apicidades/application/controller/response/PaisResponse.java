package com.dvlp.study.apicidades.application.controller.response;

import com.dvlp.study.apicidades.domain.model.Pais;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties("id")
public class PaisResponse {

    @JsonProperty("id")
    private long id;

    @JsonProperty("nome_pais")
    private String nomePais;

    @JsonProperty("nome_pt")
    private String nomePt;

    @JsonProperty("sigla_pais")
    private String siglaPais;

    @JsonProperty("numero_bacen")
    private Integer numeroBacen;

    public PaisResponse(Pais pais){
        this.id = pais.getId();
        this.nomePais = pais.getNomePais();
        this.nomePt = pais.getNomePt();
        this.siglaPais = pais.getSiglaPais();
        this.numeroBacen = pais.getNumeroBacen();
    }
}


