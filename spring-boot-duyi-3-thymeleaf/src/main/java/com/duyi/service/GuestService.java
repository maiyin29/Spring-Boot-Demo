package com.duyi.service;

import com.duyi.bean.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> list();
    void add(Guest guest);
    void udate(Guest guest);
    Guest get(String name);
    void delete(String name);
}
