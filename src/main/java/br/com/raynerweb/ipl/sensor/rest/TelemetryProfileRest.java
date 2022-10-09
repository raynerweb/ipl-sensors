package br.com.raynerweb.ipl.sensor.rest;

import br.com.raynerweb.ipl.sensor.dto.TelemetryProfileDTO;
import br.com.raynerweb.ipl.sensor.service.TelemetryProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/telemetries")
public class TelemetryProfileRest {

    @Autowired
    private TelemetryProfileService service;

    @GetMapping
    public List<TelemetryProfileDTO> findAll() {
        return service.findAll();
    }

}
