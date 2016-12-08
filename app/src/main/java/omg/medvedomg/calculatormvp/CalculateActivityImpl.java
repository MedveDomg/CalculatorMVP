package omg.medvedomg.calculatormvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import omg.medvedomg.calculatormvp.interfaces.CalculateView;

public class CalculateActivityImpl extends AppCompatActivity implements CalculateView{

    @BindView(R.id.button)
    Button plusButton;

    @BindView(R.id.editText)
    EditText firstNumberEditText;

    @BindView(R.id.editText2)
    EditText secondNumberEditText;

    CalculatePresenterImpl presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter = new CalculatePresenterImpl(this);
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(CalculateActivityImpl.this, "showResult is working", Toast.LENGTH_SHORT).show();
                showResult();
            }
        });
    }

//    @OnClick(R.id.button)
//    public void click() {
//        Toast.makeText(this, "showResult is working", Toast.LENGTH_SHORT).show();
//        showResult();
//    }

    @Override
    public void showResult() {

        Log.d("View", "showResult method started");
        presenter.startMath(Integer.parseInt(firstNumberEditText.getText().toString()), Integer.parseInt(secondNumberEditText.getText().toString()));
    }

    @Override
    public void setFirstNmber() {

    }

    @Override
    public void setSecondNumber() {


    }

    @Override
    public void navigateToHome(int total) {
        Toast.makeText(this, "showResult is working, total is " + total, Toast.LENGTH_SHORT).show();
    }
}
