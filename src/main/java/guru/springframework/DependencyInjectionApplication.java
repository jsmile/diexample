package guru.springframework;

import guru.springframework.controllers.GreedingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 *  같은 package 또는 하위 레벨 package 에 Annotation 으로 설정된 Bean 들은
 *  Injection 을 받을 수 있으나
 *  동일 레벨의 서로 다른 package 에 있는 Bean 들은 Injection 불가
 * */
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
