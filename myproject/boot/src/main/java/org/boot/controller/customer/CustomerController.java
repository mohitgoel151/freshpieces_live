package org.boot.controller.customer;

import org.customers.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan({"org.customers.service", "org.customers.repo"})
@RestController
@RequestMapping("customer/")
public class CustomerController {
    
    @Autowired
    private CustomerService customerServiceImpl;
    
    public CustomerController() {
        System.out.println("CustomerController cons");
    }
    
    @RequestMapping(value = "id/{id}", method = RequestMethod.GET)
    public void getProductById(@PathVariable("id") String id) {
        customerServiceImpl.getCustomerDetails();
        //return prod;
    }

}
