package pl.maks.pizzaapplication.data.entity.pizza;


import pl.maks.pizzaapplication.data.entity.size.SizeEntity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="pizzas")
public class PizzaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name="name")
    private String name;

    //jedna pizza - wiele rozmiarow
    @OneToMany(mappedBy = "pizza", orphanRemoval = true)
    private Set<SizeEntity> sizes;

    public void setName(String name) {
        this.name = name;
    }
}
