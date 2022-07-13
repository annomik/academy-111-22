package by.academy.deal;

import java.util.Objects;

public class Fruit extends Product  {

	private String growingCountry;
	private boolean ripeness;
	
	
	//avocado, banana, lemon
	public Fruit()  {
		super();
	}


	
	public Fruit(String name, double price, int quantity, double tax) {
		super(name, price, quantity, tax);
		// TODO Auto-generated constructor stub
	}

	

	public Fruit(String name, double price, int quantity, double tax, String growingCountry, boolean ripeness) {
		super(name, price, quantity, tax);
		this.growingCountry = growingCountry;
		this.ripeness = ripeness;
	}



	public String getGrowingCountry() {
		return growingCountry;
	}



	public void setGrowingCountry(String growingCountry) {
		this.growingCountry = growingCountry;
	}



	public boolean isRipeness() {
		return ripeness;
	}



	public void setRipeness(boolean ripeness) {
		this.ripeness = ripeness;
	}



	@Override
	public String toString() {
		return "Fruit [growingCountry=" + growingCountry + ", ripeness=" + ripeness + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(growingCountry, ripeness);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(growingCountry, other.growingCountry) && ripeness == other.ripeness;
	}

	
}
