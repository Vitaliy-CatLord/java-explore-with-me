package ru.practicum.compilation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NewCompilationDto {

    @Builder.Default
    List<Long> events = new ArrayList<>();

    @Builder.Default
    Boolean pinned = false;

    @NotBlank(message = "Заголовок подборки должен быть заполнен")
    @Size(min = 1, max = 50, message = "Заголовок подборки должен быть от 1 до 50 символов")
    String title;
}
