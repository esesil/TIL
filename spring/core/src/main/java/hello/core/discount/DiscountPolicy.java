package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /*
    * @return 할인 대상 금액
    */
    int discount(Member member, int price);


    //F2 문제있는곳으로 이동
    //컨트롤 알트 브이 : 리팩토링(객체 생성해주는거)
    //컨트롤 알트 엔터 : 알아서 ; 쳐줌
}
