package service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				"ApplicationResourse.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(
				HelloService.class);
		IHello hello = (IHello)ctx.getBean(HelloService.class);
		hello.sayHello();
		
	}

}
