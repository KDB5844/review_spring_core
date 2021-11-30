package hello.core.application;

import hello.core.AutoAppConfig;
import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class BeanTest {

    ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

    @Test
    void beanTest() {
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach((value) -> {
            System.out.println("value = " + value);
        });

        assertThat(ac.getBean(MemberServiceImpl.class)).isInstanceOf(MemberServiceImpl.class);
        assertThat(ac.getBean(MemoryMemberRepository.class)).isInstanceOf(MemoryMemberRepository.class);
        assertThat(ac.getBean(OrderServiceImpl.class)).isInstanceOf(OrderServiceImpl.class);
        assertThat(ac.getBean(RateDiscountPolicy.class)).isInstanceOf(RateDiscountPolicy.class);
    }
    
}
