package guru.springframework.springboot;

import guru.springframework.controllers.GreedingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan( "guru.springframework" )
@ImportResource( "classpath:spring/spring-config.xml" )
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
