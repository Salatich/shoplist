package application.shoplist.controllers;

import application.shoplist.entity.ShopList;
import application.shoplist.entity.User;
import application.shoplist.service.ShopListService;
import application.shoplist.service.UserService;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delete")
public class DeleteController {

    private final UserService userService;
    private final ShopListService listService;

    public DeleteController(UserService userService, ShopListService listService){
        this.userService = userService;
        this.listService = listService;
    }

    @RequestMapping("/user")
    public ResponseEntity<Object> deleteUser(@RequestBody JsonNode login){
        User user = userService.findUserByLogin(login.findValue("login").asText());
        userService.delete(user);
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }

    @RequestMapping("/list")
    public ResponseEntity<Object> deleteList(@RequestBody JsonNode name){
        ShopList list = listService.findShopListByName(name.findValue("name").asText());
        listService.delete(list);
        return new ResponseEntity<>("ok",HttpStatus.OK);
    }
}
