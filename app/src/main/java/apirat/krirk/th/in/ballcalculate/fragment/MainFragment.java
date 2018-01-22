package apirat.krirk.th.in.ballcalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ButtonBarLayout;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import apirat.krirk.th.in.ballcalculate.MainActivity;
import apirat.krirk.th.in.ballcalculate.R;

/**
 * Created by playn on 1/9/2018.
 */

public class MainFragment extends Fragment {

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

        // Show Name Controller
        showNameController();

        // Calculate Controller
        gotoCalculate();

        // Clear
        createToolbar();

    }   //Main Methor

    private void clearController() {
        Button button = getView().findViewById(R.id.btnClear);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment, new MainFragment())
                        .addToBackStack(null).commit();
            }
        });
    }


    private void gotoCalculate() {
        Button button = getView().findViewById(R.id.btnGoCalculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.contentMainFragment, new CalculateFragment())
                        .addToBackStack(null).commit();
            }
        });

    }

    private void showNameController() {
        Button button = getView().findViewById(R.id.btnGoShowName);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = getView().findViewById(R.id.txtShowName);
                textView.setText("Ball");
            }
        });
    }

    private void createToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.toolberMain);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
    }


}








