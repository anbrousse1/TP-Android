package fr.iut.pm.anbrousse1.ouafff;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MasterActivity extends AppCompatActivity {

    static Context c;
    private static List<Chien> chiens = loadChiens();
    static android.app.FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);

        fragmentManager = getFragmentManager();

        if(fragmentManager.findFragmentById(R.id.id_fragment) == null){
            fragmentManager.beginTransaction()
                    .add(R.id.id_fragment, new FragmentMaster())
                    .commit();
        }

        c = MasterActivity.this;




    }
    public static List<Chien> getChiens(){
        return chiens;
    }


    private static List<Chien> loadChiens() {
        List<Chien> chiens = new ArrayList<>();
        chiens.add(new Chien("baba","batard",1,52,Sexe.Inconnue));
        chiens.add(new Chien("bibi","caniche",2,52,Sexe.Femelle));
        chiens.add(new Chien("bobo","caniche",3,52,Sexe.Femelle));
        return chiens;
    }


    public static void openDetail(int index){
        c.startActivity(DetailActivity.newInstance(c,index));

    }
}
