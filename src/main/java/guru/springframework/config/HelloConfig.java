package guru.springframework.config;

import guru.springframework.services.HelloWorldService;
import guru.springframework.services.HelloWorldServiceEnglishImpl;
import guru.springframework.services.HelloWorldServiceKoreanImpl;
import guru.springframework.services.HelloWorldFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @Configuration class 를 통해
 *  XML 설정이나 @Component 없이
 *  단순한 Java Class 를 Bean 으로 등록할 수 있다.
 * */
@Configuration
public class HelloConfig
{
   // 중앙집중식 Bean 생성 관리( Factory )
   @Bean
   public HelloWorldFactory hellowWorldFactory()
   {
      return hellowWorldFactory();
   }

   @Bean
   @Profile( "english" )
   public HelloWorldService helloWorldServiceEnglish( HelloWorldFactory _helloWorldFactory )
   {
      return _helloWorldFactory.createHelloWorldService( "en" );
   }


   @Bean
   @Profile( { "default", "korean" } ) // @Profile 에 default 를 선언하면 .properties 파일에 선언이 없을 경우 기본값
   public HelloWorldService helloWorldServiceKorean( HelloWorldFactory _helloWorldFactory )
   {
      return _helloWorldFactory.createHelloWorldService( "ko" );
   }

   @Bean
   @Profile( "spanish" )
   public HelloWorldService helloWorldServiceSpanish( HelloWorldFactory _helloWorldFactory )
   {
      return _helloWorldFactory.createHelloWorldService( "es" );
   }

}