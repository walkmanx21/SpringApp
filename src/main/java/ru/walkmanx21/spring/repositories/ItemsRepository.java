package ru.walkmanx21.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.walkmanx21.spring.models.Item;
import ru.walkmanx21.spring.models.Person;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {
    List<Item> findByName(String itemName);

    List<Item> findByOwner(Person owner);
}
