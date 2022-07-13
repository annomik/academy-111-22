package by.academy.classwork.lesson10;

public class Ford extends Car{
	
    private String model;
    private String owner;



  public Ford(String model, String owner) {
      super();
      this.model = model;
      this.owner = owner;
  }
  public Ford() {
     super();

  }

  

  public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getOwner() {
	return owner;
}
public void setOwner(String owner) {
	this.owner = owner;
}
@Override
  public String toString() {
     return super.toString();
  }

  @Override
  public boolean equals(Object o) {
     return super.equals(o);
  }

  @Override
  public int hashCode() {
     return super.hashCode();
  }
}

