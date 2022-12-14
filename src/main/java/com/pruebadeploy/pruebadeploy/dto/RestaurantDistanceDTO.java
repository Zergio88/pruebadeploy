package com.pruebadeploy.pruebadeploy.dto;

public class RestaurantDistanceDTO {

	private int id_restaurante;
	private int id_usuario;
	private String nombre;
	private int id_horario;
	private int id_direccion;
	private String fotos;
	private String descripcion;
	private String especialidad;
	private int rangos_precios;
	private int distancia;
	
	public RestaurantDistanceDTO(int id_restaurante, int id_usuario, String nombre, int id_horario, int id_direccion,
			String fotos, String descripcion, String especialidad, int rangos_precios, int distancia) {
		this.id_restaurante = id_restaurante;
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.id_horario = id_horario;
		this.id_direccion = id_direccion;
		this.fotos = fotos;
		this.descripcion = descripcion;
		this.especialidad = especialidad;
		this.rangos_precios = rangos_precios;
		this.distancia = distancia;
	}
		
	public int getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(int id_restaurante) {
		this.id_restaurante = id_restaurante;
	}
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getId_horario() {
		return id_horario;
	}
	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}
	public int getId_direccion() {
		return id_direccion;
	}
	public void setId_direccion(int id_direccion) {
		this.id_direccion = id_direccion;
	}
	public String getFotos() {
		return fotos;
	}
	public void setFotos(String fotos) {
		this.fotos = fotos;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public int getRangos_precios() {
		return rangos_precios;
	}
	public void setRangos_precios(int rangos_precios) {
		this.rangos_precios = rangos_precios;
	}
	public int getDistancia() {
		return distancia;
	}
	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}
	
	
}
