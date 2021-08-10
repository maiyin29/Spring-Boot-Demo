package com.duyi.service;


import com.duyi.model.Guest;
import com.duyi.repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {
    @Autowired
    private GuestRepository repository;
    @Override
    public List<Guest> getGuests() {
        return null;
    }
}
