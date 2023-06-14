package org.percholas.SpringSubProject.services;

import org.percholas.SpringSubProject.model.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

     User createUser(User user);

     boolean checkIfEmailExist(String email);
}
