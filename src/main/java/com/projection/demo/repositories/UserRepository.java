package com.projection.demo.repositories;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.projection.demo.entities.User;

@Component
@Repository
public interface UserRepository extends JpaRepository<User, Long>, CrudRepository<User, Long>{

	@Query(value="SELECT id, name, vorname "
			   + "FROM user "
			   + "WHERE name = :thisname" , nativeQuery=true)
	@Transactional
	public Optional<User> findAllUserWithNameLike(@Param("thisname") String name);
	
	
	
	
	  @Query(value="SELECT id, name, vorname " + "FROM user " +
	  "WHERE vorname = :thisvorname" , nativeQuery=true)
	  @Transactional 
	  public Optional<User> findAllUserWithVorameLike(@Param("thisvorname") String firstname);
	 
	 
}
