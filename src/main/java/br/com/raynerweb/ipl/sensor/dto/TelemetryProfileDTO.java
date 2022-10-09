package br.com.raynerweb.ipl.sensor.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TelemetryProfileDTO {

    private UUID id;
    private String name;
    private Set<String> sensor;
}
