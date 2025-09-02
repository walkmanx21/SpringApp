package ru.walkmanx21.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.walkmanx21.spring.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
