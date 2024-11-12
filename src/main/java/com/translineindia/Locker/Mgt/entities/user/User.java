package com.translineindia.Locker.Mgt.entities.user;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "cmp_cd", nullable = false, length = 10)
    private String cmp_cd;
    @Column(name = "uLogin_id", nullable = true, length = 30)
    private String uLogin_id;
    @Column(name = "off_cd", nullable = true, length = 20)
    private String off_cd;
    @Column(name = "usr_id", length = 50, unique = true, nullable = false)
    private String usr_id;
    @Column(name = "pwd", nullable = false, length = 30)
    private String pwd;
    @Column(name = "user_name", nullable = true, length = 60)
    private String user_name;
    @Column(name = "user_type", nullable = false, length = 1)
    private String user_type;
}
