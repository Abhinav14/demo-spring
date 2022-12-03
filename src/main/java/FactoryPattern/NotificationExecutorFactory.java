package FactoryPattern;

public class NotificationExecutorFactory {
	
	public static NotificationExecutor getNotificationExecutor(String executorType){
		if(executorType.equalsIgnoreCase("Email")){
			return new EmailNotificationExecutor();
		}else if(executorType.equalsIgnoreCase("SMS")){
			return new SMSNotificationExecutor();
		}
		return null;
	}
	
}
