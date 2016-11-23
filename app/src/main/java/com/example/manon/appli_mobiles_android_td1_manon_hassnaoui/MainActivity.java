package com.example.manon.appli_mobiles_android_td1_manon_hassnaoui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.activity_main);

        //utilisé si les données affichéesne modifient pas la taille du recyclerview -> optimisation
        recyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);

        final ArrayList<Animal> AnimalList=new ArrayList<>();
        initList(AnimalList);

    }

    private void initList(ArrayList<Animal> animalList) {

        Animal croco = new Animal();
        croco.setName("Crocodile");
        croco.setType("Reptile");

        Animal crotale = new Animal();
        crotale.setName("Crotale");
        crotale.setType("Reptile");

        Animal koala = new Animal();
        koala.setName("koala");
        koala.setType("Mammifère");

        Animal marine = new Animal();
        marine.setName("Abrutie");
        marine.setType("Insecte");

        Animal moustique = new Animal();
        moustique.setName("Moustique");
        moustique.setType("Insecte");
    }


}
