package br.com.mbc.cursos.CursoJUnitM2.entities;

import java.util.Date;

public class Rent {

	private User user;
	private Movie movie;
	private Date rentDate;
	private Date returnDate;
	private Double value;


	public Rent() {
		super();
	}

	public Rent(User user, Movie movie, Date rentDate, Date returnDate, Double value) {
		super();
		this.user = user;
		this.movie = movie;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
		this.value = value;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

}
