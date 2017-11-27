package application.shoplist.service;

import application.shoplist.entity.ShopList;

import java.util.ArrayList;

public interface ShopListService {

    void save(ShopList shopList);

    ShopList findShopListByName(String name);

    void delete(ShopList shopList);

    ArrayList<ShopList> getAll();
}
