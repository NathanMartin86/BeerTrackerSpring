package com.theironyard;

import javax.persistence.*;
import java.util.List;

/**
 * Created by macbookair on 11/11/15.
 */
@Entity
@Table (name = "users")
public class User {                 //USER IS ACTUALLY A KEYWORD SO YOU CAN'T MAKE A TABLE CALLED USER!!!
    @Id
    @GeneratedValue
    Integer id;

    String name;
    @OneToMany(mappedBy = "user") // this is the name of the field in the BEER class
    List<Beer> beers;
}
