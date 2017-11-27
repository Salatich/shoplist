package application.shoplist.service;

import application.shoplist.entity.ShopList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.logging.Logger;



public class ShopListServiceImplTest {

    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(ShopListServiceImplTest.class);

    private ShopListService shopListService = Mockito.mock(ShopListService.class);

    @Test
    public void testCreateList(){
        LOG.info("*********************TEST*************************");
        ShopList list = new ShopList();
        shopListService.save(list);
        Mockito.verify(shopListService).save(list);
        LOG.info("************************END TESTING************************************");
    }

    @Test
    public void testFindShopListByName(){
        ShopList list = new ShopList();
        String name = "newList";
        list.setName("newList");
        Mockito.when(shopListService.findShopListByName(name)).thenReturn(list);
    }

    @Test
    public void deleteShopList(){
        ShopList list = new ShopList();
        shopListService.save(list);
        shopListService.delete(list);
        Mockito.verify(shopListService).delete(list);
    }

}
