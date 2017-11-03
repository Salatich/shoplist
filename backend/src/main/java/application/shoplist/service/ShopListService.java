package application.shoplist.service;

import application.shoplist.entity.ShopList;

public interface ShopListService {

    void save(ShopList shopList);

    ShopList findShopListByName(String name);

    void delete(ShopList shopList);
}
