package br.com.raynerweb.ipl.sensor.rest;

import br.com.raynerweb.ipl.sensor.dto.SensorDTO;
import br.com.raynerweb.ipl.sensor.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sensors")
public class SensorRest {

    @Autowired
    private SensorService service;

    @GetMapping
    public List<SensorDTO> findAll() {
        return service.findAll();
    }

}
