package fr.iut.pm.anbrousse1.ouafff;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anbrousse1 on 29/09/17.
 */

public class FragmentMaster extends Fragment {
    RecyclerView.Adapter mAdapter ;
    RecyclerView mRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_master,
                container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new GridLayoutManager(getActivity().getApplicationContext(),2));
        mRecyclerView.setHasFixedSize(true);

        List<Chien> chiens = new ArrayList<>();
        chiens.add(new Chien("baba","batard",1,52,Sexe.Inconnue));
        chiens.add(new Chien("bibi","caniche",2,52,Sexe.Femelle));
        chiens.add(new Chien("bobo","caniche",3,52,Sexe.Femelle));

        mAdapter = new ChienAdapter(getActivity().getApplicationContext(),chiens);
        mRecyclerView.setAdapter(mAdapter);


        return view;
    }
}
