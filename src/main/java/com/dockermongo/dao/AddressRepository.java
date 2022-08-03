package com.dockermongo.dao;

import com.dockermongo.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AddressRepository extends MongoRepository<Address,Integer> {
}
