package com.idema.springOauth2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idema.springOauth2.model.Company;
import com.idema.springOauth2.service.CompanyService;

@RestController
@RequestMapping("/secured/company")
public class CompanyController {
	
	    @Autowired
	    private CompanyService companyService;
	 
	    @RequestMapping("/getALL")
	    public List<Company> getAll() {
	    	
	        return companyService.getAll();
	    }


}
