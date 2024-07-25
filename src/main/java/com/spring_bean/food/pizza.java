package com.spring_bean.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("pizza")
public class pizza implements Food{
    @Override
    public void eat() {
        System.out.println("피자를 먹습니다.");
    }
}
