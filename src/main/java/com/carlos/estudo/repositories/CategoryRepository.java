package com.carlos.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.estudo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long >{

}
