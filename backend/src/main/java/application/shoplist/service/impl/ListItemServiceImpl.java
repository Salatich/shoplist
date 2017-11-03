package application.shoplist.service.impl;

import application.shoplist.dao.ListItemRepository;
import application.shoplist.entity.ListItem;
import application.shoplist.entity.ShopList;
import application.shoplist.service.ListItemService;
import com.jcabi.aspects.Loggable;
import org.springframework.stereotype.Service;

@Service
@Loggable(value = Loggable.DEBUG, prepend = true, trim = false)
public class ListItemServiceImpl implements ListItemService {

    private final ListItemRepository itemRepository;

    public ListItemServiceImpl(ListItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @Override
    public void save(ListItem item) {

    }

    @Override
    public void delete(ListItem item) {

    }
}
