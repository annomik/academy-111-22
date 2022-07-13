package by.academy.classwork.lesson10;

import java.util.Objects;

public class Car extends Vehicle{
	   private String color;
	   private int age;

	    public void paint(int age){
	       if (age > 10){
	           color = "black";
	       }

	    }


	    public Car(String color, int age) {
	        super();
	        this.color = color;
	        this.age = age;
	    }


	    public Car() {
	        super();
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

    

		@Override
		public String toString() {
			return "Car [color=" + color + ", age=" + age + "]";
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(age, color);
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
			Car other = (Car) obj;
			return age == other.age && Objects.equals(color, other.color);
		}

	   
	}
	