package application.shoplist.dao;

import application.shoplist.entity.ListItem;
import org.springframework.data.repository.CrudRepository;


public interface ListItemRepository extends CrudRepository<ListItem,Integer> {
}
