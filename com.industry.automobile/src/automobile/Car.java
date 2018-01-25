package automobile;

public class Car implements MotorVehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Car wagonr=new Car();
wagonr.run();
wagonr.color();
wagonr.fuel();

Car dzire=new Car();
dzire.run();
dzire.fuel();
dzire.color();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Wroooom");
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("either petrol or diesel");
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Red");
	}

	


}
