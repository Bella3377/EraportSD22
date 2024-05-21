package com.guru.EraportSD;



import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Drawer extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ImageView ivMenu;
    private RecyclerView rvMenu;
    static ArrayList<String> arrayList = new ArrayList<>();
    static ArrayList<Integer> image = new ArrayList<>();
    private MainDrawerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_drawer);






            drawerLayout = findViewById(R.id.drawerLayout2);
            ivMenu = findViewById(R.id.ivMenu);
            rvMenu = findViewById(R.id.rvMenu);

            arrayList.clear();
            arrayList.add("Beranda");
            arrayList.add("Biodata");
            arrayList.add("Tema 1");
            arrayList.add("Tema 2");
            arrayList.add("Tema 3");
            arrayList.add("Tema 4");
            arrayList.add("Tema 5");
            arrayList.add("Tema 6");
            arrayList.add("Tema 7");
            arrayList.add("Tema 8");
            arrayList.add("Absensi");
            arrayList.add("Raport Semester 1");
            arrayList.add("Raport Semester 2");
            arrayList.add("KELUAR");

            image.add(R.drawable.ic_baseline_login_24);
            image.add(R.drawable.ic_baseline_person_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_edit_document_24);
            image.add(R.drawable.baseline_calendar_today_24);
            image.add(R.drawable.baseline_table_view_24);
            image.add(R.drawable.baseline_table_view_24);
            image.add(R.drawable.ic_baseline_login_24);

            adapter = new MainDrawerAdapter(this, arrayList, image);

            rvMenu.setLayoutManager(new LinearLayoutManager(this));

            rvMenu.setAdapter(adapter);

            ivMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    drawerLayout.openDrawer(GravityCompat.START);
                }

            });

            }


        }



