package com.springboot.webservices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.webservices.entities.Order;
import com.springboot.webservices.repositories.OrderRepository;

@Service
public class OrderServices {

  @Autowired
  private OrderRepository repository;

  public List<Order> findAll() {
    return repository.findAll();
  }


  public Order findById(Long id){
    Optional<Order> obj = repository.findById(id);
    return obj.get();
  }




  
}
