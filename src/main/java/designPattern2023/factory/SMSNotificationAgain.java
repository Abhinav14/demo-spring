package designPattern2023.factory;

public class SMSNotificationAgain implements NotificationExecutorAgain{

	@Override
	public void executeNotification() {
		System.out.println("SMS notification sent!");
	}

}
