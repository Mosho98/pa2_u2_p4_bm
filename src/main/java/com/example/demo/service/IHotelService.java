package com.example.demo.service;

import com.example.demo.modelo.Hotel;

public interface IHotelService {
	public void crear(Hotel hotel);
	public void actualizar(Hotel hotel);
    public Hotel seleccionar(Integer id);
	public void eliminar(Integer id);
}
