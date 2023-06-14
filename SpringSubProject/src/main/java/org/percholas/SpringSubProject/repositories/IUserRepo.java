package org.percholas.SpringSubProject.repositories;
import org.percholas.SpringSubProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer> {

    // boolean existByEmail(String email);
    public User findFirstByEmail(String email);
}
