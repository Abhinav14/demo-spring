package designPattern2023.factory;

public class NotificationAgain {
	
	public static void main(String[] args) {
		
		NotificationFactoryAgain.getNotificationExecutorInstance("SMS").executeNotification();
		
	}

}
