package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by macbookair on 11/11/15.
 */
public interface UserRepository extends CrudRepository<User,Integer> {
    User findOneByName (String name);
}
