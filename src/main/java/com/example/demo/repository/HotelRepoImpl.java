package com.example.demo.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.persist(hotel);
	}

	@Override
	public void actualizar(Hotel hotel) {
		// TODO Auto-generated method stub
		this.entityManager.merge(hotel);
	}

	@Override
	public Hotel seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Hotel.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Hotel hotel = this.seleccionar(id);
		this.entityManager.remove(hotel);
	}

	@Override
	public List<Hotel> buscarHotel(BigDecimal valor) {
		TypedQuery<Hotel> myQuery = this.entityManager.createQuery(
				"SELECT h FROM Hotel h INNER JOIN h.habitaciones ha WHERE ha.valor= :datoValor", Hotel.class);
		myQuery.setParameter("datoValor", valor);
		List<Hotel> listHoteles = myQuery.getResultList();
		// BAJO DEMANDA ES DECIR CON EL LAZY
		for (Hotel h : listHoteles) {
			h.getHabitaciones().size();
		}
		return myQuery.getResultList();
	}

}
