package mindtree.com.JMSTransaction.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {

	@JmsListener(destination="TransactionQueue")
	public void receiver(String transaction)
	{
		System.out.println(transaction);
		System.out.println("Received!");
	}
	
}
