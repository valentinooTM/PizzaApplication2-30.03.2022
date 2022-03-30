package pl.maks.pizzaapplication.remote.rest.dto.response;

import java.util.List;

public class OrdersColectionDto {
    private List<OrdersDto> orders;

    public List<OrdersDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrdersDto> orders) {
        this.orders = orders;
    }
}

