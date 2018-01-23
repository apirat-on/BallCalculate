package apirat.krirk.th.in.ballcalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import apirat.krirk.th.in.ballcalculate.MainActivity;
import apirat.krirk.th.in.ballcalculate.R;

public class CalculateFragment extends Fragment implements View.OnClickListener {
    //  Explicit
    private TextView textView;
    private Button cButton,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttons,buttond,buttona,buttonX;
    private String displayString = "";
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();
//        Initial View
        initialView();
//         One Controller
        oneController();

//        Two Controller
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("2");
            }
        });

//         3 controller
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("3");
            }
        });

//        4 controller
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDisplay("4");
            }
        });

//        Number Controller

        numberController();
    }   // Main Method

    private void numberController() {
        button5.setOnClickListener(this);

        cButton.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttons.setOnClickListener(this);
        buttond.setOnClickListener(this);
        buttona.setOnClickListener(this);
        buttonX.setOnClickListener(this);
    }

    private void oneController() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // show Display
                showDisplay("1");
            }
        });
    }

    private void showDisplay(String strDisplay) {
        StringBuilder stringBuilder =new StringBuilder();
        displayString = displayString + stringBuilder.append(strDisplay).toString();
        textView.setText(displayString);
    }

    private void initialView() {
        textView = getView().findViewById(R.id.txtDisplay);
        cButton = getView().findViewById(R.id.btnC);
        button1 = getView().findViewById(R.id.btn1);
        button2 = getView().findViewById(R.id.btn2);
        button3 = getView().findViewById(R.id.btn3);
        button4 = getView().findViewById(R.id.btn4);
        button5 = getView().findViewById(R.id.btn5);
        button6 = getView().findViewById(R.id.btn6);
        button7 = getView().findViewById(R.id.btn7);
        button8 = getView().findViewById(R.id.btn8);
        button9 = getView().findViewById(R.id.btn9);
        buttons = getView().findViewById(R.id.btns);
        buttond = getView().findViewById(R.id.btnd);
        buttonX = getView().findViewById(R.id.btnX);
        buttona = getView().findViewById(R.id.btna);





    }

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolbarCalculate);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Calculate");

        ((MainActivity) getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_calculate, container, false);
        return view;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn5:
                showDisplay("5");
                break;

            case R.id.btn6:
                showDisplay("6");
                break;
            case R.id.btn7:
                showDisplay("7");
                break;
            case R.id.btn8:
                showDisplay("8");
                break;
            case R.id.btn9:
                showDisplay("9");
                break;

        } //switrh
    } //onClick
}   // Main Class

