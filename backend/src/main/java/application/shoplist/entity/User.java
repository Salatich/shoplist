package application.shoplist.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "`user`")
public class User {

    @Id
    @Column
    @GeneratedValue
    @Getter
    @Setter
    private int id;

    @Column(unique = true)
    @Getter
    @Setter
    private String login;

    @Column
    @Getter
    @Setter
    private String password;

    @OneToMany
    @Setter
    @Getter
    private List<ShopList> shopLists;


}
