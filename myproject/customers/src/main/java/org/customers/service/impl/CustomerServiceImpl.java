package org.customers.service.impl;

import org.customers.repo.CustomerRepository;
import org.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("customerServiceImpl")
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerRepository customerRepo;
    
    public void addNewCustomer() {
        
    }
    
    public void updateCustomerDetails() {
        
    }
    
    public void getCustomerDetails() {
        System.out.println("CustomerServiceImpl getCustomerDetails");
    }
    
    public void deleteCustomerDetails() {
        
    }

}
