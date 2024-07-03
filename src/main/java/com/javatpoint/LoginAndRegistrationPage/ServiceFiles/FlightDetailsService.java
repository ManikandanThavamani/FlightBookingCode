package com.javatpoint.LoginAndRegistrationPage.ServiceFiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.javatpoint.LoginAndRegistrationPage.Entity_File.Flight;
import com.javatpoint.LoginAndRegistrationPage.Repositories.FlightRepository;

@Service
public class FlightDetailsService implements UserDetailsService {

	@Autowired
	private FlightRepository flightRepo;
	
	@Override
	public UserDetails loadUserByUsername(String flightName) throws UsernameNotFoundException {
		Flight flight = flightRepo.findByflightName(flightName);
		if (flightName == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return (UserDetails) new FlightDetails(flight);
	}
	
	public Flight getFlightByFlightCode(int flightCode){
		return flightRepo.findByflightCode(flightCode);
	}
	
	
	public Flight updateAvailableSeats(int flightCode, int newAvailableSeats) { 
		Flight flight = flightRepo.findByflightCode(flightCode);
		flightRepo.findByflightCode(flightCode).setNoOfSeatsAvailable(newAvailableSeats); 
		return flightRepo.save(flight);
		}

}