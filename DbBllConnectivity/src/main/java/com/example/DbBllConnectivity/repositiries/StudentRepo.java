package com.example.DbBllConnectivity.repositiries;

import com.example.DbBllConnectivity.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    public Student findByName(String Name);

}
