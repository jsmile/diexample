package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceSpanishImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

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

   @Autowired
   @Qualifier( "helloWorldServiceSpanish" )
   public void setHelloWorldServiceSpanish( HelloWorldService helloWorldServiceSpanish )
   {
      this.helloWorldServiceSpanish = helloWorldServiceSpanish;
   }

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
