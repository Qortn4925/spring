package core.app9;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Com {
//   직접 접근 ,  set,  생성자
    private Com1 com;

//    생성자가 여러개면 > default 생성자를 사용하는데 , 생성자가 하나 밖에 없고 , 그 값으로 autowired 하려는 인스턴스가 잇으면
//     굳이 어노테이션을 작성할 필요가 없다
    public Com(Com1 com) {
        this.com = com;
    }



}
