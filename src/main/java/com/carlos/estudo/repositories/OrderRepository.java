package com.carlos.estudo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlos.estudo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long >{

}
