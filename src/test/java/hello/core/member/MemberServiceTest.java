package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    public void beforeEach() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

    @Test
    void join() {

        Member newMember = new Member(1L, "memberA", Grade.VIP);

        memberService.join(newMember);

        Member findMember = memberService.findMember(newMember.getId());

        System.out.println("newMember = " + newMember.getName());
        System.out.println("findMember = " + findMember.getName());

        assertThat(newMember.getName()).isEqualTo(findMember.getName());

    }



}
