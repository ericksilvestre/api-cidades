package com.dvlp.study.apicidades.domain.service;

import com.dvlp.study.apicidades.domain.model.Estado;
import com.dvlp.study.apicidades.domain.repository.EstadoRepository;
import com.dvlp.study.apicidades.domain.usecase.ConsultarEstadoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstadoService implements ConsultarEstadoUseCase {

    final EstadoRepository estadoRepository;

    @Override
    public List<Estado> consultar() {
        return estadoRepository.findAll();
    }
}


