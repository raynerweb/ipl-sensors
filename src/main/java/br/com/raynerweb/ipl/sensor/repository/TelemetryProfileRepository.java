package br.com.raynerweb.ipl.sensor.repository;

import br.com.raynerweb.ipl.sensor.entity.TelemetryProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TelemetryProfileRepository extends JpaRepository<TelemetryProfileEntity, UUID> {
}
