package designPattern2023.factory;

public class EmailNotificationExecutor implements NotificationExecutor{

	@Override
	public void executeNotification() {
		System.out.println("Sending Email!");
	}

}
