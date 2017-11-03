package application.shoplist.dao;

import application.shoplist.entity.ShopList;
import org.springframework.data.repository.CrudRepository;

public interface ShopListRepository extends CrudRepository<ShopList,Integer> {

    public ShopList findShopListByName(String name);

}
