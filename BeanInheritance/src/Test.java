
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
   public static void main(String[] args) {
         ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
         
         First obj1 = (First)context.getBean("bean1");
         obj1.display1();
         obj1.display2();
         

         Second obj2 = (Second) context.getBean("bean2");
         obj2.display1();
         obj2.display2();
         obj2.display3();
         
        
         
         //context.registerShutdownHook();
	   
	   /*	Resource resource=new ClassPathResource("bean.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("helloWorld");  
	    student.setMessage("hai");
	    student.getMessage();  
	   */
   }
}