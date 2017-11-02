package application.shoplist.controllers;


import application.shoplist.entity.ShopList;
import application.shoplist.entity.User;
import application.shoplist.service.ShopListService;
import application.shoplist.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShopListController {

    private final UserService userService;
    private final ShopListService shopListService;

    public ShopListController(UserService userService, ShopListService shopListService) {
        this.userService = userService;
        this.shopListService = shopListService;
    }


    @RequestMapping(path = "/createUser",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        if (user.getLogin() == null || user.getPassword() == null) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        userService.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(path = "/createList",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public ResponseEntity<Object> createList(@RequestBody ShopList list){
        if(list.getItems() == null || list.getName() == null ){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
        shopListService.save(list);
        return new ResponseEntity<>(list,HttpStatus.OK);

    }

}
