package com.demo.controller;

import com.demo.model.Hobbit;
import com.demo.service.HobbitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbitController {

//    1. Glue HobbitController and HobbitService [@AUTOWIRED] so we can call HobbitService methods
//    2. Implement List<Hobbit> getAll() using HobbitService
    @Autowired
    private HobbitService hobbitService;
    @GetMapping("/hobbits")
    public List<Hobbit> getAll(){
        return hobbitService.getAll();
    }

    @PostMapping("/hobbits")
    public Hobbit post(@RequestBody Hobbit hobbit){
        return hobbitService.save(hobbit);
    }
}
    /*
    @RestController + @GetMapping superpower:
1. This class will be managed by Spring (Spring bean)
2. a java method in this class (@GetMapping) can:
- be called by a browser and - return some data in {JSON}

end point method can be defined in this class^^

The @RestController annotation is a convenience syntax for @Controller and @ResponseBody together.
This indicates that the class is a controller, and that all the methods in the marked class will return a JSON response.

@GetMapping(value = "/path") - an abbreviated form of @RequestMapping specifically for HTTP GET requests,
which only takes an optional value argument, no method argument. The Read in CRUD.

@Autowired: very important annotation -
we apply it to property fields, setter methods, and/or constructors.
It tells Spring 'automatically inject the appropriate dependency here'.
the process of placing an instance of one bean into the specified field in an instance of another bean.
     */


