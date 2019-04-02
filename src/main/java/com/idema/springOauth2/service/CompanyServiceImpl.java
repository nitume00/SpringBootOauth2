package com.idema.springOauth2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.idema.springOauth2.model.Company;
@Service
public class CompanyServiceImpl implements CompanyService {

	@Override
	public List<Company> getAll() {
		List companyList = new ArrayList<Company>();
		companyList.add(new Company (1,"Bureau Varitas"));
		companyList.add(new Company (2,"Idemia"));
		return companyList;
	}

}
