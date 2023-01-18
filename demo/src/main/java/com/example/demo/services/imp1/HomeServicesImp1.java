package com.example.demo.services.imp1;

import org.springframework.stereotype.Service;

import com.example.demo.services.java.IHomeService;

@Service

public class HomeServicesImp1 implements IHomeService {

	@Override
	public String getMessage() {
		return "Welcome Service";
	}
}
