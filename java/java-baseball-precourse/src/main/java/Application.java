import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
//        final NumberGenerator generator = new NumberGenerator();
//        List<Integer> numbers = generator.createRandomNumbers();
//        System.out.println(numbers);

        Judgement judgement = new Judgement();
//        final int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
//        System.out.println(count);

        final boolean place = judgement.hasPlace(Arrays.asList(7, 8, 9), 0, 7);
        System.out.println(place); //true
    }
}