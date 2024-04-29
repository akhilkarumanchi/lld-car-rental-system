package com.example.lldcarrentalsystem.entities.userEntities;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter
@Setter
public abstract class Account {
    private Long id ;
    private String userName;
    private String emailAddress ;
    private String password ;
    private LocalDateTime lastAccessDate;
    private Contact contact;
}