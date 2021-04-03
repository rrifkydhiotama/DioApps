package com.example.dioapps;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSSyafira extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] ListAction = new String[]{"Call Center", "SMS Center", "Driving Direction",
                "Website", "Info di Google", "Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ListAction));
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

            if (pilihan.equals("Call Center")) {
                String nomorTel = "tel:+6282210003636";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(nomorTel));

            } else if (pilihan.equals("SMS Center")) {
                String smsText = "R.Rifky DhioTama /L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:082390560514"));
                a.putExtra("sms_body", smsText);

            } else if (pilihan.equals("Driving Direction")) {
                String lokasirs = "https://goo.gl/maps/XUsNkEQ6S2uftAeH8";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(lokasirs));

            } else if (pilihan.equals("Website")) {
                String website = "https://www.rs-syafira.com/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Info di Google")) {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY, "Rumah Sakit Syafira Pekanbaru");

            }
            startActivity(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

