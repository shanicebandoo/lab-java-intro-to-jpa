package com.ironhack.lab_intro_to_jpa;// CustomerRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    // Custom queries can be added here if needed
}

