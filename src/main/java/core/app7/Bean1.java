package core.app7;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Bean1 {
//         의존성 주입 , SET메소드 , 필드에 , 생성자에
//     필드 주입은 > 추천 X 테스트, 다른 프레임워크 호환 문제
    @Autowired
    Bean2 bean2 ;
    


}
