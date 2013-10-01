package tn.edu.esprit.erpBi.ejbProject.services.domain;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event implements Serializable {

	private int idEvent;
	private String name_event;
	private String category;
	private String country;
	private String adress;
	private String description;

	private Date start_date;
	private Date end_date;
	private int booking;
	private int likes;

	public Event() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEvent() {
		return idEvent;
	}

	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}

	public String getName_event() {
		return name_event;
	}

	public void setName_event(String name_event) {
		this.name_event = name_event;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public int getBooking() {
		return booking;
	}

	public void setBooking(int booking) {
		this.booking = booking;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	
	public Event(String name_event, String category, String country,
			String adress, String description, Date start_date, Date end_date,
			int booking, int likes) {
		super();
		this.name_event = name_event;
		this.category = category;
		this.country = country;
		this.adress = adress;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.booking = booking;
		this.likes = likes;
	}

	public Event(String name_event, String category) {
		super();
		this.name_event = name_event;
		this.category = category;
	}

	
	
	
	
}
