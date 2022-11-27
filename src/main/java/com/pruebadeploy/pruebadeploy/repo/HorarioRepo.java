package com.pruebadeploy.pruebadeploy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebadeploy.pruebadeploy.entity.Horario;

@Repository
public interface HorarioRepo extends JpaRepository<Horario, Integer>{

}
