package abstractFactoryPracticeAgain;

public class TestAbstractFactoryPattern {
	public static void main(String[] args) {
		AbstractFactory parentFactory = FactoryProducer.getVehicleType("sedan");
		Vehicle vehicle = parentFactory.getVehicle("verna");
		vehicle.declareSeats();
		vehicle = parentFactory.getVehicle("city");
		vehicle.declareSeats();
	}
}
