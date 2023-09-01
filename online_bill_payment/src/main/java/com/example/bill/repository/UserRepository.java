package com.example.bill.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.bill.model.User;

//import jakarta.transaction.Transactional;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
	
	boolean existsByAccountNum(String accountNum);
	
	Optional<User> findById(Long id);
	
	void deleteById(Long id);
    @Query("select u from User u")
    List<User> findAllQuery();
    @Query("select u from User u where u.accountNum= :accountNum")
	User findByAccountNum(@Param("accountNum")String accountNum); 
//	@Query("select u from User u where u.accountNum= ?4")
//	User findByAccountNumPlace(String accountNum);
//	@Modifying
//	@Transactional
//	@Query("update User u set u.userName= :n where u.id= :id")
//	void updateUserQuery(@Param("n") String n,@Param("id")Long id);
//	by using table name
//    @Query(value="select * from user ",nativeQuery=true)
//    List<User> findAllQuery();
//
//	User findByAccountNum(String accountNum);

//	User updateUserQuery();
	
}
