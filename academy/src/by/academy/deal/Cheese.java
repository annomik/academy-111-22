package by.academy.deal;

public class Cheese {
   
	private int fatContent ;
	private String country;
	
	
	
	public Cheese(int fatContent, String country) {
		super();
		this.fatContent = fatContent;
		this.country = country;
	}
	
	public Cheese() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cheese [fatContent=");
		builder.append(fatContent);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	public int getFatContent() {
		return fatContent;
	}

	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + fatContent;
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
		Cheese other = (Cheese) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (fatContent != other.fatContent)
			return false;
		return true;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}