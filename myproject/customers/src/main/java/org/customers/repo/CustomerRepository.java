package org.customers.repo;

import java.util.List;

import org.customers.domain.dao.CustomerDao;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerDao, String> {
 
    public void delete(CustomerDao deleted);
 
    public List<CustomerDao> findAll();
 
    public CustomerDao findOne(String id);
 
    public CustomerDao save(CustomerDao saved);
}
