package guru.springframework.services;

public class HelloWorldServiceKoreanImpl implements HelloWorldService
{
   @Override
   public String getGreeding()
   {
      return "안녕하세요?";
   }
}
