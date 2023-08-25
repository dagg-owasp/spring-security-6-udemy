package org.owasp.spring_security.repositories;

import org.owasp.spring_security.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface CustomerRepository extends CrudRepository<CustomerEntity, BigInteger> {

    Optional <CustomerEntity> findByEmail (String email);



}
