package omg.medvedomg.calculatormvp;

import omg.medvedomg.calculatormvp.interfaces.CalculateModel;
import omg.medvedomg.calculatormvp.interfaces.CalculatePresenter;
import omg.medvedomg.calculatormvp.interfaces.CalculateView;

/**
 * Created by medvedomg on 08.12.16.
 */

public class CalculatePresenterImpl implements CalculatePresenter, CalculateModel.ResultListener {

    private CalculateView calculateView;
    private CalculateModel calculateModel;

    public CalculatePresenterImpl(CalculateView calculateView) {
        this.calculateView = calculateView;
        calculateModel = new CalculateModelImpl();
    }


    @Override
    public void startMath(int number1, int number2) {
        calculateModel.calculate(number1, number2, this);
    }

    @Override
    public int OnSucces(int total) {
        calculateView.navigateToHome(total);
        return total;
    }
}
