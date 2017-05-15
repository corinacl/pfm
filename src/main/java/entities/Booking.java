package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Booking {

	@Id
	@GeneratedValue
	private int id;
	
	//De momento se queda como string hasta que cree los bungalows
	private String bungalow;
	
    @ManyToOne
    @JoinColumn
	private Client client;
	
	private Calendar arrivalDate;
	
	private Calendar departureDate;
	
	private BigDecimal totalPrice;
	
	
	public Booking (){
	}
		
	public Booking (String bungalow, Client client, Calendar arrivalDate, Calendar departureDate) {
		this.bungalow = bungalow;
		this.client = client;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.totalPrice = new BigDecimal(9.25);
	}
	
	public int getId(){
		return id;
	}
	
	public String getBungalow() {
		return bungalow;
	}

	public void setBungalow(String bungalow) {
		this.bungalow = bungalow;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Calendar getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Calendar arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Calendar getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Calendar departureDate) {
		this.departureDate = departureDate;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
    
    @Override
    public int hashCode() {
        return id;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return id == ((Booking) obj).id;
    }

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bungalow=" + bungalow + ", client=" + client + ", arrivalDate=" + arrivalDate
				+ ", departureDate=" + departureDate + ", totalPrice=" + totalPrice + "]";
	}

}
