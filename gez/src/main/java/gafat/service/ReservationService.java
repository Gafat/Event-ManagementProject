package gafat.service;

import java.util.ArrayList;
import java.util.List;

import gafat.domain.Reservation;
import gafat.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {

	@Autowired 
	ReservationRepository reservationRepository;
	

	
	public Reservation saveReservation(Reservation reservation)
	{
		reservationRepository.saveReservation(reservation);
		return reservation;
		
	}
	
	public Reservation getOneReservation(String id)
	{  
		return reservationRepository.getOneReservation(id);
		
		
	}

	public List<Reservation> getAllReservation()
	  {
		return reservationRepository.getAllReservation();
		 
		
    	}
	
	public Reservation authenticate(Reservation reservation)
	{
		
		for(Reservation r : reservationRepository.getAllReservation())
		{
			if(reservation.getUserName().equals(r.getUserName()))
			    {  
				   if(reservation.getPassword().equals(r.getPassword()))
				      {
					   
					   System.out.println(r.getFirstName()+ " Successfully loged-in ");
					    return r;
				      }

			    }
		}
		System.out.println("loged-in unSuccessfull ");
		return null;
	}
	
	
}
