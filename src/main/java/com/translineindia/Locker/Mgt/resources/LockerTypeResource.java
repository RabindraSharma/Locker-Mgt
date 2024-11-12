package com.translineindia.Locker.Mgt.resources;

import com.translineindia.Locker.Mgt.entities.LockerType;
import com.translineindia.Locker.Mgt.services.LockerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/lockers")
public class LockerTypeResource {
    @Autowired
    LockerTypeService lockerTypeService;
    @PostMapping("/create")
    public ResponseEntity<LockerType> createLocker(@RequestBody LockerType lockerType){
        LockerType lockerType1 = lockerTypeService.createLocker(lockerType);
        return  new ResponseEntity<>(lockerType1, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<ArrayList<LockerType>> getAllLockers(){
        ArrayList<LockerType> allLockers = lockerTypeService.getAllLockers();
        return ResponseEntity.ok(allLockers);
    }
}
