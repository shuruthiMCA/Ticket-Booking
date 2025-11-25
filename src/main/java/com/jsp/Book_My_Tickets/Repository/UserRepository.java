package com.jsp.Book_My_Tickets.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.Book_My_Tickets.Entity.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	boolean existsByEmail(String email);

	void deleteByRole(String string);
}
