package com.booking.BookingABook1.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.booking.BookingABook1.model.RegisterBean;
import com.booking.BookingABook1.repository.UserRepository;


@Service
@Component
public class RegisterDao {
	@Autowired
	UserRepository userRepository;



	public void addDetails(RegisterBean registerBean) {

		userRepository.save(registerBean);
	}
	public long customerCount() {

		long count =userRepository.count();
		return count;
	}
	
}
