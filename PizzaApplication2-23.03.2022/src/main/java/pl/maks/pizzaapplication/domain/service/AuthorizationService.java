package pl.maks.pizzaapplication.domain.service;

import pl.maks.pizzaapplication.domain.exception.UnauthorizedException;

public class AuthorizationService {

    public static void checkToken(String token){
        if(token == null || token.equals("xzv")){
            throw new UnauthorizedException("Błędny token");
        }
    }
}
