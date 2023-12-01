package com.example.backend.services;

import com.example.backend.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CurtomerService{
    List<Customer> getAllCurtomer();

    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long id);

    Customer updateCustomer(Customer customer);

    void deleteStudentById(Long id);
}
