package com.dvlp.study.apicidades.application.controller.response;

import com.dvlp.study.apicidades.domain.model.Pais;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class PaisDataResponse {

    @JsonProperty("data")
    private List<PaisResponse> paisResponse;

    public PaisDataResponse(List<Pais> paisModel){
        this.paisResponse = paisModel.stream().map(PaisResponse::new).collect(toList());
    }

}
