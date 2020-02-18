package AirportServicesImpl;

import java.util.ArrayList;
import java.util.List;

public class AirportServiceImpl implements AirportService {

	AirportDaoImpl airpotDao;
	Airport airport;
	
	@Override
	public void viewAirport() {
		// TODO Auto-generated method stub
		
		   List<Airport>userlist =new ArrayList<Airport>();
	          
           userlist=airportDao.viewAirport();
           
        System.out.println("Airport_Name"+"  "+"Airport_Code"+" "+"  "+"Airport_Location");
       
        for(Airport a :userlist) {
        	
        	System.out.println(a.getAirportName()+"  "+a.getAirportCode()+" "+"  "+a.getAirportLocation());
        	}
		
	}

	@Override
	public void viewAirport(String airportCode) {
		// TODO Auto-generated method stub
		
		
		
	}

}
