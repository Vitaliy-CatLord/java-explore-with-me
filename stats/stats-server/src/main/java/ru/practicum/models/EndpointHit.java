package ru.practicum.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "endpoint_hits")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EndpointHit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "app", nullable = false)
    String app;

    @Column(name = "uri", nullable = false, length = 512)
    String uri;

    @Column(name = "ip", nullable = false, length = 45)
    String ip;

    @Column(name = "timestamp", nullable = false)
    LocalDateTime timestamp;
}
