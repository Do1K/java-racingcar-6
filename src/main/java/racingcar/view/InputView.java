package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public String inputCars(){
        return Console.readLine();
    }

    public int inputCount(){
        return Integer.parseInt(Console.readLine());
    }
}