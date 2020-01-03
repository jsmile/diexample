package guru.springframework.services;

public class HelloWorldServiceFactory
{
   public HelloWorldService createHelloWorldService( String _language )
   {
      HelloWorldService service = null;

      switch( _language )
      {
         case "en":
            service = new HelloWorldServiceEnglishImpl();
            break;
         case "eu":
            service = new HelloWorldServiceSpanishImpl();
            break;
         case "ch":
            service = new HelloWorldServiceChineseImpl();
            break;
         case "ko":
            service = new HelloWorldServiceKoreanImpl();
         default:
            break;
      }

      return service;
   }
}
