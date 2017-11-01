package application.shoplist.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class ShopList {

    @Id
    @Column
    @GeneratedValue
    @Getter
    @Setter
    private int id;


    @Column
    @Getter
    @Setter
    private String name;

    @OneToMany
    @Getter
    @Setter
    private List<ListItem> items;

    @ManyToOne
    @JoinColumn(name="user_id")
    @Getter
    @Setter
    private User user;

}
