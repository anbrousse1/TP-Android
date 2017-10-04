package fr.iut.pm.anbrousse1.ouafff;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/**
 * Created by anbrousse1 on 29/09/17.
 */

public class FragmentDetail extends Fragment {

    EditText editText_nom, editText_race,editText_poids;
    Spinner spinner_sexe;
    RatingBar ratingBar_aggressivite;


    private static String INDEX = "INDEX";

        @Override
        public View onCreateView(LayoutInflater inflater,
                                 ViewGroup container,
                                 Bundle savedInstanceState) {

            View view = inflater.inflate(R.layout.fragment_detail,
                    container, false);

            Chien chien = MasterActivity.getChiens().get(getArguments().getInt(INDEX));

            editText_nom = (EditText) view.findViewById(R.id.name_edit_text);
            editText_race = (EditText) view.findViewById(R.id.race_edit_text);
            editText_poids = (EditText) view.findViewById(R.id.poids_edit_text);
            spinner_sexe = (Spinner) view.findViewById(R.id.genre_spinner);
            ratingBar_aggressivite = (RatingBar) view.findViewById(R.id.ratingbar);


            editText_nom.setText(chien.getNom());
            editText_race.setText(chien.getRace());
            editText_poids.setText(String.valueOf(chien.getPoids()));
            ratingBar_aggressivite.setRating(chien.getAgressivite());



            return view;
        }


    public static FragmentDetail newInstance(int index) {
        Bundle args = new Bundle();
        args.putInt(INDEX,index);
        FragmentDetail fragment = new FragmentDetail();
        fragment.setArguments(args);
        return fragment;
    }




}
