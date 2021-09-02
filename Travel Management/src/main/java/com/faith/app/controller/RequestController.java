package com.faith.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.app.exception.RequestNotFoundException;
import com.faith.app.model.Requests;
import com.faith.app.repository.RequestRepository;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/api/")
public class RequestController {
	
	@Autowired
	private RequestRepository requestRepository;
	
	
	@GetMapping("/request")
	public List<Requests> getAllRequests(){
		return requestRepository.findAll();
	}
	
	@PostMapping("/request")
	public Requests createRequest(@RequestBody Requests request) {
		return requestRepository.save(request);
	}
	
	@GetMapping("/request/{requestId}")
	public ResponseEntity<Requests> getRequestById(@PathVariable Long requestId) {
		Requests requests =requestRepository.findById(requestId).orElseThrow(() ->new RequestNotFoundException("The requested Id not found"+ requestId));
		return ResponseEntity.ok(requests);
	}
	
	@PutMapping("/request/{requestId}")
	public ResponseEntity<Requests> updateRequests(@PathVariable Long requestId, @RequestBody Requests requestDetails){
		Requests requests =requestRepository.findById(requestId).orElseThrow(() ->new RequestNotFoundException("The requested Id not found"+ requestId));
		requests.setCauseTravel(requestDetails.getCauseTravel());
		requests.setSource(requestDetails.getSource());
		requests.setDestination(requestDetails.getDestination());
		requests.setFromDate(requestDetails.getFromDate());
		requests.setToDate(requestDetails.getToDate());
		requests.setMode(requestDetails.getMode());
		requests.setPriority(requestDetails.getPriority());
		requests.setDays(requestDetails.getDays());
		requests.setStatus(requestDetails.getStatus());
		
		return ResponseEntity.ok(requests);
		
	}
	
	
	
	

}
