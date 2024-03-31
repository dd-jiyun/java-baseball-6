package baseball.model;

import baseball.validate.Validator;
import baseball.view.OutputView;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class Player {

    public List<Integer> inputPlayerNumber() {
        OutputView.printInputMessage();
        String input = Console.readLine();

        Validator.validateInputNumber(input);

        List<Integer> numbers = convertStringToIntegers(input);

        return numbers;
    }

    private List<Integer> convertStringToIntegers(final String input) {
        return new ArrayList<>(input.chars()
                .map(Character::getNumericValue)
                .boxed()
                .toList());
    }
}