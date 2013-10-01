package tn.edu.esprit.erpBiclientProject;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestAddEvent {
	public static void main(String[] args) {

		try {
			Context context = new InitialContext();
			EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");

			Event event = new Event();
			event.setName_event("tedx carthage");

		proxy.addEvent(event);

		} catch (NamingException e) {
			e.printStackTrace();
		}

	}
}