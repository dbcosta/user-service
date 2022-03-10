package com.demo.userservice.resource;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class User {
    @Id
    private Integer id;
    private String name;
    private String emailId;
}
