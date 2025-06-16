package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.entity.student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String configuration="/in/sp/resource/applicationContext.xml";
       ApplicationContext context= new ClassPathXmlApplicationContext(configuration);
       student std=(student)context.getBean("stdid");
      String s1= std.toString();
      System.out.println(s1);
  }
}
