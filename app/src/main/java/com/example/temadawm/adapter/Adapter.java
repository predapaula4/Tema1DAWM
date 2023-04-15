package com.example.temadawm.adapter;


import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.temadawm.R;
import com.example.temadawm.model.AfricaModel;
import com.example.temadawm.model.AmericaModel;
import com.example.temadawm.model.Animal;
import com.example.temadawm.model.AsiaModel;
import com.example.temadawm.model.AustraliaModel;
import com.example.temadawm.model.EuropeModel;
import com.example.temadawm.model.continent;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<Animal> listOfAnimals;

    public Adapter(List<Animal> listOfAnimals){this.listOfAnimals = listOfAnimals;}

    @Override
    public int getItemViewType(int position)
    {
        return listOfAnimals.get(position).getContinent().getKey();
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == continent.EUROPA.getKey())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_eu, parent, false);
            EuropaHoledr viewHolder = new EuropaHoledr(view);
            return viewHolder;
        }else if (viewType == continent.ASIA.getKey())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_asia, parent, false);
            AsiaHolder viewHolder = new AsiaHolder(view);
            return viewHolder;
        }else if (viewType == continent.AFRICA.getKey())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_africa, parent, false);
            AfricaHolder viewHolder = new AfricaHolder(view);
            return viewHolder;
        }else if (viewType == continent.AUSTRALIA.getKey())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_australia, parent, false);
            AustraliaHolder viewHolder = new AustraliaHolder(view);
            return viewHolder;
        }else if (viewType == continent.AMERICA.getKey())
        {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_animal_america, parent, false);
            AmericaHolder viewHolder = new AmericaHolder(view);
            return viewHolder;
        }

        return null;
    }


    @Override
    public int getItemCount() {
        return listOfAnimals.size();
    }

    class EuropaHoledr extends RecyclerView.ViewHolder{
        TextView text;

        public  EuropaHoledr(@NotNull View itemView)
        {
            super(itemView);
            text = itemView.findViewById(R.id.numeAnimalEu);
        }

        public void bind(EuropeModel europaModel)
        {
            text.setText(europaModel.getNume());
        }
    }

    class AustraliaHolder extends RecyclerView.ViewHolder{
        TextView text;

        public  AustraliaHolder(@NotNull View itemView)
        {
            super(itemView);
            text = itemView.findViewById(R.id.numeAnimalAustralia);
        }

        public void bind(AustraliaModel europaModel)
        {
            text.setText(europaModel.getNume());
        }
    }

    class AsiaHolder extends RecyclerView.ViewHolder{
        TextView text;

        public  AsiaHolder(@NotNull View itemView)
        {
            super(itemView);
            text = itemView.findViewById(R.id.numeAnimalAsia);
        }

        public void bind(AsiaModel europaModel)
        {
            text.setText(europaModel.getNume());
        }
    }

    class AmericaHolder extends RecyclerView.ViewHolder{
        TextView text;

        public  AmericaHolder(@NotNull View itemView)
        {
            super(itemView);
            text = itemView.findViewById(R.id.numeAnimalAmerica);
        }

        public void bind(AmericaModel europaModel)
        {
            text.setText(europaModel.getNume());
        }
    }
    class AfricaHolder extends RecyclerView.ViewHolder{
        TextView text;

        public  AfricaHolder(@NotNull View itemView)
        {
            super(itemView);
            text = itemView.findViewById(R.id.numeAnimalAfrica);
        }

        public void bind(AfricaModel europaModel)
        {
            text.setText(europaModel.getNume());
        }
    }

    @Override
    public void onBindViewHolder(@NotNull RecyclerView.ViewHolder holder, int position)
    {
        if(holder instanceof EuropaHoledr){
            EuropeModel europaModel = (EuropeModel) listOfAnimals.get(position);
            ((EuropaHoledr)holder).bind(europaModel);
        }else if(holder instanceof AfricaHolder)
        {
            AfricaModel model = (AfricaModel) listOfAnimals.get(position);
            ((AfricaHolder)holder).bind(model);
        }else if(holder instanceof AustraliaHolder)
        {
            AustraliaModel model = (AustraliaModel) listOfAnimals.get(position);
            ((AustraliaHolder)holder).bind(model);
        }else if(holder instanceof AsiaHolder)
        {
            AsiaModel model = (AsiaModel) listOfAnimals.get(position);
            ((AsiaHolder)holder).bind(model);
        }else if(holder instanceof AmericaHolder)
        {
            AmericaModel model = (AmericaModel) listOfAnimals.get(position);
            ((AmericaHolder)holder).bind(model);
        }
    }


}
