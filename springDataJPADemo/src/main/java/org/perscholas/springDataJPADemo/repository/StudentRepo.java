package org.perscholas.springDataJPADemo.repository;

import org.perscholas.springDataJPADemo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepo extends JpaRepository<Student, Integer> {

    public Student findByName( String name);

}
