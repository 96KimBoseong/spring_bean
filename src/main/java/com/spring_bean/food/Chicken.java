package com.spring_bean.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary// 같은 타입의 bean이 두개일때 primary를 달아주면 @Primary가 설정된 Bean 객체를 주입 해줍니다.
public class Chicken implements Food {
    @Override
    public void eat() {
        System.out.println("치킨을 먹습니다");
    }
}
