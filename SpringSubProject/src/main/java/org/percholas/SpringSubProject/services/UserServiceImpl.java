package org.percholas.SpringSubProject.services;

import org.percholas.SpringSubProject.model.User;
import org.percholas.SpringSubProject.repositories.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public boolean checkIfEmailExist(String email) {
        User user = userRepo.findFirstByEmail(email);
        if (user!=null) {
            return true;
        }
        else {
            return false;
        }
    }
}
