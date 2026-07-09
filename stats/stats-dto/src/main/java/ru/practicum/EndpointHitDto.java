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

    @NotBlank(message = "Идентификатор сервиса не заполнен")
    private String app;

    @NotBlank(message = "URI не заполнен")
    private String uri;

    @NotBlank(message = "IP адрес не заполнен")
    private String ip;

    @NotBlank(message = "Дату и время запроса не заполнена")
    private String timestamp;
}