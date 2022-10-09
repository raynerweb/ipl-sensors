package br.com.raynerweb.ipl.sensor.dto;

import br.com.raynerweb.ipl.sensor.entity.SensorType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorDTO {

    private UUID id;
    private String name;
    private SensorType type;
    private Double minValue;
    private Double maxValue;
    private String unit;

}
