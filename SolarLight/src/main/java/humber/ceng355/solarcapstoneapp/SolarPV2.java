package humber.ceng355.solarcapstoneapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Owner on 2/8/2018.
 */

public class SolarPV2 extends Fragment {
    public SolarPV2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_solarpv2, container, false);

        return rootView;
    }

}