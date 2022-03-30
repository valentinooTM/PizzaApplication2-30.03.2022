package pl.maks.pizzaapplication.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.maks.pizzaapplication.data.entity.pizza.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer> {
}
