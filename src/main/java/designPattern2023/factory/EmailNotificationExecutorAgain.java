package designPattern2023.factory;

public class EmailNotificationExecutorAgain implements NotificationExecutorAgain{

	@Override
	public void executeNotification() {
		System.out.println("Email notification sent!");
	}

}
