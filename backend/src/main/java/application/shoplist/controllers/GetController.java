package application.shoplist.controllers;

import application.shoplist.entity.ListItem;
import application.shoplist.entity.ShopList;
import application.shoplist.entity.User;
import application.shoplist.service.ListItemService;
import application.shoplist.service.ShopListService;
import application.shoplist.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;
import org.apache.catalina.ssi.ResponseIncludeWrapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/get")
public class GetController {

    private final UserService userService;
    private final ShopListService listService;
    private final ListItemService itemService;

    public GetController(UserService userService, ShopListService listService, ListItemService itemService) {
        this.userService = userService;
        this.listService = listService;
        this.itemService = itemService;
    }

    @RequestMapping(path = "/lists",
        method = RequestMethod.GET)
    public ResponseEntity<Object> getLists(){
        ArrayList<ShopList> lists = listService.getAll();
        return new ResponseEntity<>(lists,HttpStatus.OK);
    }

    @RequestMapping(path = "/user/{userLogin}",
            method = RequestMethod.GET)
    public ResponseEntity<Object> getUser(@PathVariable String userLogin) {
        User user = userService.findUserByLogin(userLogin);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/list/{listName}",
            method = RequestMethod.GET)
    public ResponseEntity<Object> getList(@PathVariable String listName) {
        ShopList list = listService.findShopListByName(listName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping(value = "/item/{listName}/{itemName}",
        method = RequestMethod.GET)
    public ResponseEntity<Object> getItemFromList(@PathVariable("listName") String listName, @PathVariable("itemName") String itemName){
        //ShopList list = listService.findShopListByName(listName);
        //ListItem item = itemService.findByDescriptionAndShopList(itemName,list);
        return new ResponseEntity<>(null,HttpStatus.OK);
    }
}
