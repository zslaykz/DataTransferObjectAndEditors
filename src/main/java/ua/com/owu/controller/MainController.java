package ua.com.owu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ua.com.owu.dto.UserProductDTO;
import ua.com.owu.entity.Product;
import ua.com.owu.entity.User;
import ua.com.owu.service.UserService;

import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.List;

@Controller

public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private PropertyEditor productEditor;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("user", new User());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("user") User user){
        userService.save(user);
        return "index";
    }

    @GetMapping("/userPage")
    public String userPage(Model model){
        List<User> users = userService.findAll();
        List<UserProductDTO> dtos = new ArrayList<>();
        for (User user : users){
            UserProductDTO dto = new UserProductDTO();
            dto.setIdUser(user.getId());
            dto.setName(user.getName());
            dto.setName(user.getName());
            dto.setIdProduct(user.getProduct().getId());
            dto.setPName(user.getProduct().getPName());
            dto.setPType(user.getProduct().getPName());
            dtos.add(dto);
        }
        
       /* model.addAttribute("users",userService.findAll());*/
        return "users";
    }
    @InitBinder
    public void bind(WebDataBinder binder){
        binder.registerCustomEditor(Product.class,productEditor);
    }
}
