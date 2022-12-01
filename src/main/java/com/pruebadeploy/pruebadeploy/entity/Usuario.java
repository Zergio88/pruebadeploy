package com.pruebadeploy.pruebadeploy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id_usuario;
		@Column(name = "mail")
		private String mail;
		private String password;
		private String nombre;
		@OneToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="id_rol")
		//@Column(name = "id_rol")
		private Rol rol;
		private String foto;
		
		public Integer getId_usuario() {
			return id_usuario;
		}
		public void setId_usuario(Integer id_usuario) {
			this.id_usuario = id_usuario;
		}
		
		public void setMail(String mail) {
			this.mail = mail;
		}
		public String getMail() {
			return mail;
		}
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
			
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Rol getRol() {
			return this.rol;
		}
		
		public void rol(Rol rol) {
			this.rol = rol;
		}
		
		public String getFoto() {
			return foto;
		}
		public void setFoto(String foto) {
			this.foto = foto;
		}
}
