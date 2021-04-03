package com.example.dioapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SM extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListMR = new String[]{"Hypermart Mal SKA", "Planet Swalayan Marpoyan", "Giant Ekstra Tuanku Tambusai",
                "Pesona Swalayan", "New Planet Swalayan Garuda Sakti"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListMR));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);

    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Hypermart Mal SKA"))
            {
                a = new Intent(this, SMHyperMalSKA.class);
                startActivity(a);
            } else if (pilihan.equals("Planet Swalayan Marpoyan"))
            {
                a = new Intent(this, SMPlanetMarpoyan.class);
                startActivity(a);
            } else if (pilihan.equals("Giant Ekstra Tuanku Tambusai"))
            {
                a = new Intent(this, SMGiantExTuankuTambusai.class);
                startActivity(a);
            } else if (pilihan.equals("Pesona Swalayan"))
            {
                a = new Intent(this, SMPesonaS.class);
                startActivity(a);
            } else if (pilihan.equals("New Planet Swalayan Garuda Sakti"))
            {
                a = new Intent(this, SMGarudaSaki.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
