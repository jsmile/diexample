package guru.springframework.services;

/**
 * @param _language : 2 글자 ( 예: "ko", "en", ...)
 * */
public class HelloWorldFactory
{
   public HelloWorldService createHelloWorldService( String _language )
   {
      HelloWorldService service = null;

      switch( _language )
      {
         case "en":
            service = new HelloWorldServiceEnglishImpl();
            break;
         case "es":
            service = new HelloWorldServiceSpanishImpl();
            break;
         case "ko":
            service = new HelloWorldServiceKoreanImpl();
         default:
            break;
      }

      return service;
   }
}
