package application.shoplist.controllers;

import application.shoplist.entity.ShopList;
import application.shoplist.entity.User;
import application.shoplist.service.ShopListService;
import application.shoplist.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/create")
public class CreateController {

    private final UserService userService;
    private final ShopListService shopListService;

    public CreateController(UserService userService, ShopListService shopListService) {
        this.userService = userService;
        this.shopListService = shopListService;
    }

    @RequestMapping(path = "/user",
            method = RequestMethod.POST)
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        if (user.getLogin() == null || user.getPassword() == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/list",
            method = RequestMethod.POST)
    public ResponseEntity<Object> createList(@RequestBody ShopList list) {
        if (list.getItems() == null || list.getName() == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        shopListService.save(list);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
