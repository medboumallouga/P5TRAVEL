package tn.edu.esprit.erpBiclientProject;

import javax.naming.Context;
import javax.naming.InitialContext;

import tn.edu.esprit.erpBi.ejbProject.services.domain.Event;
import tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote;

public class TestUpdateEvent {
	
	public static void main(String[] args) {
		
		
		try {
			
			Context context = new InitialContext();
			EventManagementServicesRemote proxy = (EventManagementServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.ejbProject/EventManagementServices!tn.edu.esprit.erpBi.ejbProject.services.interf.EventManagementServicesRemote");

			Event eventfounded = proxy.findEventById(2);
			
			eventfounded.setAdress("insat");
			
			proxy.updateEvent(eventfounded);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}
