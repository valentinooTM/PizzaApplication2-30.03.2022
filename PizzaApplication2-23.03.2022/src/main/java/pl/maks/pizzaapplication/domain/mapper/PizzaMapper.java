package pl.maks.pizzaapplication.domain.mapper;

import org.springframework.stereotype.Component;
import pl.maks.pizzaapplication.data.entity.pizza.PizzaEntity;
import pl.maks.pizzaapplication.remote.rest.dto.request.AddPizzaDto;

@Component
public class PizzaMapper {

    public PizzaEntity mapToPizzaEntity(AddPizzaDto addPizzaDto){
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        return pizzaEntity;
    }
}
