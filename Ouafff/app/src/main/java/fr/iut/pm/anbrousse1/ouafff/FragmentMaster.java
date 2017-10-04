package fr.iut.pm.anbrousse1.ouafff;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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



        mAdapter = new ChienAdapter(getActivity().getApplicationContext(), MasterActivity.getChiens());
        mRecyclerView.setAdapter(mAdapter);


        return view;
    }


}
