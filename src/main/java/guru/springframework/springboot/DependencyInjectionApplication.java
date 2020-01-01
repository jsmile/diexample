package guru.springframework.springboot;

import guru.springframework.controllers.GreedingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *  Bean 을 Injection 받으려면 같은 package 에 Class 들이 있어야 함.
 *  서로 다른 package 에 있는 Bean 을 Injection 받기 위해서는
 *  관련된 Class 들을 @ComponentScan 범위에 포함시켜야 함.
 * */
@SpringBootApplication
@ComponentScan( "guru.springframework" )
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
