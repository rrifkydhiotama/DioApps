package com.example.dioapps;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SKLH extends ListActivity {

    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListSC = new String[]{"SMA Negeri 4 Pekanbaru", "SMA Santa Maria Pekanbaru", "SMA Negeri 1 Pekanbaru",
                "Sekolah Dasar Negeri 5", "SMA Islam An-Naas Pekanbaru"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListSC));
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
            if (pilihan.equals("SMA Negeri 4 Pekanbaru"))
            {
                a = new Intent(this, SKLHSMAN4.class);
                startActivity(a);
            } else if (pilihan.equals("SMA Santa Maria Pekanbaru"))
            {
                a = new Intent(this, SKLHSantaMaria.class);
                startActivity(a);
            } else if (pilihan.equals("SMA Negeri 1 Pekanbaru"))
            {
                a = new Intent(this, SKLHSMAN1.class);
                startActivity(a);
            } else if (pilihan.equals("Sekolah Dasar Negeri 5"))
            {
                a = new Intent(this, SKLHSDN5.class);
                startActivity(a);
            } else if (pilihan.equals("SMA Islam An-Naas Pekanbaru"))
            {
                a = new Intent(this, SKLHSMAIslamAnNaas.class);
                startActivity(a);
            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
