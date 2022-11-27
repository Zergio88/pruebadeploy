package com.pruebadeploy.pruebadeploy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebadeploy.pruebadeploy.entity.Direccion;

@Repository
public interface DireccionRepo extends JpaRepository<Direccion, Integer>{

}
