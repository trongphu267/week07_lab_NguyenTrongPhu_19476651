package com.example.backend.impl;

import com.example.backend.models.Customer;
import com.example.backend.reponsitories.CustomerReponsitory;
import com.example.backend.services.CurtomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurtomerServiceImpl implements CurtomerService {
    private CustomerReponsitory curtomerRepon;
    public CurtomerServiceImpl(CustomerReponsitory curtomerRepon){
        this.curtomerRepon = curtomerRepon;
    }

    @Override
    public List<Customer> getAllCurtomer() {
        return curtomerRepon.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return curtomerRepon.save(customer);

    }

    @Override
    public Customer getCustomerById(Long id) {
        return curtomerRepon.findById(id).get();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return curtomerRepon.save(customer);
    }

    @Override
    public void deleteStudentById(Long id) {
        curtomerRepon.deleteById(id);
    }

}
