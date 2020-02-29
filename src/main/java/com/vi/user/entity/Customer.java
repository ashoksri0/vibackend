package com.vi.user.entity;


import lombok.Data;

import javax.persistence.*;


@Entity
@Table(name = "customer")
@Data
public class Customer {

    private static final long serialVersionUID = -2343243243242432341L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;

}

