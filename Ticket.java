package finalproject;

import java.time.LocalDate;
import java.util.HashMap;

public class Ticket {

	private int counter;
	private String pnr;
	private LocalDate traveldate;
	private Train train;
	private HashMap<Passenger,Double> passengers;
	public Ticket(LocalDate traveldate, Train train) {
		super();
		this.traveldate = traveldate;
		this.train = train;
	
	
		}
	public HashMap<Passenger, Double> getPassengers() {
		return passengers;
	}

	public void setPassengers(HashMap<Passenger, Double> passengers) {
		this.passengers = passengers;
	}

	
	double calcPassengerFare(Passenger passenger)
	{ 

		if(passenger.getAge()<=12)
			return train.getTicketPrice()*0.5;
		else if(passenger.getAge()>=54)
			return train.getTicketPrice()*0.6;
		else if (passenger.getAge()=='f')
			return train.getTicketPrice();
	return counter;

	}

	void addPassenger(Passenger passenger)
	{
		passengers = new HashMap<Passenger, Double>();
		passengers.put(new Passenger(passenger.getName(), passenger.getAge(), passenger.getGender()), calcPassengerFare(passenger));

	}




	public void display() {
		// TODO Auto-generated method stub
		System.out.println("values "+passengers);
	}





}