package com.duyi.service;

import com.duyi.bean.Guest;
import com.duyi.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestDao guestDao;
    @Override
    public List<Guest> list() {
        return guestDao.list();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public void udate(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public Guest get(String name) {
        return guestDao.get(name);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }
}
