package application.shoplist.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
public class ListItem {

    @Id
    @Column
    @GeneratedValue
    @Getter
    @Setter
    private int id;


    @Column
    @Getter
    @Setter
    private String description;


    @ManyToOne
    @JoinColumn(name = "shop_list_id")
    @Getter
    @Setter
    private ShopList shopList;


}
