package QUESTION_6;

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
