package br.com.raynerweb.ipl.sensor.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TB_TELEMETRY_PROFILE")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TelemetryProfileEntity {

    @Id
    @Column(name = "COD_TELEMETRY_PROFILE")
    @GeneratedValue
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "TXT_NAME")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "TB_TELEMETRY_PROFILE_SENSOR",
            joinColumns = @JoinColumn(name = "COD_TELEMETRY"),
            inverseJoinColumns = @JoinColumn(name = "COD_SENSOR"))
    private Set<SensorEntity> sensors;
}
