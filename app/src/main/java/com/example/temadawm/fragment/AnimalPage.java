package com.example.temadawm.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.temadawm.adapter.Adapter;
import com.example.temadawm.model.AfricaModel;
import com.example.temadawm.model.AmericaModel;
import com.example.temadawm.model.AsiaModel;
import com.example.temadawm.model.AustraliaModel;
import com.example.temadawm.model.EuropeModel;
import com.example.temadawm.model.continent;
import com.example.temadawm.model.Animal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.temadawm.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class AnimalPage extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_animal_page, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @NonNull Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);

        RecyclerView recyclerView = view.findViewById(R.id.Table);

        List<Animal> listOfAnimals = new ArrayList<>();


        listOfAnimals.add(new AfricaModel("Leu african","Africa"));
        listOfAnimals.add(new AfricaModel("Elefant african","Africa"));
        listOfAnimals.add(new AfricaModel("Hipopotam","Africa"));
        listOfAnimals.add(new AfricaModel("Ghepard","Africa"));
        listOfAnimals.add(new AfricaModel("Rinocer","Africa"));
        listOfAnimals.add(new AfricaModel("Girafa","Africa"));
        listOfAnimals.add(new AfricaModel("Chimpanzeu","Africa"));
        listOfAnimals.add(new AfricaModel("Gazela Thomson","Africa"));
        listOfAnimals.add(new AfricaModel("Crocodil de Nil", "Africa"));

        listOfAnimals.add(new AsiaModel("Tigru siberian","Asia"));
        listOfAnimals.add(new AsiaModel("Urs panda gigant","Asia"));
        listOfAnimals.add(new AsiaModel("Elefant asiatic","Asia"));
        listOfAnimals.add(new AsiaModel("Leu asiatic","Asia"));
        listOfAnimals.add(new AsiaModel("Gaur","Asia"));
        listOfAnimals.add(new AsiaModel("Leopardul zapezilor","Asia"));
        listOfAnimals.add(new AsiaModel("Iepure salbatic","Asia"));
        listOfAnimals.add(new AsiaModel("Liliac mare","Asia"));
        listOfAnimals.add(new AsiaModel("Vultur crestat","Asia"));

        listOfAnimals.add(new AmericaModel("Jaguar", "America"));
        listOfAnimals.add(new AmericaModel("Lup rosu", "America"));
        listOfAnimals.add(new AmericaModel("Veveriță din Arhipelagul Alexander", "America"));
        listOfAnimals.add(new AmericaModel("Tapir sud-american", "America"));
        listOfAnimals.add(new AmericaModel("Condor andin ", "America"));
        listOfAnimals.add(new AmericaModel("Caimanul negru ", "America"));
        listOfAnimals.add(new AmericaModel("Urs grizzly", "America"));
        listOfAnimals.add(new AmericaModel("Guanacco", "America"));
        listOfAnimals.add(new AmericaModel("Vultur de California", "America"));
        listOfAnimals.add(new AmericaModel("Piranha", "America"));

        listOfAnimals.add(new AustraliaModel("Cangurul rosu", "Australia"));
        listOfAnimals.add(new AustraliaModel("Dingo", "Australia"));
        listOfAnimals.add(new AustraliaModel("Wombat", "Australia"));
        listOfAnimals.add(new AustraliaModel("Koala", "Australia"));
        listOfAnimals.add(new AustraliaModel("Ornitorinc", "Australia"));
        listOfAnimals.add(new AustraliaModel("Emu", "Australia"));
        listOfAnimals.add(new AustraliaModel("Wallaby", "Australia"));
        listOfAnimals.add(new AustraliaModel("Vulturul paducelui", "Australia"));
        listOfAnimals.add(new AustraliaModel("Soparla cu guler", "Australia"));
        listOfAnimals.add(new AustraliaModel("Vanturelul australian", "Australia"));

        listOfAnimals.add(new EuropeModel("Ursul brun", "Europa"));
        listOfAnimals.add(new EuropeModel("Ras eurastic", "Europa"));
        listOfAnimals.add(new EuropeModel("Lup cenusiu", "Europa"));
        listOfAnimals.add(new EuropeModel("Ciocanitoare verde", "Europa"));
        listOfAnimals.add(new EuropeModel("Caprioara", "Europa"));
        listOfAnimals.add(new EuropeModel("Vipera comuna", "Europa"));
        listOfAnimals.add(new EuropeModel("Vanturel rosu", "Europa"));
        listOfAnimals.add(new EuropeModel("Arici", "Europa"));
        listOfAnimals.add(new EuropeModel("Vidra", "Europa"));
        listOfAnimals.add(new EuropeModel("Patrav de munte", "Europa"));

        Adapter adapter = new Adapter(listOfAnimals);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }



}