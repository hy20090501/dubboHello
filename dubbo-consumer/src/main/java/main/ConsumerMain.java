package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hy.service.DemoService;

public class ConsumerMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationConsumer.xml" });
		context.start();
		DemoService service = (DemoService) context.getBean("demoService");
		System.out.println(service.sayHello("world"));
		context.close();
	}
}
