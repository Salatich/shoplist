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
@RequestMapping("/get")
public class GetController {

    private final UserService userService;
    private final ShopListService listService;

    public GetController(UserService userService, ShopListService listService){
        this.userService = userService;
        this.listService = listService;
    }

    @RequestMapping("/user")
    public ResponseEntity<Object> getUser(@RequestBody JsonNode login){
        User user = userService.findUserByLogin(login.findValue("login").asText());
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping("/list")
    public ResponseEntity<Object> getList(@RequestBody JsonNode name){
        ShopList list = listService.findShopListByName(name.findValue("name").asText());
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
