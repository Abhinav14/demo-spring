package FactoryPattern;

public class NotificationSender {
	public static void main(String[] args) {
		NotificationExecutorFactory.getNotificationExecutor("SMS").executeNotification();
	}
}
