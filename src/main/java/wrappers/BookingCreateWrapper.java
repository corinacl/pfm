package wrappers;

public class BookingCreateWrapper {
	
	private int idcliente;
	
	private String bungalow; 
	
	private String arrival;
	
	private String departure;
	
	public BookingCreateWrapper() {
	}

	public BookingCreateWrapper(int idcliente, String bungalow, String arrival, String departure) {
		this.idcliente = idcliente;
		this.bungalow = bungalow;
		this.arrival = arrival;
		this.departure = departure;
	}
		
	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getBungalow() {
		return bungalow;
	}

	public void setBungalow(String bungalow) {
		this.bungalow = bungalow;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		return "BookingCreateWrapper [bungalow=" + bungalow + ", idcliente=" + idcliente + ", arrival=" + arrival
				+ ", departure=" + departure + "]";
	}
}