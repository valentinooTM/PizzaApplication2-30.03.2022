package pl.maks.pizzaapplication.domain.service;


import org.springframework.stereotype.Service;
import pl.maks.pizzaapplication.data.entity.pizza.PizzaEntity;
import pl.maks.pizzaapplication.data.repository.PizzaRepository;
import pl.maks.pizzaapplication.domain.mapper.PizzaMapper;
import pl.maks.pizzaapplication.remote.rest.dto.request.AddPizzaDto;
import pl.maks.pizzaapplication.remote.rest.dto.response.PizzaDto;

import static pl.maks.pizzaapplication.domain.service.AuthorizationService.checkToken;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final SizeRepository sizeRepository;
    private final PizzaMapper pizzaMapper;
    private final SizeMapper sizeMapper;

    public PizzaService(PizzaRepository pizzaRepository,SizeRepository sizeRepository,
                        PizzaMapper pizzaMapper, SizeMapper sizeMapper;) {
        this.pizzaRepository = pizzaRepository;
        this.sizeRepository = sizeRepository
        this.pizzaMapper = pizzaMapper;
        this.sizeMapper = sizeMapper;
    }

    public PizzaDto addPizza(AddPizzaDto addPizzaDto, String token){

        //AuthorizationService.checkToken(token);
        checkToken(token);
        /*if(token == null || token.equals("xzv")){
            throw new UnauthorizedException("Błędny token");
        }*/

        //Wpisujemy nazwe pizzy do bazy danych

        //PizzaEntity pizzaEntity = pizzaMapper.mapToPizzaEntity(addPizzaDto);
        pizzaRepository.save(pizzaMapper.mapToPizzaEntity(addPizzaDto));

        /*PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        PizzaEntity savedPizzaEntity = pizzaRepository.save(pizzaEntity);*/


        //wpisujemy liste rozmiar+cena do bazy danych
        List<AddSizeDto> addSizeDtoList = addPizzaDto.getAddSizeDtoList();
        List<SizeEntity> sizeEntities = addSizeDtoList
                .stream()
                .map(addSizeDto -> sizeMapper.mapToSizeEntity(addSizeDto, pizzaEntity.getId()))
                        .collect(Collectors.toList());
        sizeRepository.saveAll(sizeEntities);

        List<SizeDto> sizeDtoList = sizeEntities;
        .stream()
                .map(sizeEntity -> sizeMapper.mapToSizeDto(sizeEntity))
                .collect(Collectors.toList());
        List<SizeDto> sizeDtoList = sizeEntities.stream().map(sizeMapper::mapToSizeDto).collect(Collectors.toList());

        /*List<AddSizeDto> addSizeDtoList = addPizzaDto.getAddSizeDtoList();
        List<SizeEntity> sizeEntities = addSizeDtoList
        .stream()
        .map(addSizeDto -> {
            SizeEntity sizeEntity = new SizeEntity();
            sizeEntity.setSizeType(sizeDto.getSize().name());
            sizeEntity.setPriceBase(sizeDto.getPrice());
            sizeEntity.setId(sizeDto.getId());
            sizeEntity.setPizzaId(savedPizzaEntity.getId());
            return sizeEntity;
        }).collect(Collectors.toList());
        PizzaEnity savedSizeEntity = sizeRepository.saveAll(sizeEntity);*/
    }
}


