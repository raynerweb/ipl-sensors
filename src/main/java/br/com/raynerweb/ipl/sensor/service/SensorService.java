package br.com.raynerweb.ipl.sensor.service;

import br.com.raynerweb.ipl.sensor.dto.SensorDTO;
import br.com.raynerweb.ipl.sensor.repository.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SensorService {

    @Autowired
    private SensorRepository repository;

    public List<SensorDTO> findAll() {
        return repository.findAll().stream().map(sensorEntity -> new SensorDTO(
                        sensorEntity.getId(),
                        sensorEntity.getName(),
                        sensorEntity.getType(),
                        sensorEntity.getMinValue(),
                        sensorEntity.getMaxValue(),
                        sensorEntity.getUnit()))
                .collect(Collectors.toList());
    }

}
