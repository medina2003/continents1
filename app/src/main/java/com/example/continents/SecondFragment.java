package com.example.continents;

import static android.content.ContentValues.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    ArrayList<Model> data;
    private RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadData();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.Recyclerview_name);
        AdapterName adapterName = new AdapterName(data, new OnClickListener() {
            @Override
            public void onClick(String name) {

            }
        });
        recyclerView.setAdapter(adapterName);
    }

    private void loadData() {
        data = new ArrayList<>();
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            String name = bundle.getString("name");
            if (name != null) {
                if (name.equals("Северная Америка")) {
                    data.add(new Model(R.drawable.brasilia, "Бразиля"));
                    data.add(new Model(R.drawable.argentina, "Аргентина"));
                    data.add(new Model(R.drawable.peru, "перу"));
                    data.add(new Model(R.drawable.ecuador, "Экуадор"));
                    data.add(new Model(R.drawable.ic_rectangle, "Канада"));

                }
                if (name == "Африка") {
                    data.add(new Model(R.drawable.northafrika, "Южная африка"));
                    data.add(new Model(R.drawable.kenia, "кения"));
                    data.add(new Model(R.drawable.sengal, "сенгал"));
                    data.add(new Model(R.drawable.nigeria, "нигерия"));
                    data.add(new Model(R.drawable.gana, "гана"));



                }
                if (name == "Европа") {

                    data.add(new Model(R.drawable.francia, "Франция"));
                    data.add(new Model(R.drawable.italia, "Италия"));
                    data.add(new Model(R.drawable.iispania, "испания"));
                    data.add(new Model(R.drawable.portugalia, "Португалия"));
                    data.add(new Model(R.drawable.nigerlandy, "Нигерланды"));


                }
                if (name == "Евразия") {
                    data.add(new Model(R.drawable.uzbekistan, "Узбекистан"));
                    data.add(new Model(R.drawable.kazaxstan, "Казакзстан"));
                    data.add(new Model(R.drawable.kyrgyzstan, "Кыргызстан"));
                    data.add(new Model(R.drawable.afganistan, "Афганистан"));
                    data.add(new Model(R.drawable.tajicistan, "Таджикистан"));

                }
                if (name == "Австралия") {
                    data.add(new Model(R.drawable.austaralia, "Австралия"));
                    data.add(new Model(R.drawable.austaralia,"Новая Зеландия"));
                    data.add(new Model(R.drawable.ic_ph_3x,"Науру"));
                    data.add(new Model(R.drawable.ic_pe_2x,"Tувалу"));
                    data.add(new Model(R.drawable.ic_pr,"Тонга"));

                }
                if (name == "Антарктида") {
                    data.add(new Model(R.drawable.australianame, "Нет Стран"));
                }



            }
        }


    }
}