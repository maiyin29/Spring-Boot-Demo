package com.duyi.controller;


import com.duyi.model.Guest;
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

    private String path="";

    //@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String getList(Model model){
        List<Guest> guestList =guestService.getGuests();
        model.addAttribute("guestList",guestList);
        return "list";
    }


}

