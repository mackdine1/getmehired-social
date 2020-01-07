package com.example.getmehiredsocial.repository;

import com.example.getmehiredsocial.model.Address;
import com.example.getmehiredsocial.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

        public User getUser() {
            User user = new User ("Diana", new Address ("Edmonton", "Canada"), "123456");
            return user;
        }
}
