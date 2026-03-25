package work;

public class PlaneTest {
	public static void main(String[] args) {
		Plane[] planes = new Plane[2];
		planes[0] = new Airplane("L747", 1000);
		planes[1] = new Cargoplane("C40", 1000);
		
		// 생성된 객체의 정보 출력
		printInfo(planes);
		
		// Airplane 과 Cargoplane 객체에 100 씩 운항 후 객체 정보 출력
		System.out.println("[100 운항]");
        for (Plane p : planes) {
            p.flight(100);
        }
        printInfo(planes);
		
     // Airplane 과 Cargoplane 객체에 200 주유 후 객체 정보 출력
        System.out.println("[200 주유]");
        for (Plane p : planes) {
            p.refuel(200);
        }
        printInfo(planes);
	}

	public static void printInfo(Plane[] list) {
        System.out.println("Plane\tfuelSize");
        System.out.println("------------------");
        for (Plane p : list) {
            System.out.println(p.getPlaneName() + "\t" + p.getFuelSize());
        }
        System.out.println();
	}
}
