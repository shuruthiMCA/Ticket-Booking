package com.jsp.Book_My_Tickets.Service;

import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jsp.Book_My_Tickets.dto.LoginDto;
import com.jsp.Book_My_Tickets.dto.UserDto;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;



public interface UserService {

	String register(@Valid UserDto userDto, BindingResult result);
		
	

	String login(LoginDto dto, RedirectAttributes attributes, HttpSession session); 
	
	

}
