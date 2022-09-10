package com.dvlp.study.apicidades.application.controller.response;

import com.dvlp.study.apicidades.domain.model.Estado;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class EstadoDataResponse {

    @JsonProperty("data")
    private List<EstadoResponse> estadoResponse;

    public EstadoDataResponse(List<Estado> estadosModel){
        this.estadoResponse = estadosModel.stream().map(EstadoResponse::new).collect(toList());
    }
}
