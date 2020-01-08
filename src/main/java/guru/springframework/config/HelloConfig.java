package guru.springframework.config;

import guru.springframework.services.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

/**
 * @Configuration class 를 통해
 *  XML 설정이나 @Component 없이
 *  단순한 Java Class 를 Bean 으로 등록할 수 있다.
 * */
@Configuration
public class HelloConfig
{
   // Bean 의 생성을 책임질 Factory Bean 생성
   @Bean
   public HelloWorldServiceFactory helloWorldServiceFactory()
   {
      return new HelloWorldServiceFactory();
   }

   // .properties 파일 설정을 이용한 Injection
   @Bean
   @Profile( { "default", "korean" } ) // @Profile 에 default 를 선언하면 .properties 파일에 선언이 없을 경우 기본값
   @Primary
   public HelloWorldService helloWorldServiceKorean( HelloWorldServiceFactory _helloWorldServiceFactory )
   {
      // factory bean 으로부터 Bean 을 생성받는다.
      return _helloWorldServiceFactory.createHelloWorldService( "ko" );
   }

   // .properties 파일 설정을 이용한 Injection
   @Bean
   @Profile( "english" )
   @Primary
   public HelloWorldService helloWorldServiceEnglish( HelloWorldServiceFactory _helloWorldServiceFactory )
   {
      return _helloWorldServiceFactory.createHelloWorldService( "en" );
   }

   // Bean 의 Method 를 이용한 참조 가능
   @Bean
   public HelloWorldService helloWorldServiceSpanish( HelloWorldServiceFactory _helloWorldServiceFactory )
   {
      return _helloWorldServiceFactory.createHelloWorldService( "eu" );
   }

   // Bean 의 name 설정을 이용한 참조 가능
   @Bean( name="chinese" )
   public HelloWorldService helloWorldServiceChinese( HelloWorldServiceFactory _helloWorldServiceFactory )
   {
      return _helloWorldServiceFactory.createHelloWorldService( "ch" );
   }

}
