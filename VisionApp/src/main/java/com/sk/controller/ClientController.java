package com.sk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sk.model.ClientRecord;
import com.sk.repo.ClientRecordRepo;

@RestController
@RequestMapping("/")
public class ClientController {
	
	@Autowired ClientRecordRepo clientRecordRepo;
	
	@GetMapping("/test")
	public String test () {
		return "test App";
	}
	
	@GetMapping("/getAllClient") 
	public List<ClientRecord> getAllClient() {
		List<ClientRecord> clientRecordList = new ArrayList<>();
		clientRecordList = clientRecordRepo.findAll();
		return clientRecordList;
	} 
 
	@GetMapping("/getclientbyid/{entityId}")
	public List<ClientRecord> getClientInfoById (@PathVariable(required=true) Integer entityId) {
		List<ClientRecord> clientRecList = new ArrayList<>();
		
		clientRecList = clientRecordRepo.findByClientInfoId(entityId);
		return clientRecList;
	}
	
	@GetMapping("/getclientbyentcode/{entcode}")
	public List<ClientRecord> getAllClientInfoByCode( @PathVariable(required=true) String entcode) {
		
		List<ClientRecord> clientRecordList = clientRecordRepo.findByEntcode(entcode);
		
		return clientRecordList;
	}
	
	@GetMapping("/getaddressbyemail/{email}")
	public List<ClientRecord> getAllClientInfobyEmail (@PathVariable(required=true) String email) {
		
		List<ClientRecord> clientRecordList = clientRecordRepo.findByEmail(email);
		return clientRecordList;
	}
	
	
}
