package hello.core.singleton;

import hello.core.member.MemberService;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public SingletonService() {
    }

    public static SingletonService getInstance() {
        return instance;
    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
