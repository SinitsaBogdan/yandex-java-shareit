package ru.practicum.shareit.item.service;

import ru.practicum.shareit.item.dto.CommentDto;
import ru.practicum.shareit.item.dto.ItemDto;

import java.util.List;

public interface ItemService {

    List<ItemDto> getAllByUserId(Long userId);

    List<ItemDto> getBySearchText(String text);

    ItemDto getById(Long userId, Long itemId);

    ItemDto add(Long userId, ItemDto item);

    CommentDto addComment(Long userId, Long itemId, CommentDto commentDto);

    ItemDto update(Long userId, ItemDto item);
}
