package by.academy.classwork.lesson8;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone samsung = new Phone("115670", "Samsung", 120);
		Phone huawei = new Phone("225699", "Huawei", 180);
		Phone iPhone = new Phone("338863", "iPhone", 160);

		System.out.println(samsung.getModel() +" Номер: "+ samsung.getNumber() + " Вес: " + samsung.getWeight());
		System.out.println(huawei.getModel() +" Номер: "+  huawei.getNumber() + " Вес: " + huawei.getWeight());
		System.out.println(iPhone.getModel() +" Номер: "+  iPhone.getNumber() + " Вес: " + iPhone.getWeight());

		samsung.receiveCall("Bob");		
		huawei.receiveCall("Sveta");
		iPhone.receiveCall("Olga");

		System.out.println( samsung.getNumber());
		System.out.println( huawei.getNumber());
		System.out.println( iPhone.getNumber());

		// и) Добавьте перегруженный метод receiveCall,
		// который принимает два параметра - имя звонящего и номер телефона звонящего.
		// Вызвать этот метод. 

		samsung.receiveCall("Bob", samsung.getNumber() );
		huawei.receiveCall("Sveta",huawei.getNumber() );
		iPhone.receiveCall("Olga", iPhone.getNumber() );

		samsung.sendMessage(samsung.getNumber(), huawei.getNumber(), iPhone.getNumber() );

	}
}
