package pl.maks.pizzaapplication.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.maks.pizzaapplication.data.entity.size.SizeEntity;

import java.util.Set;

public interface SizeRepository extends JpaRepository<SizeEntity, Integer> {
    void deleteAllByPizzaId(Integer pizzaId);

    boolean existsAllByIdIn(Set<Integer> ids);
}
