package designPattern2023.factory;

public class SMSNotification implements NotificationExecutor{

	@Override
	public void executeNotification() {
		System.out.println("Sending SMS!");
	}

}
