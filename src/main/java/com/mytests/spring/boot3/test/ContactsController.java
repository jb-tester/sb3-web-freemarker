package com.mytests.spring.boot3.test;

import com.mytests.spring.boot3.test.data.namedQueries.ContactsRepo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * *
 * <p>Created by irina on 5/3/2022.</p>
 * <p>Project: demo</p>
 * *
 */
@Controller
@RequestMapping("/contacts")
public class ContactsController {

    @Resource(name = "contactsRepo")
    ContactsRepo repo;

    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("home_attr1", "hello");
        return "home";  // no navigation to view
    }

    @RequestMapping("/test")
    public String test(ModelMap model) {
        model.addAttribute("test_attr1", repo.qwe1("ivanov").get(0));
        model.addAttribute("test_attr2", repo.nativeQwe1("lena").get(0));
        model.addAttribute("test_attr3", repo.query12("ai"));
        return "test"; // no navigation to view
    }
}
