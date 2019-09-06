package mindtree.com.JMSTransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mindtree.com.JMSTransaction.transaction.Transaction;

@RestController
public class MessageSender {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@PostMapping("/send")
	public void send(@RequestBody Transaction transaction)
	{
		System.out.println("Sending Transaction:");
		jmsTemplate.convertAndSend("TransactionQueue", transaction.toString());
	}
	
}
