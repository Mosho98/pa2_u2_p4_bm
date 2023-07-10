package com.example.demo.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Hotel;
import com.example.demo.repository.IHotelRepository;

@Service
public class HotelServiceImpl implements IHotelService{

	@Autowired
	private IHotelRepository hotelRepository;
	
	
	@Override
	public void crear(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.insertar(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.hotelRepository.actualizar(hotel);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.hotelRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.hotelRepository.eliminar(id);
	}

	@Override
	public List<Hotel> buscarHotel(BigDecimal valor) {
		// TODO Auto-generated method stub
		return this.hotelRepository.buscarHotel(valor);
	}

}
