package work;

public class Cargoplane extends Plane {
	public Cargoplane() {
		
	}
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	public void flight(int distance) {
		// 일정 거리 만큼 운항, 연료 감소 10 운항 시 연료 50 감소
		int currentFuel = getFuelSize();
        setFuelSize(currentFuel - (distance * 5));
	}
}
