package guru.springframework.services;

public class HelloWorldServiceEnglishImpl implements HelloWorldService
{
   @Override
   public String getGreeding()
   {
      return "Hello, World !!!";
   }
}
