package homework20;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Calculator {
    int firstOperand;
    int secondOperand;

    public int calculate(){
        return firstOperand + secondOperand;
    }
}
