package com.dvlp.study.apicidades.application.controller;

import com.dvlp.study.apicidades.application.controller.response.EstadoDataResponse;
import com.dvlp.study.apicidades.domain.model.Estado;
import com.dvlp.study.apicidades.domain.usecase.ConsultarEstadoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estado")
@RequiredArgsConstructor
public class EstadoController {


    final ConsultarEstadoUseCase consultarEstadoUseCase;

    @GetMapping
    public ResponseEntity<List<Estado>> consultarEstado(){
        final List<Estado> estadosModel = this.consultarEstadoUseCase.consultar();
        return new ResponseEntity(new EstadoDataResponse(estadosModel), HttpStatus.OK);
    }
}
