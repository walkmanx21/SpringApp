package ru.walkmanx21.spring.repositories;

import org.springframework.stereotype.Repository;
import ru.walkmanx21.spring.models.Item;
import ru.walkmanx21.spring.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository {
    List<Item> findByItemName(String itemName);

    List<Item> findByOwner(Person owner);
}
