package omg.medvedomg.calculatormvp;

import omg.medvedomg.calculatormvp.interfaces.CalculateModel;

/**
 * Created by medvedomg on 08.12.16.
 */

public class CalculateModelImpl implements CalculateModel {

    @Override
    public void calculate(int number1, int number2, ResultListener listener) {
        listener.OnSucces(number1 + number2);
    }




}
