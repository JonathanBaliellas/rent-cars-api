package br.gov.sp.fatec.service.impl;

import br.gov.sp.fatec.domain.entity.Carro;
import br.gov.sp.fatec.domain.mapper.CarroMapper;
import br.gov.sp.fatec.domain.request.CarroRequest;
import br.gov.sp.fatec.domain.request.CarroUpdateRequest;
import br.gov.sp.fatec.domain.response.CarroResponse;
import br.gov.sp.fatec.repository.CarroRepository;
import br.gov.sp.fatec.service.CarroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CarroServiceImpl implements CarroService {

    private final CarroRepository carroRepository;
    private final CarroMapper carroMapper;

    @Override
    public CarroResponse save(CarroRequest carroRequest) {
        Carro carro = carroMapper.map(carroRequest);
        carro = carroRepository.save(carro);
        return carroMapper.map(carro);
    }

    @Override
    public CarroResponse findById(Long id) {
        Carro carro = carroRepository.findById(id).orElseThrow(() -> new RuntimeException("Carro não encontrado"));
        return carroMapper.map(carro);
    }

    @Override
    public List<CarroResponse> findAll() {
        return carroRepository.findAll().stream()
                .map(carroMapper::map)
                .collect(Collectors.toList());
    }

    @Override
    public void updateById(Long id, CarroUpdateRequest carroUpdateRequest) {
        Carro carro = carroRepository.findById(id).orElseThrow(() -> new RuntimeException("Carro não encontrado"));
        carroMapper.updateEntity(carroUpdateRequest, carro);
        carroRepository.save(carro);
    }

    @Override
    public void deleteById(Long id) {
        carroRepository.deleteById(id);
    }
}
