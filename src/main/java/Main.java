import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		
		Message message1 = context.getBean("message1", Message.class);
		System.out.println("message 1 : " + message1.getContent());
		message1.setContent("Hello Spring Beans");
		
		Message message2 = context.getBean("message1", Message.class);
		System.out.println("message 2 : " + message2.getContent());
		
		
		/* */
		Message message3 = context.getBean("message2", Message.class);
		System.out.println("message 3 : " + message3.getContent());
		message3.setContent("Hello Spring Beans");
		System.out.println("message 3 : " + message3.getContent());
		
		Message message4 = context.getBean("message2", Message.class);
		System.out.println("message 4 : " + message4.getContent());
		
	}

}
