package scenariobased;

class Vehicle{
	int veh_ID = 10245;
	public void DisplayDetails() {
		System.out.println("vehicle ID: "+veh_ID);
	}
}

class Car extends Vehicle{
	
	String Car_Brand = "TATA";
	public void DisplayDetails() { 
		System.out.println("vehicle ID: "+veh_ID);
		System.out.println("Car Brand : "+Car_Brand);
	}

}

class Electric_car extends Car{
	int Electric_car_ID = 10789;
	public void DisplayDetails() { 
		System.out.println("vehicle ID    : "+veh_ID);
		System.out.println("Car Brand     : "+Car_Brand);
		System.out.println("electic car Id: "+Electric_car_ID);
	}
}

public class VehicleManagement {
public static void main(String[] args) {
	Vehicle v = new Electric_car();
	v.DisplayDetails();
}
}
