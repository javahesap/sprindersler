import java.util.Locale;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConfigurableApplicationContext applicationcontext=new ClassPathXmlApplicationContext("aplicationContext.xml");
			Locale locale= new Locale("tr","TR");
			String mssage=applicationcontext.getMessage("failure.login.message", null,locale);
			System.out.println(mssage);
		
		 applicationcontext.close();
	}

}
