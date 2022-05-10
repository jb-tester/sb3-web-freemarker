package com.mytests.spring.boot3.test.data.namedQueries;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * *
 * <p>Created by irina on 5/3/2022.</p>
 * <p>Project: sb3-web-freemarker</p>
 * *
 */
public interface ContactsRepo extends CrudRepository<Contact,Integer> {

    List<String> qwe1(String lastName);

    List<String> nativeQwe1( String firstName);

    @Query("select d from Contact d where d.email like concat('%',COALESCE(:foo, d.lastname),'%')")
    List<Contact> query12(@Param("foo") String foo);
}
