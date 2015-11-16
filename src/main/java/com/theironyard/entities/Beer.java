package com.theironyard.entities;
import javax.persistence.*;

/**
 * Created by macbookair on 11/10/15.
 */
@Entity
public class Beer {
    @Id
    @GeneratedValue
    @Column(nullable = false) // this sets it so that it can't be null, ever.
    int id;                   // keeps jink data from getting in your database.

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public String type;

    @Column(nullable = false)
    public Integer calories;

    @ManyToOne
    public User user;
}
