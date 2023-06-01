package com.izelozarslan.akbankbootcamp.dao;

import com.izelozarslan.akbankbootcamp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    /**
     * select * from customer where username = "izel";
     */

    Customer findByUsername(String username);

    /**
     * select * from customer where name = "izel" ans surname = "özarslan";
     */
    Customer findByNameAndSurname(String name, String surname);

    /**
     * select * from customer where id between 18 and 34
     */
    List<Customer> findAllByIdBetween(Long first, Long last);

    /**
     * select * from customer where id  > 18
     */
    List<Customer> findAllByIdGreaterThan(Long id);

    /**
     * select * from customer where id  > 18
     */
    List<Customer> findAllByIdGreaterThanEqual(Long id);
}
