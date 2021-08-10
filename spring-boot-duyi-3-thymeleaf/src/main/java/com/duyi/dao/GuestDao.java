package com.duyi.dao;

import com.duyi.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {


    static List<Guest> guestList=new ArrayList<>();
    static {
        guestList.add(new Guest("张起灵","店长"));
        guestList.add(new Guest("吴邪","财务"));
        guestList.add(new Guest("胖子","总厨"));
        guestList.add(new Guest("解雨臣","经理"));
        guestList.add(new Guest("黑瞎子","前台"));
    }

    public List<Guest> list(){
        return guestList;
    }

    public void add(Guest guest){
        guestList.add(guest);
    }

    public void update(Guest newGuest){
        Guest oldGuest=get(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());
    }

    public Guest get(String name){
        for (Guest guest:guestList){
            if (guest.getName().equals(name)){
                return guest;
            }
        }
        return new Guest("","");
    }
    public void delete(String name){
        guestList.remove(get(name));
    }

}
