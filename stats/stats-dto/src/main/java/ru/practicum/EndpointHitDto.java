package ru.practicum;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EndpointHitDto {

    @NotBlank(message = "Идентификатор сервиса должен быть заполнен")
    private String app;

    @NotBlank(message = "URI должен быть заполнен")
    private String uri;

    @NotBlank(message = "IP адрес должен быть заполнен")
    private String ip;

    @NotBlank(message = "Дата и время запроса должна быть заполнен")
    private String timestamp;
}