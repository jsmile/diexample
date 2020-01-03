package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceChineseImpl;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 *  @Bean 으로 설정된 Bean 을 참조하는 방법에는
 *  Bean 의 Method 명을 이용한 참조와
 *  Bean 의 name 을 이용한 참조 등이 있다.
 * */
//@Controller
public class GreedingController
{
   HelloWorldService helloWorldService;
   HelloWorldService helloWorldServiceSpanish;
   HelloWorldService helloWorldServiceChinese;

//   @Autowired
   public void setHelloWorldService( HelloWorldService _helloWorldService )
   {
      this.helloWorldService = _helloWorldService;
   }

   // Bean 의 Method 명을 이용한 참조
//   @Autowired
//   @Qualifier( "helloWorldServiceSpanish" )
   public void setHelloWorldServiceSpanish( HelloWorldService _helloWorldServiceSpanish )
   {
      this.helloWorldServiceSpanish = _helloWorldServiceSpanish;
   }

   // Bean 의 name 선언을 이용한 참조
//   @Autowired
//   @Qualifier( "chinese" )
   public void setHelloWorldServiceChinese( HelloWorldService _helloWorldServiceChinese )
   {
      this.helloWorldServiceChinese = _helloWorldServiceChinese;
   }

   public String sayHello()
   {
      String greeding = helloWorldService.getGreeding();
      System.out.println( helloWorldServiceSpanish.getGreeding() );
      System.out.println( helloWorldServiceChinese.getGreeding() );
      return greeding;
   }

}
