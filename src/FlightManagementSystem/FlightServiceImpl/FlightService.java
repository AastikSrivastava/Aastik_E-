package FlightManagementSystem.FlightServiceImpl;

import java.util.List;

public interface FlightService {

	public void  addFlight(Flight);
	
	public void modifyFlight(Flight);
	
	public void viewFlight(long flightNumber);
	
	public void viewFlight();
	
	public void deleteFlight(long flightNumber);
	
	public void validateFlight(Flight);
	
	
}
