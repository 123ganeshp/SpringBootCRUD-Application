package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Mobile;
import com.example.repository.MobileRepo;
@Service
public class MobileService {
     @Autowired
     MobileRepo mobilerepo;
     
     public String addMobile(Mobile mobile) {
    	 mobilerepo.save(mobile);
    	 return "Added Successfully";
     }
     
     public List<Mobile> getAllMobiles(){
    	 mobilerepo.findAll();
    	 return this.mobilerepo.findAll();
     }
     
     public void updateMobile(Mobile mobile,int id) {
    	 if (id == mobile.getId()) {
 			mobilerepo.save(mobile);
 		}
    	
     }
     
     public void deleteMobile(int id) {
    	 mobilerepo.deleteById(id);
    	 
     }
}
