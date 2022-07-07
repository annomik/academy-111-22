package by.academy.deal;

public class Product {

	private String name;
	private double price;
	private int quantity;
	private double tax;
	
	
	public double calcPrice(double price, int quantity ) {
		return (price*quantity);
	}
	
	
	public Product(String name, double price, int quantity, double tax) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.tax = tax;
		
	}
	
	
	public Product() {
		super();
	}
	
	public String getName() {
	       return name;
	   }
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTax() {
		return tax ;
	   }

	public void setTax() {
	       this.tax = 1.0;
	   }
		
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	public double getCalcPrice() {
		return calcPrice;
	}


	public void setCalcPrice(double calcPrice) {
		this.calcPrice = calcPrice;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [name=");
		builder.append(name);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", tax=");
		builder.append(tax);
		builder.append("]");
		return builder.toString();
	}
				
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + quantity;
		temp = Double.doubleToLongBits(tax);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (quantity != other.quantity)
			return false;
		if (Double.doubleToLongBits(tax) != Double.doubleToLongBits(other.tax))
			return false;
		return true;
	}


}


