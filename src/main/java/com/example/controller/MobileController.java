package com.example.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Mobile;
import com.example.service.MobileService;

@RestController
public class MobileController {
	@Autowired
	MobileService mobileservice;
	
	@PostMapping("/mobile")
	public Mobile addMobile(@RequestBody Mobile mobile) {
		mobileservice.addMobile(mobile);
		return mobile;
	}
	
	@GetMapping("/mobiles")
	public List<Mobile> listMobile() {
		return mobileservice.getAllMobiles();
	}
	
	@PutMapping("/mobile/{id}")
	public Mobile updateMobile(@RequestBody Mobile mobile, @PathVariable("id") int id) {
		mobileservice.updateMobile(mobile, id);
		return mobile;
	}
	
	@DeleteMapping("/mobile/{id}")
	public String deleteMobile(@PathVariable("id") int id) {
		mobileservice.deleteMobile(id);
		return "Delete Successfully";
	}

}
