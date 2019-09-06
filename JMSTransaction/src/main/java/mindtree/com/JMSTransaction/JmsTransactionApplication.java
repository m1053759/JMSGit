package mindtree.com.JMSTransaction;

import javax.jms.ConnectionFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@EnableJms
@ComponentScan(basePackages= {"mindtree.com.JMSTransaction.controller","mindtree.com.JMSTransaction.service"})
@SpringBootApplication
public class JmsTransactionApplication {

	@Bean
	public JmsListenerContainerFactory<?> myFactory(ConnectionFactory cf,DefaultJmsListenerContainerFactoryConfigurer con)
	{
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		con.configure(factory, cf);
		return factory;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JmsTransactionApplication.class, args);
	}

}
