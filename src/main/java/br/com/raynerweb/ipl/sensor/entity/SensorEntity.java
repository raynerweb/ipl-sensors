package br.com.raynerweb.ipl.sensor.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_SENSOR")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SensorEntity {

    @Id
    @Column(name = "COD_SENSOR")
    @GeneratedValue
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "TXT_NAME")
    private String name;

    @Column(name = "TXT_TYPE")
    @Enumerated(EnumType.STRING)
    private SensorType type;

    @Column(name = "NUM_MIN_VALUE")
    private Double minValue;

    @Column(name = "NUM_MAX_VALUE")
    private Double maxValue;

    @Column(name = "TXT_UNIT")
    private String unit;

//    @ManyToMany(mappedBy = "sensors")
//    private Set<TelemetryProfileEntity> telemetries;

}
