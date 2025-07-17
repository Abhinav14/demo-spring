package designPattern2023.factory;

public class NotificationExecutorFactory {
	
	public static NotificationExecutor getNotificationExecutor(String executorType) {
		if(executorType.equalsIgnoreCase("EMAIL")) {
			return new EmailNotificationExecutor();
		}else if(executorType.equalsIgnoreCase("SMS")) {
			return new SMSNotification();
		}else {
			return null;
		}
	}
	
}
