package ru.practicum.shareit.booking.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import ru.practicum.shareit.item.model.Item;
import ru.practicum.shareit.user.model.User;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * TODO Sprint add-bookings.
 */

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookingDto {

    @NotNull
    private LocalDateTime start;

    @NotNull
    private LocalDateTime end;

    private Long itemId;
}
