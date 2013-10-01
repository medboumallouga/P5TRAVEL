package tn.edu.esprit.erpBiclientProject;

import java.sql.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestInitDb {

	public static void main(String[] args) throws NamingException {

		Date date = new Date(2013, 12, 21);
		Date date2 = new Date(2013, 12, 30);

		Date date3 = new Date(2013, 10, 1);
		Date date4 = new Date(2013, 10, 4);

		Date date5 = new Date(2013, 11, 1);
		Date date6 = new Date(2013, 11, 4);

		Context context = new InitialContext();

		EventManagementServicesRemote eventManagementServicesRemote = (EventManagementServicesRemote) context
				.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");

		// Event event = new Event("tedx carthage", 2, 500);
		/*
		 * Event event = new Event("tedx carthage", "experience", "tunisia",
		 * "mohamed 5", "experience", date, date2, 2, 500);
		 */
		// Event event2 = new
		// tn.edu.esprit.erpBi.ejbProject.services.domain.Event("androidcom",
		// "dev", "tunisia", "chargeya", "dev android", Date, Date, 2, 2);

		// Event event2 = new
		// Event("tedx carthage","experience","tunisia","mohamed 5","experience",
		// new date ,new date2 ,2,500);
		Event event3 = new Event("tedx carthage", "experience", "tunisia",
				"mohamed 5", "experience", date, date2, 2, 500);
		Event event4 = new Event("DroidCom", "experience", "tunisia",
				"chargeya ", "experience", date3, date4, 2, 1000);
		Event event5 = new Event("cloud", "cloud computing", "tunisia",
				"Esprit ", "cloud cloud", date5, date6, 7, 1500);

		// Event event3 = new
		// Event("tedx carthage","experience","tunisia","mohamed 5","experience",
		// new date ,new date2 ,2,500);
		eventManagementServicesRemote.addEvent(event3);
		eventManagementServicesRemote.addEvent(event4);
		eventManagementServicesRemote.addEvent(event5);
		// eventManagementServicesRemote.addEvent(event2);
		// eventManagementServicesRemote.addEvent(event3);

	}

}
