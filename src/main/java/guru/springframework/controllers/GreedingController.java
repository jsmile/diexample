package guru.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class GreedingController
{
   HelloWorldService helloWorldService;

   @Autowired
   public void setHelloWorldService( HelloWorldService helloWorldService )
   {
      this.helloWorldService = helloWorldService;
   }

   public String sayHello()
   {
      return helloWorldService.getGreeding();
   }

}
