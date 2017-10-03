package fr.iut.pm.anbrousse1.ouafff;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by anbrousse1 on 29/09/17.
 */

public class FragmentDetail extends Fragment {


        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_detail,
                    container, false);

            return view;
        }

}
