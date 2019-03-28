package com.javasampleapproach.jquery.postlistobjects.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RegisterRepository extends JpaRepository<Customer, Long>{

	
}
