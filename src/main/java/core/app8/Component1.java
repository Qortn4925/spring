package core.app8;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Component1 {

//     프라이빗 필든데 어케 접근함 >  relection  모르면 api
    @Autowired
    private Componenet2 componenet2;

}
