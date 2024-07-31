package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();

        long id = 1L;
        Member memberA = new Member(id, "memberA", Grade.VIP);
        memberService.join(memberA);

        Member findMember = memberService.findMember(id);
        System.out.println("memberA = " + memberA.getName());
        System.out.println("findMember = " + findMember.getName());
    }

}
