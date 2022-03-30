package pl.maks.pizzaapplication.remote.rest.dto.response;

import pl.maks.pizzaapplication.domain.model.OrderStatusType;
import pl.maks.pizzaapplication.remote.rest.dto.request.PersonOrderDto;
import pl.maks.pizzaapplication.remote.rest.dto.request.PizzaOrderDto;

import java.util.List;

public class OrdersDto {
    private Integer id;
    private OrderStatusType status;
    private List<PizzaOrderDto> pizzas;
    private PersonOrderDto person;


    public OrdersDto (Integer id, OrderStatusType status,
                      List<PizzaOrderDto> pizzas,
                      PersonOrderDto person)
    {
        this.id = id;
        this.status = status;
        this.pizzas = pizzas;
        this.person = person;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public OrderStatusType getStatus() {return status;}

    public void setStatus(OrderStatusType status) {this.status = status;}

    public List<PizzaOrderDto> getPizzas() {return pizzas;}

    public void setPizzas(List<PizzaOrderDto> pizzas) {this.pizzas = pizzas;}

    public PersonOrderDto getPerson() {return person;}

    public void setPerson(PersonOrderDto person) {this.person = person;}
}

