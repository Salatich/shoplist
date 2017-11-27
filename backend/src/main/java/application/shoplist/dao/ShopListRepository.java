package application.shoplist.dao;

import application.shoplist.entity.ShopList;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ShopListRepository extends CrudRepository<ShopList,Integer> {

     ShopList findShopListByName(String name);

     ArrayList<ShopList> findAll();


}
