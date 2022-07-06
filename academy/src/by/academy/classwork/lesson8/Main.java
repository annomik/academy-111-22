package by.academy.classwork.lesson8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone samsung = new Phone("115670", "Samsung", 120);
		Phone huawei = new Phone("225699", "Huawei", 180);
		Phone iPhone = new Phone("338863", "iPhone", 160);

		System.out.println(samsung.model +" Номер: "+ samsung.number+ " Вес: " + samsung.weight );
		System.out.println(huawei.model +" Номер: "+  huawei.number+ " Вес: " + huawei.weight );
		System.out.println(iPhone.model +" Номер: "+  iPhone.number+ " Вес: " + iPhone.weight );

		samsung.receiveCall("Bob");		
		huawei.receiveCall("Sveta");
		iPhone.receiveCall("Olga");

		System.out.println( samsung.getNumber());
		System.out.println( huawei.getNumber());
		System.out.println( iPhone.getNumber());

		samsung.receiveCall("Bob", samsung.number );
		huawei.receiveCall("Sveta", huawei.number );
		iPhone.receiveCall("Olga", iPhone.number);
		
		samsung.sendMessage(samsung.number, huawei.number, iPhone.number );
		
		//samsung.number, huawei.number, iPhone.number 
	}


}
