import baseball.domain.NumberGenerator;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final NumberGenerator generator = new NumberGenerator();
        List<Integer> numbers = generator.createRandomNumbers();
        System.out.println(numbers);
    }
}