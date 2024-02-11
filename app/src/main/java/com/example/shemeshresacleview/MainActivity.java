package com.example.shemeshresacleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        List<item> items = new ArrayList<item>();
        items.add(new item("Nachum Shemesh", " A miser of Romanian descent from Beersheba who moved to Tel Aviv to open a restaurant." + " An avid fan of the football club Hapoel Be'er Sheva", R.drawable.a));
        items.add(new item("Etti Hillel", "A waitress of Yemenite descent at the \"Empire of the sun\". Originally from Lod," + " Etti moved to Tel Aviv looking to become a famous actress", R.drawable.b));
        items.add(new item("Sassi", "\"The Empire's\" cook, as well as Shemesh' personal assistant, from Ness Ziona. " + "He is often the subject of ridicule, mainly from Shemesh, for his short stature and low intelligence.", R.drawable.c));
        items.add(new item("Ogen Siton", "A dumb blonde stereotype, Ogen is a close friend and love interest of Sassi," + " with whom she is often seen.", R.drawable.d));
        items.add(new item("Yshayahu Tenzer", "The upstairs neighbor of Shemesh' restaurant. " +"A lawyer with an affection for causing chaos and harm to others, as well as a deep love for pastrami sandwiches, Tenzer is often referred to as a \"maniac", R.drawable.e));
        items.add(new item("Bar Sela ", "A child who is best friends with Shemesh. He often hangs around at the Empire with Shemesh,." + " , Shemesh and Bar share a connection in which Shemesh serves as a sort of father figure in Bar's life,.", R.drawable.f));
        items.add(new item("Rakefet Sela ", " Bar's often neglectful mother, a spiritual guru of French origin. During the first season she is portrayed as having a sort of friendly-rivalry with Shemesh, as well as a close friendship with Etti. ", R.drawable.g));
        items.add(new item("Mano Bari", "A handsome, charming student of philosophy who moves to Israel from Italy. During season 2 he develops a relationship with Etti.", R.drawable.h));
        items.add(new item("Hemmi ", "Copywriter and director of television commercials. He is portrayed as a Yuppie, seeking success in the Tel Avivi \"scene\". He is introduced in season 4 as a romantic rival for Sassi over Ogen.", R.drawable.i));
        items.add(new item("Marcus Emek", " Marcus is  business man, who is contacted by Shemesh to help save his failing restaurant." +"  he serves as the representative of the unknown Lessees of the Empire, only referred to as \"the Koreans\". ", R.drawable.j));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}