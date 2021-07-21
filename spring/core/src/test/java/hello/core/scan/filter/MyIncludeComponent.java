package hello.core.scan.filter;

import java.lang.annotation.*;

@Target(ElementType.TYPE) //Type 클래스 레벨에 붙는것
@Retention(RetentionPolicy.RUNTIME) // 어노테이션의 지속 시간
@Documented // Java doc 문서화 여부
public @interface MyIncludeComponent {

}
