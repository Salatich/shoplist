package application.shoplist.service;

import application.shoplist.entity.ShopList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ShopListServiceImplTest {

    private ShopListService shopListService = Mockito.mock(ShopListService.class);

    @Test
    public void testCreateList(){
        ShopList list = new ShopList();
        shopListService.save(list);
        Mockito.verify(shopListService).save(list);
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
