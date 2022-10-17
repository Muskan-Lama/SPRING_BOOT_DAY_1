package QUESTION_5;

import com.TTN.springboot.QUESTION_1.B_TECH;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MCA implements COMPUTER_SCIENCE {


    @Override
    public void display() {
        System.out.println("MCA");
    }
}
