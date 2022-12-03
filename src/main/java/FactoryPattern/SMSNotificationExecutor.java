package FactoryPattern;

public class SMSNotificationExecutor implements NotificationExecutor{

	@Override
	public void executeNotification() {
		System.out.println("SMS notification sent!");
	}
	
}
