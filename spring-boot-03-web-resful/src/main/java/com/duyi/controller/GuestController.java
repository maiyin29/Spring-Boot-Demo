package com.duyi.controller;

import com.duyi.bean.Guest;
import com.duyi.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String list(Model model){
        List<Guest> guestList =guestService.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }
    @GetMapping("/toAdd")
    public String toAdd(Model model){
        return "add";

    }
    @PostMapping
    public String add(Guest guest){
        guestService.add(guest);
        return "redirect:/guest";

    }

    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest=guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";

    }
    @PutMapping
    public String update(Guest guest){
        guestService.udate(guest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestService.delete(name);
        return "redirect:/guest";

    }

}

