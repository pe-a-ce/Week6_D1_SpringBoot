package com.demo.repository;

import com.demo.model.Hobbit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HobbitRepository extends JpaRepository<Hobbit, Long> {

/*

extends JpaRepository<T,ID> superpower:
Super easy access to a database in hobbit service layer.
uses ORM (Hibernate) under the hood

will call upon a database

extends an empty interface repository that directly/indirectly extends the 'Repository' interface
T - Entity class Type (what we wrote after @Entity public class "Hobbit"
ID - what we wrote after @ID private "Long", the primary key
 */
}
