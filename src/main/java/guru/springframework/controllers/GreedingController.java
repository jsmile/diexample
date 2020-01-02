package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *  @Bean 으로 설정된 Bean 을 참조하는 방법에는
 *  Bean 의 Method 명을 이용한 참조와
 *  Bean 의 name 을 이용한 참조 등이 있다.
 * */
@Controller
public class GreedingController
{
   HelloWorldService helloWorldService;
   HelloWorldService helloWorldServiceSpanish;

   @Autowired
   public void setHelloWorldService( HelloWorldService helloWorldService )
   {
      this.helloWorldService = helloWorldService;
   }

   // Bean 의 Method 명을 이용한 참조
   @Autowired
   @Qualifier( "helloWorldServiceSpanish" )
   public void setHelloWorldServiceSpanish( HelloWorldService helloWorldServiceSpanish )
   {
      this.helloWorldServiceSpanish = helloWorldServiceSpanish;
   }

   // Bean 의 name 선언을 이용한 참조
   @Autowired
   @Qualifier( "chinese" )
   public void setHelloWorldServiceChinese( HelloWorldService helloWorldServiceChinese )
   {
      this.helloWorldServiceSpanish = helloWorldServiceSpanish;
   }

   public String sayHello()
   {
      String greeding = helloWorldService.getGreeding();
      System.out.println( helloWorldServiceSpanish.getGreeding() );
      return greeding;
   }

}
