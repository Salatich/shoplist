package application.shoplist.service;

import application.shoplist.entity.ListItem;
import application.shoplist.entity.ShopList;

public interface ListItemService {
    void save(ListItem item);

    void delete(ListItem item);
}
