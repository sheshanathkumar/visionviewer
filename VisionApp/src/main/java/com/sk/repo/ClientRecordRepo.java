package com.sk.repo;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sk.model.ClientRecord;

@Repository
public interface ClientRecordRepo extends JpaRepository<ClientRecord, Integer>{

	List<ClientRecord> findByClientInfoId (Integer clientInfoId);
	
	List<ClientRecord> findByEntcode (String entcode);
	
	List<ClientRecord> findByEmail (String email);
	
}
