package by.academy.classwork.lesson8;

public class Phone {

	String number;
	String model;
	double weight;

	void receiveCall(String name){
		System.out.println("Звонит "+name);
	}

	void receiveCall(String name, String number){
		System.out.println("Звонит "+ name+ " тел.: "+ number );
	}

	void sendMessage(String... args){
		for (String number : args) {
		System.out.print(number + "  "  );
		}
	}

	public Phone( ) {

	}

	public Phone( String number, String model ) {
		this.number = number;
		this.model = model;
	}

	public Phone(String number, String model, double weight ) {
		this(number, model );
		this.weight = weight;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getNumber() {
		return number;
	}

	public String getModel() {
		return model;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Phone phone = (Phone) o;

		if (Double.compare(phone.weight, weight) != 0) return false;
		if (number != null ? !number.equals(phone.number) : phone.number != null) return false;
		return model != null ? model.equals(phone.model) : phone.model == null;
	}

	@Override
	public String toString() {
		return "Phone{}";
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
