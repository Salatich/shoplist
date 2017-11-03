package application.shoplist.controllers;

import application.shoplist.entity.ShopList;
import application.shoplist.entity.User;
import application.shoplist.service.ShopListService;
import application.shoplist.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delete")
public class DeleteController {

    private final UserService userService;
    private final ShopListService listService;

    public DeleteController(UserService userService, ShopListService listService) {
        this.userService = userService;
        this.listService = listService;
    }

    @RequestMapping(path = "/user/{userLogin}",
            method = RequestMethod.GET)
    public ResponseEntity<Object> deleteUser(@PathVariable String userLogin) {
        User user = userService.findUserByLogin(userLogin);
        userService.delete(user);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @RequestMapping(path = "/list/{listName}",
            method = RequestMethod.GET)
    public ResponseEntity<Object> deleteList(@PathVariable String listName) {
        ShopList list = listService.findShopListByName(listName);
        listService.delete(list);
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @RequestMapping(path = "/item",
            method = RequestMethod.GET)
    public ResponseEntity<Object> deleteItemFromList() {
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
