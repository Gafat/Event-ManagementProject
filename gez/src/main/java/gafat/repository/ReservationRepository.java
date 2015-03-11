package gafat.repository;

import gafat.domain.Reservation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public class ReservationRepository {
	
	List<Reservation> reservations=new ArrayList<Reservation>();
	
	public Reservation saveReservation(Reservation reservation)
	{
		reservations.add(reservation);
		return reservation;
		
	}
	
	public Reservation getOneReservation(String id)
	{
		for(Reservation r: reservations)
		  {if(r.getTel()==id)return r;
		  
		  }
		return null;
		
	}

	public List<Reservation> getAllReservation()
	  {
		
		return reservations;
		
    	}
	
	
}
