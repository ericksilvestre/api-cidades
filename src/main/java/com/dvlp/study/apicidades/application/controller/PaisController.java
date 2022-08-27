package com.dvlp.study.apicidades.application.controller;

import com.dvlp.study.apicidades.application.controller.response.PaisDataResponse;
import com.dvlp.study.apicidades.domain.model.Pais;
import com.dvlp.study.apicidades.domain.usecase.ConsultarPaisUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pais")
@RequiredArgsConstructor
public class PaisController {

    @Autowired
    private ConsultarPaisUseCase consultarPaisUseCase;

    @GetMapping
    public ResponseEntity<List<Pais>> consultarPais(){
        final List<Pais> paisModel = this.consultarPaisUseCase.consulta();
        return new ResponseEntity(new PaisDataResponse(paisModel),HttpStatus.OK);
    }
}
