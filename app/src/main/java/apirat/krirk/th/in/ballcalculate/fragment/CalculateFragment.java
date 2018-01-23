package apirat.krirk.th.in.ballcalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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
    private Button cButton,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttons,buttond,buttona,buttonX,button0,buttonz;

    private String displayString = "";
    private double num1ADouble, displayADouble;
    private String tag = "23JanV1";
    private boolean addABoolean = false, minusABoolean = false;

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
        button0.setOnClickListener(this);
        buttonz.setOnClickListener(this);
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
        button0 = getView().findViewById(R.id.btn0);
        buttonz = getView().findViewById(R.id.btnz);




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
        switch (view.getId()) {
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
            case R.id.btn0:
                showDisplay("0");
                break;


            case R.id.btnC:
//                cleardisplay
                cleardisplay();
                break;

            case R.id.btna:

                addABoolean = false;
                displayADouble = Double.parseDouble(displayString);
                if (num1ADouble == 0) {
                    num1ADouble = displayADouble;
                } else {
                    if (minusABoolean) {
                        num1ADouble = num1ADouble - displayADouble;
                        minusABoolean = false;
                    } else {
                        num1ADouble = num1ADouble + displayADouble;
                    }

                }
                Log.d(tag, "num1 ==> " + num1ADouble);
                cleardisplay();
                break;
            case R.id.btnd:
                displayADouble = Double.parseDouble(displayString);
                if (addABoolean) {
                    num1ADouble = num1ADouble + displayADouble;
                    addABoolean = false;
                } else  if (minusABoolean){
                    num1ADouble= num1ADouble - displayADouble;
                    minusABoolean = false;
                }

                textView.setText(Double.toString(num1ADouble));
                displayString ="0";


                break;

            case  R.id.btnz:
                minusABoolean = true;
                if (num1ADouble == 0) {
                    num1ADouble = Double.parseDouble(displayString);
                } else {
                    if (addABoolean){
                        num1ADouble = num1ADouble + Double.parseDouble(displayString);
                        addABoolean =false;
                    }else
                        num1ADouble = num1ADouble - Double.parseDouble(displayString);
                }
              Log.d(tag,"num1 at btnz ==> " + num1ADouble);
             cleardisplay();
                break;


        } //switrh
    } //onClick

    private void cleardisplay() {

        if (addABoolean) {
            textView.setText("");
            displayString ="";
            displayADouble = 0;
        }else if (minusABoolean){
            textView.setText("");
            displayString ="";
            displayADouble = 0;

        }else {
            textView.setText("");
            displayString ="";
            displayADouble = 0;
            num1ADouble =0;
        }


    }

}   // Main Class

