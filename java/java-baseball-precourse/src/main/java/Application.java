import baseball.domain.Judgement;
import baseball.domain.NumberGenerator;
import baseball.domain.Referee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        final NumberGenerator generator = new NumberGenerator();
        final List<Integer> computer = generator.createRandomNumbers();

        final Referee referee = new Referee();

        String result ="";
        while(!result.equals("0 볼 3 스트라이크")){
            result = referee.compare(computer,askNumbers());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public static List<Integer> askNumbers() {
        System.out.println("숫자를 입력해 주세요 : ");
        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }
}