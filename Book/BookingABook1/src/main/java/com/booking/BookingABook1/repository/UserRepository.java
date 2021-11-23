package com.booking.BookingABook1.repository;






import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.BookingABook1.model.RegisterBean;





public interface UserRepository extends JpaRepository<RegisterBean,Integer>  {
	 
}
