package Java_excercise2;

public class Vehicle {
	public void Truck(String colour,int wheel,int model) {
		System.out.println("Truck is "+colour+" in colour it has "+wheel+" wheels and it is "+model+" year model");
	}
	public void Bus(String colour,int wheel,int model) {
		System.out.println("Bus is "+colour+" in colour it has "+wheel+" wheels and it is "+model+" year model");
	}
	public void Car(String colour,int wheel,int model) {
		System.out.println("Car is "+colour+" in colour it has "+wheel+" wheels and it is "+model+" year model");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj =new Vehicle();
		obj.Truck("red",8,2019);
		obj.Bus("Green",6,2017);
		obj.Car("White",4,2015);

	}

}
