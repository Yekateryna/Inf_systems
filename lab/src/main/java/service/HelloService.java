package service;

import java.beans.Beans;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;

@Configurable
//@ComponentScans("service")
public class HelloService implements IHello{
	@Override
	public void sayHello() {
		System.out.println("Say Hello World");
	}
	@Bean
	public Beans hello() {
		return new Beans();
	}
}

