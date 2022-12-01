package com.pruebadeploy.pruebadeploy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pruebadeploy.pruebadeploy.entity.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer>{

	@Query("select u from Usuario u where u.mail = :#{#usuario.mail} and u.password = :#{#usuario.password}")
	List<Usuario> findByMailAndPassword(@Param("usuario") Usuario usuario);
	
}
