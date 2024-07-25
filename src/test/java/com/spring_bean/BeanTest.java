package com.spring_bean;

import com.spring_bean.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
    @Autowired
    @Qualifier("pizza") // 명시해주면 이거먼저
    Food food;
    //AutoWired는 food 타입으로 빈을 찾는데 같은타입이 두개여서 오류가남
    // 근데 bean의 이름을 주면 찾아서 주입해줌
    @Autowired
    Food chicken;
    // food 타입의 chicken 클래스

    @Autowired
    @Qualifier("pizza")
    Food pizza;
    // food 타입의 pizza 클래스

    @Test
    @DisplayName("primary / Qualifier 우선순위")
    void test() {
        food.eat();
        chicken.eat();
        pizza.eat();

    }
}
