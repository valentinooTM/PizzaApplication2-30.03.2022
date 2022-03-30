package pl.maks.pizzaapplication.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.maks.pizzaapplication.remote.rest.dto.response.MenuDto;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;


@RequestMapping(value = "/api/v1/menu", produces = APPLICATION_JSON_VALUE)
@RestController
public class MenuCotroller {
    @GetMapping
    public ResponseEntity<MenuDto> getMenu(){
        return ResponseEntity.ok(null);
    }}


