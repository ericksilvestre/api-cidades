package com.dvlp.study.apicidades.domain.service;

import com.dvlp.study.apicidades.domain.model.Pais;
import com.dvlp.study.apicidades.domain.repository.PaisRepository;
import com.dvlp.study.apicidades.domain.usecase.ConsultarPaisUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaisService implements ConsultarPaisUseCase {

    @Autowired
    private PaisRepository paisRepository;

    @Override
    public List<Pais> consulta() {
        return paisRepository.findAll();
    }
}

