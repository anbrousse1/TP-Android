package fr.iut.pm.anbrousse1.ouafff;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anbrousse1 on 29/09/17.
 */

public class ChienAdapter extends RecyclerView.Adapter<ChienAdapter.ViewHolder> {


    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv_nom, tv_race;
        LinearLayout linearLayout;

        public ViewHolder(final View itemView) {
            super(itemView);
            tv_nom = (TextView)itemView.findViewById(R.id.nom_chien);
            tv_race = (TextView)itemView.findViewById(R.id.race_chien);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linear_layout);

        }
    }
    private List<Chien> chiens;
    private Context context;

    public ChienAdapter(Context context,List<Chien> chiens) {
        this.chiens = chiens;
        this.context = context;

    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View chienView = inflater.inflate(R.layout.item_list_chien, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(chienView);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Chien c = chiens.get(position);
        holder.tv_nom.setText(c.getNom());
        holder.tv_race.setText(c.getRace());
        switch (c.getAgressivite()){
            case 0 :
                holder.linearLayout.setBackgroundColor(context.getResources().getColor(R.color.blanc));
                break;
            case 1 :
                holder.linearLayout.setBackgroundColor(context.getResources().getColor(R.color.jaune));
                break;
            case 2 :
                holder.linearLayout.setBackgroundColor(context.getResources().getColor(R.color.orange));
                break;
            case 3 :
                holder.linearLayout.setBackgroundColor(context.getResources().getColor(R.color.rouge));
                break;
            default : break;
        }

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MasterActivity.openDetail(position);
            }
        });

    }




    @Override
    public int getItemCount() {
        return chiens.size();
    }
}
