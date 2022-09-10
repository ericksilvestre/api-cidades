package com.dvlp.study.apicidades.application.controller.response;

import com.dvlp.study.apicidades.domain.model.Estado;
import com.dvlp.study.apicidades.domain.model.Pais;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@AllArgsConstructor
@Getter
public class EstadoResponse {

    @JsonProperty("nome_estado")
    private String nomeEstado;

    @JsonProperty("sigla_estado")
    private String siglaEstado;

    @JsonProperty("codigo_ibge")
    private String codigoIbge;

    @JsonProperty("nome_Pais")
    private Pais pais;

    @JsonProperty("ddd")
    private List<Integer> ddd;

    public EstadoResponse(Estado estado){
       this.nomeEstado = estado.getNomeEstado();
       this.siglaEstado = estado.getSiglaEstado();
       this.codigoIbge = estado.getCodigoIbge();
       this.pais = estado.getPais();
       this.ddd = estado.getDdd();
    }

}
