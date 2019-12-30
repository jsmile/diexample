package guru.springframework.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile( { "default", "korean" } )
public class HelloWorldServiceKoreanImpl implements HelloWorldService
{
   @Override
   public String getGreeding()
   {
      return "안녕하세요?";
   }
}
