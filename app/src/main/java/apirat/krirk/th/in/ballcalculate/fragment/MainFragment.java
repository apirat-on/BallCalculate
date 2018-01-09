package apirat.krirk.th.in.ballcalculate.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import apirat.krirk.th.in.ballcalculate.MainActivity;
import apirat.krirk.th.in.ballcalculate.R;

/**
 * Created by playn on 1/9/2018.
 */

public class MainFragment extends Fragment{

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

//        Create Toolbar
        createToolbar();

    }   //Main Methor

    private void createToolbar() {
        Toolbar toolbar = getView().findViewById(R.id.toolberName);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
    }

    public MainFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);


        return view;
    }
}  // Main Class
