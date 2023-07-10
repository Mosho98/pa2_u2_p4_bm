package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.modelo.Hotel;

public interface IHotelService {
	public void crear(Hotel hotel);
	public void actualizar(Hotel hotel);
    public Hotel seleccionar(Integer id);
	public void eliminar(Integer id);
	
	public List<Hotel> buscarHotel(BigDecimal valor);
}
