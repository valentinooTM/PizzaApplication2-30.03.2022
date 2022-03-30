package pl.maks.pizzaapplication.remote.rest.api;

import jdk.jshell.Snippet;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.maks.pizzaapplication.domain.model.OrderStatusType;
import pl.maks.pizzaapplication.remote.rest.dto.request.AddOrderDto;
import pl.maks.pizzaapplication.remote.rest.dto.request.UpdateOrderDto;
import pl.maks.pizzaapplication.remote.rest.dto.response.OrdersColectionDto;
import pl.maks.pizzaapplication.remote.rest.dto.response.OrdersDto;
import pl.maks.pizzaapplication.remote.rest.dto.response.OrdersStatusDto;
import pl.maks.pizzaapplication.remote.rest.dto.response.TokenDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
@RequestMapping(value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderController {

    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto){

        return ResponseEntity.ok(null);
    }

    @GetMapping("/status/{token}")
    public ResponseEntity<OrdersStatusDto> getStatus(@PathVariable("token")String token){

        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrdersColectionDto> getOrder(@RequestParam("status") OrderStatusType orderStatusType){

        return ResponseEntity.ok(null);
    }

    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("order-id")Integer orderId,
                                            @RequestHeader("Access-Token")String token){
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{order-id}")
    public ResponseEntity<OrdersDto> updateOrder(@RequestHeader("Access-Token") String token,
                                                @PathVariable("order-id")Integer orderId,
                                                @RequestBody UpdateOrderDto updateOrderDto){
        return ResponseEntity.ok(null);
    }

}
