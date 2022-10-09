package br.com.raynerweb.ipl.sensor.service;

import br.com.raynerweb.ipl.sensor.dto.TelemetryProfileDTO;
import br.com.raynerweb.ipl.sensor.entity.SensorEntity;
import br.com.raynerweb.ipl.sensor.entity.TelemetryProfileEntity;
import br.com.raynerweb.ipl.sensor.repository.TelemetryProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class TelemetryProfileService {

    @Autowired
    private TelemetryProfileRepository repository;

    @Transactional
    public List<TelemetryProfileDTO> findAll() {
        return repository.findAll().stream().map(entity -> new TelemetryProfileDTO(
                        entity.getId(),
                        entity.getName(),
                        entity.getSensors().stream().map(SensorEntity::getName)
                                .collect(Collectors.toSet())))
                .collect(Collectors.toList());

    }
}
