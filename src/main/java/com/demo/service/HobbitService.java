package com.demo.service;

import com.demo.model.Hobbit;
import com.demo.repository.HobbitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HobbitService {
//    HobbitService -> 'business layer'

//    1. Glue HobbitService and HobbitRepository
//    2. Implement List<Hobbit> getAll() using HobbitRepository
    @Autowired
    private HobbitRepository hobbitRepository;
    public List<Hobbit> getAll(){
        return hobbitRepository.findAll();
    }

    public Hobbit save(Hobbit hobbit){
//        save method created for use in controller class
//        only the repository layer saves this to the database
        return hobbitRepository.save(hobbit);
    }
}
    /*

@Service superpower:
This class will be managed by Spring (Spring bean)

@Service annotation is a specialised form of @controller.
It marks a class that performs a service to clients of our web app,
in the service layer of our business logic.

@Autowired
we created s field of interface type "Hobbit Repository" we can access all the methods in the repo
that extends
Glues different classes together

     */
