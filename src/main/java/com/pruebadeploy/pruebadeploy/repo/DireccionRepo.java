package com.pruebadeploy.pruebadeploy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebadeploy.pruebadeploy.entity.Direccion;



@Repository
public interface DireccionRepo extends JpaRepository<Direccion, Integer>{
	
}
