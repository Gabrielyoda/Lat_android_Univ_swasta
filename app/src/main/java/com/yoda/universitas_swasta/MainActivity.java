package com.yoda.universitas_swasta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private RecyclerView rv_uni_swas;
    private ArrayList<Univ_Model> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        rv_uni_swas = findViewById(R.id.rv_uni_swas);
        rv_uni_swas.setHasFixedSize(true);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        list.addAll(Univ_Data.getListData());
        showRecyleList();
    }

    //class untuk menampilakan Recylelist
    private void showRecyleList(){
        rv_uni_swas.setLayoutManager(new LinearLayoutManager(this));
        ListUnivAdapter listUnivAdapter = new ListUnivAdapter(list);
        rv_uni_swas.setAdapter(listUnivAdapter);

        listUnivAdapter.setOnItemClickCallback(new ListUnivAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Univ_Model data) {
                showSelectedUniv(data);
            }
        });

    }

    //Perpindahan intent dengan Selected list dan pengiriman parameter perpindahan
    private void showSelectedUniv(Univ_Model univ) {
        //Toast.makeText(this, "Kamu memilih " + univ.getJudul(), Toast.LENGTH_SHORT).show();
        Intent pindah = new Intent(MainActivity.this, Detail.class);
        pindah.putExtra(Detail.EXTRA_Judul, univ.getJudul());
        pindah.putExtra(Detail.EXTRA_Detail, univ.getDetail());
        pindah.putExtra(Detail.EXTRA_Foto, univ.getPhoto());
        startActivity(pindah);
    }

    //pengaturan tombol back
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            finish();
        }
    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_profile) {
            Intent intent = new Intent(MainActivity.this, Profile.class);
            startActivity(intent);

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
