package core.app12;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@Getter
@RequiredArgsConstructor
public class Bean1 {
    final Bean2 bean2;

}
