package finalproject;

public class Train {
	 private int trainNumber;
	 private String trainName;
	 private String source;
	 private String destination;
	 private double ticketPrice;
	
	 public Train(int trainNumber,String trainName,String source,String destination,double ticketPrice)
	 {
		 super();
		 this.trainNumber=trainNumber;
		 this.trainName=trainName;
		 this.source=source;
		 this.destination=destination;
		 this.ticketPrice=ticketPrice;
	 }
public int getTrainNumber()
{
	
	return trainNumber;
	
	}
public void setTrainNumber() {
	this.trainNumber=trainNumber;
	System.out.println("enter TrainNumber "+trainNumber);
}
public String getTrainName()
{
	return trainName;
	
	}
public void setTrainName() {
	this.trainName=trainName;
	System.out.println("enter trainName "+trainName);
}
public String getsource()
{
	return source;
	
	}
public void setsource() {
	this.source=source;
	System.out.println("enter source "+source);
}
public String getdestination()
{
	return destination;
	
	}
public void setdestination() {
	this.destination=destination;
	System.out.println("enter destination "+destination);
	
}
public double getTicketPrice() {
	return ticketPrice;
}
public void setTicketPrice(double ticketPrice) {
	this.ticketPrice = ticketPrice;
}
@Override
public String toString() {
	return "Train [getTrainNumber()=" + getTrainNumber() + ", getTrainName()=" + getTrainName() + ", getsource()="
			+ getsource() + ", getdestination()=" + getdestination() + "]";
}




}
