package br.gov.sp.fatec.controller.impl;

import br.gov.sp.fatec.controller.AluguelController;
import br.gov.sp.fatec.domain.request.AluguelRequest;
import br.gov.sp.fatec.domain.request.AluguelUpdateRequest;
import br.gov.sp.fatec.domain.response.AluguelResponse;
import br.gov.sp.fatec.service.AluguelService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AluguelControllerImpl implements AluguelController {

    private final AluguelService aluguelService;

    @Override
    public ResponseEntity<AluguelResponse> save(AluguelRequest aluguelRequest) {
        AluguelResponse aluguelResponse = aluguelService.save(aluguelRequest);
        return ResponseEntity.ok(aluguelResponse);
    }

    @Override
    public ResponseEntity<AluguelResponse> findById(Long id) {
        AluguelResponse aluguelResponse = aluguelService.findById(id);
        return ResponseEntity.ok(aluguelResponse);
    }

    @Override
    public ResponseEntity<List<AluguelResponse>> findAll() {
        List<AluguelResponse> alugueis = aluguelService.findAll();
        return ResponseEntity.ok(alugueis);
    }

    @Override
    public ResponseEntity<Void> updateById(Long id, AluguelUpdateRequest request) {
        aluguelService.updateById(id, request);
        return ResponseEntity.ok().build();
    }

    @Override
    public ResponseEntity<Void> deleteById(Long id) {
        aluguelService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
