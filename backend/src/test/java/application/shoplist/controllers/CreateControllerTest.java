package application.shoplist.controllers;

import application.shoplist.dao.UserRepository;
import application.shoplist.entity.ListItem;
import application.shoplist.entity.ShopList;
import application.shoplist.entity.User;
import application.shoplist.service.ShopListService;
import application.shoplist.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CreateControllerTest {

    private static final String CREATE_USER_PATH = "/create/user";
    private static final String CREATE_LIST_PATH = "/create/list";

    private UserService userService = Mockito.mock(UserService.class);

    private ShopListService shopListService = Mockito.mock(ShopListService.class);

    private UserRepository userRepository = Mockito.mock(UserRepository.class);

    @Autowired
    WebApplicationContext context;

    private MockMvc mvc;

    @Before
    public void setup() {
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testCreateUser() throws Exception {
        User user = new User();
        user.setLogin("Aleksandr");
        user.setPassword("qwerty");
        ObjectMapper mapper = new ObjectMapper();
        String userAsString = mapper.writeValueAsString(user);
        mvc.perform(
                post(CREATE_USER_PATH)
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content(userAsString))
                .andExpect(status().isOk());
    }

    @Test
    public void testCreateEmptyUser() throws Exception {
        User user = new User();
        ObjectMapper mapper = new ObjectMapper();
        String userAsString = mapper.writeValueAsString(user);
        mvc.perform(
                post(CREATE_USER_PATH)
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content(userAsString))
                .andExpect(status().isNoContent());
    }

    @Test
    public void testCreateList() throws  Exception {
        ShopList list = new ShopList();
        list.setName("new list");
        List<ListItem> items = new ArrayList<>();
        items.add(new ListItem());
        list.setItems(items);
        ObjectMapper mapper = new ObjectMapper();
        String userAsString = mapper.writeValueAsString(list);
        mvc.perform(
                post(CREATE_LIST_PATH)
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content(userAsString))
                .andExpect(status().isOk());

    }

    @Test
    public void testCreateEmptyList() throws Exception {
        ShopList list = new ShopList();
        ObjectMapper mapper = new ObjectMapper();
        String listAsString = mapper.writeValueAsString(list);
        mvc.perform(
                post(CREATE_LIST_PATH)
                .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                .content(listAsString))
                .andExpect(status().isNoContent());

    }
}
