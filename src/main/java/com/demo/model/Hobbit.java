package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
       @Entity+@Id superpower:
       -maps java Class to a Database table
       -maps an object to a table row

        */
    @Entity
//    The @Entity annotation specifies that the class is an entity and is mapped to a database table.
    public class Hobbit {

//        The database engine will automatically put the next available value for you.
   @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        private Long Id;
//        The @Id annotation specifies the primary key of an entity
        private String name;
        private String lastName;

        public Hobbit(){}
//    no arg constructor
//    often used by the libraries i.e Hibernate

    public Hobbit(Long id, String name, String lastName) {
            Id = id;
            this.name = name;
            this.lastName = lastName;
//            normal constructors
        }

//      Getters and Setters
        public Long getId() {
            return Id;
        }

        public void setId(Long id) {
            Id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

    }
/*
Applying the @Entity annotation to a class with JPA
declares that the class definition will correspond to a database table with a similar name.

The @Id annotation can be applied to a member of a class
to designate that this member will uniquely identify the entity in the database.

The @GeneratedValue annotation can be used with parameters alongside @Id to designate
how an entity’s unique ID value will be generated.
If no parameters are provided, the ID will be generated according to the default algorithm used by the underlying database.

 To remember:
           Main Class --> @Entity
           Controller --> @RestController
           Service --> @Service
           Repository --> extends CrudRepository<T,ID>
 */