package com.toibaonguyen.school_management.persistence_layer.repositories;

import com.toibaonguyen.school_management.persistence_layer.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {

}
