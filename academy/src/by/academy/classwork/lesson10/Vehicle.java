package by.academy.classwork.lesson10;

public class Vehicle {
	private int speed;
	private int weight;


	  public Vehicle() {
	    super();
	  }

	  public void setSpeed(int speed) {
	    this.speed = speed;
	  }

	  public void setWeight(int weight) {
	    this.weight = weight;
	  }

	  public int getSpeed() {
	    return speed;
	  }

	  public int getWeight() {
	    return weight;
	  }

	  @Override
	  public String toString() {
	    return "Vehicle{" +
	            "speed=" + speed +
	            ", weight=" + weight +
	            '}';
	  }

	  @Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    Vehicle vehicle = (Vehicle) o;

	    if (speed != vehicle.speed) return false;
	    return weight == vehicle.weight;
	  }

	  @Override
	  public int hashCode() {
	    int result = speed;
	    result = 31 * result + weight;
	    return result;
	  }
	}