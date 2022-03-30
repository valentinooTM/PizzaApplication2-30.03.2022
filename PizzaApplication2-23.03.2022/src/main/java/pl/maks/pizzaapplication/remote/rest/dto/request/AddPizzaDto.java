package pl.maks.pizzaapplication.remote.rest.dto.request;

public class AddPizzaDto {
    private String name;
    private List<AddSizeDto> addSizeDtoList;

    public AddPizzaDto(String name, List<AddSizeDto> addSizes) {
        this.name = name;
        addSizeDtoList = addsizes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AddSizeDto> getAddSizeDtoList() {
        return addSizeDtoList;
    }

    public void setAddSizeDtoList(List<AddSizeDto> addSizeDtoList) {
        this.addSizeDtoList = addSizeDtoList;
    }
}
