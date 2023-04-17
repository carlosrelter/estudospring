package com.carlos.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.estudo.entities.User;

public interface UserRepository extends JpaRepository<User, Long >{

}
