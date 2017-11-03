package application.shoplist.service.impl;

import application.shoplist.dao.ShopListRepository;
import application.shoplist.entity.ListItem;
import application.shoplist.entity.ShopList;
import application.shoplist.service.ShopListService;
import com.jcabi.aspects.Loggable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@Loggable(value = Loggable.DEBUG, prepend = true, trim = false)
public class ShopListServiceImpl implements ShopListService {

    private static final Logger logger = LoggerFactory.getLogger(ShopListService.class);
    private final ShopListRepository shopListRepository;

    public ShopListServiceImpl(ShopListRepository shopListRepository) {
        this.shopListRepository = shopListRepository;
    }

    @Override
    public void save(ShopList shopList) {
        shopListRepository.save(shopList);
    }

    @Override
    public ShopList findShopListByName(String name) {
        return shopListRepository.findShopListByName(name);
    }

    @Override
    public void delete(ShopList shopList) {
        shopListRepository.delete(shopList);
    }
}
