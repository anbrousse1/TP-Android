package fr.iut.pm.anbrousse1.ouafff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.app.FragmentManager fragmentManager = getFragmentManager();

        if(fragmentManager.findFragmentById(R.id.id_fragment) == null){
            fragmentManager.beginTransaction()
                    .add(R.id.id_fragment, new FragmentMaster())
                    .commit();
        }



        //TODO créer la liste de iench et lié avec l'adaptater puis lancer et c'est terminé. temps de cuisson : 10 minute au four  à chaleur tournante

    }
}
