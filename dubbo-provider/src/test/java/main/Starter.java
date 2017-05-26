package main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

	public static void main(String[] args) throws IOException {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationProvider.xml" });
		context.start();

		System.out.println("输入任意按键退出 ~ ");
		System.in.read();
		context.close();
	}
}
