package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Random {

    private static final int FIRST_VALUE = 0;
    private static final int LAST_VALUE = 0;

    public int createNumber() {
        return Randoms.pickNumberInRange(FIRST_VALUE, LAST_VALUE);
    }
}
