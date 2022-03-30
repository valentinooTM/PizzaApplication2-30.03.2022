package pl.maks.pizzaapplication.domain.mapper;

import org.springframework.stereotype.Component;
import pl.maks.pizzaapplication.data.entity.size.SizeEntity;
import pl.maks.pizzaapplication.domain.model.SizeType;
import pl.maks.pizzaapplication.remote.rest.dto.request.AddSizeDto;
import pl.maks.pizzaapplication.remote.rest.dto.response.SizeDto;

@Component
public class SizeMapper {
    public SizeEntity mapToSizeEntity(AddSizeDto addSizeDto, Integer pizzaId){
        SizeEntity sizeEntity = new SizeEntity();
        sizeEntity.setSizeType(addSizeDto.getSize().name());
        sizeEntity.setPriceBase(addSizeDto.getPrice());
        sizeEntity.setPizzaId(pizzaId);
        return sizeEntity;
    }

//    public mapToSizeDto(SizeEntity sizeEntity){
//        SizeDto sizeDto = new SizeDto();
//        sizeDto.setSize(SizeType.valueOf(sizeEntity().getSizeType()));
//
//
//        return sizeDto;
//    });
//    }
}
