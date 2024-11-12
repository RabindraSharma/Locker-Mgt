package com.translineindia.Locker.Mgt.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Locker_Types")
@Data
public class LockerType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "locker_type", nullable = false, length = 50)
    private String locker_type;
    @Column(name = "type_code", nullable = false, length = 10)
    private String type_code;
    @Column(name = "dimension", nullable = false, length = 55)
    private String dimension;
    @Column(name = "description", nullable = false, length = 255)
    private String description;

}
