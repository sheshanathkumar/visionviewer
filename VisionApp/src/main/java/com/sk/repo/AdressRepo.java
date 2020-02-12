package com.sk.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sk.model.Address;

public interface AdressRepo extends JpaRepository<Address, Integer> {
	
	List<Address> findByAddressid (Integer id);

}