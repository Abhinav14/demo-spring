package designPattern2023.factory;

public class NotificationFactoryAgain {
	
	public static NotificationExecutorAgain getNotificationExecutorInstance(String executorType) {
		if(executorType.equalsIgnoreCase("EMAIL")) {
			return new EmailNotificationExecutorAgain();
		}else if(executorType.equalsIgnoreCase("SMS")) {
			return new SMSNotificationAgain();
		}else {
			return null;
		} 
	}

}
