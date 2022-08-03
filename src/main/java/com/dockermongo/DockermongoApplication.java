package com.dockermongo;

import com.dockermongo.dao.AddressRepository;
import com.dockermongo.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@SpringBootApplication
@RestController
@RequestMapping("/address")
public class DockermongoApplication {

	@Autowired
	private AddressRepository repository;

	@PostMapping
	public Address saveAddress(@RequestBody Address address){
		return repository.save(address);
	}

	@GetMapping
	public List<Address> getAddress(){
		return repository.findAll();
	}




	public static void main(String[] args) {
		SpringApplication.run(DockermongoApplication.class, args);
	}

}
