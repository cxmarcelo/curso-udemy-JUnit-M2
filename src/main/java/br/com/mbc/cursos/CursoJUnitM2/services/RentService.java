package br.com.mbc.cursos.CursoJUnitM2.services;

import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.com.mbc.cursos.CursoJUnitM2.entities.Movie;
import br.com.mbc.cursos.CursoJUnitM2.entities.Rent;
import br.com.mbc.cursos.CursoJUnitM2.entities.User;

import br.com.mbc.cursos.CursoJUnitM2.utils.DateUtils;

public class RentService {

	public Rent rentMovie(User user, Movie movie) {
		Rent rent = new Rent();
		rent.setMovie(movie);
		rent.setUser(user);
		rent.setRentDate(new Date());
		rent.setValue(movie.getRentPrice());

		//Entrega no dia seguinte
		Date returnDate = new Date();
		returnDate = DateUtils.addDays(returnDate, 1);
		rent.setReturnDate(returnDate);

		//Salvando a locacao...	
		//TODO adicionar método para salvar
		return rent;
	}

	@Test
	public void teste() {
		//cenario
		RentService service = new RentService();
		User user = new User("Usuario 1");
		Movie movie = new Movie("Filme 1", 2, 5.0);

		//acao
		Rent rent = service.rentMovie(user, movie);

		//verificacao
		Assert.assertTrue(rent.getValue() == 5.0);
		Assert.assertTrue(DateUtils.isSameDay(rent.getRentDate(), new Date()));
		Assert.assertTrue(DateUtils.isSameDay(rent.getReturnDate(), DateUtils.addDaysFromToday(1)));
	}

}
