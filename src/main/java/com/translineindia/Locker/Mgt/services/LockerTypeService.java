package com.translineindia.Locker.Mgt.services;

import com.translineindia.Locker.Mgt.entities.LockerType;
import com.translineindia.Locker.Mgt.repositories.LockerTypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LockerTypeService {
    @Autowired
    private LockerTypeRepo lockerTypeRepo;
// create locker
    public LockerType createLocker(LockerType lockerType) {
        return lockerTypeRepo.save(lockerType);
    }

//  GET all locker types
    public ArrayList<LockerType> getAllLockers() {
        return (ArrayList<LockerType>) lockerTypeRepo.findAll();
    }
}
