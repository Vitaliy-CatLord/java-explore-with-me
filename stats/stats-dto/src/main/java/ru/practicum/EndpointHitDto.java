package ru.practicum;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EndpointHitDto {

    @NotBlank(message = "Идентификатор сервиса не заполнен")
    String app;

    @NotBlank(message = "URI не заполнен")
    String uri;

    @NotBlank(message = "IP адрес не заполнен")
    String ip;

    @NotBlank(message = "Дату и время запроса не заполнена")
    String timestamp;
}