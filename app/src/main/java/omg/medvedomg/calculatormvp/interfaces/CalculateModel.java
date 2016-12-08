package omg.medvedomg.calculatormvp.interfaces;

/**
 * Created by medvedomg on 08.12.16.
 */

public interface CalculateModel {
    void calculate(int number1, int number2, ResultListener listener);

    interface ResultListener {
        int OnSucces(int total);
    }


}
