package guru.springframework;

import guru.springframework.controllers.GreedingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication
{

   public static void main( String[] args )
   {
      ApplicationContext atx = SpringApplication.run( DependencyInjectionApplication.class, args );

       GreedingController controller = (GreedingController) atx.getBean( "greedingController" );
       String greeding = controller.sayHello();
       System.out.println( greeding );


   }
}
