package kr.human.di.app;

import kr.human.di.service.Communication;
import kr.human.di.vo.ActiveMQMessaging;
import kr.human.di.vo.MMSMessaging;
import kr.human.di.vo.Messaging;
import kr.human.di.vo.SMSMessaging;

public class AppMain00 {
	public static void main(String[] args) {
		// Spring Framework를 사용하지 않았다면
		Messaging messaging1 = new ActiveMQMessaging();
		Messaging messaging2 = new MMSMessaging();
		
		Communication communication1 = new Communication();
		communication1.setMessaging(messaging1);
		communication1.communicate();
		
		Communication communication2 = new Communication();
		communication2.setMessaging(messaging2);
		communication2.communicate();
		
		Communication communication3 = new Communication();
		communication3.setMessaging(new SMSMessaging());
		communication3.communicate();
	}
}
