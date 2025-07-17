package designPattern2023.factory;

public class NotificationSender {

	public static void main(String[] args) {
		NotificationExecutorFactory.getNotificationExecutor("EMAIL").executeNotification();
	}

}
