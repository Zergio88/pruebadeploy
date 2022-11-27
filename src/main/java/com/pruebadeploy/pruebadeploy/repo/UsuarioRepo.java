package com.pruebadeploy.pruebadeploy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pruebadeploy.pruebadeploy.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{

}
