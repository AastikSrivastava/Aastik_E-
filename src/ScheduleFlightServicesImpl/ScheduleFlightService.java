package ScheduleFlightServicesImpl;

public interface ScheduleFlightService {

	public void scheduleFlight(ScheduledFlight);
	
	public void viewScheduleFlights(Airport , Airport , LocalDate);
	
	public void viewScheduleFlights(long flightNumber);
	
	public void viewScheduleFlight();
	
	public void modifyScheduleFlight(Flight , Schedule , int availableSeats);
	
	public void deleteScheduleFlight(long flightNumber);
	
	public void validateScheduleFlight(ScheduleFlight);

}
