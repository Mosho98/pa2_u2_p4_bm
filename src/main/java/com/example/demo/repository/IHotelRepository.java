package com.example.demo.repository;

import com.example.demo.modelo.Hotel;

public interface IHotelRepository {
	public void insertar(Hotel hotel);
	public void actualizar(Hotel hotel);
    public Hotel seleccionar(Integer id);
	public void eliminar(Integer id);

}
