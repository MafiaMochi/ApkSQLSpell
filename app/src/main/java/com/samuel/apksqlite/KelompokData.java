package com.samuel.apksqlite;

import java.util.ArrayList;

public class KelompokData {
    private static String[] NamaKelompok = {
            "Vahriansya.HS",
            "Mohammad Tri Putra",
            "Idhamsyahreza",
            "Junaidy Christison Nainggolan",
            "MafiaMochi"
    };

    private static String[] StambukKelompok = {
            "F55117162",
            "F55117077",
            "F55117061",
            "F55117146",
            "F55117059"
    };

    private static String[] EmailKelompok = {
            "vahriansyah.hs@gmail.com",
            "moh.triputraXIrpl@gmail.com",
            "idham.tadulako@gmail.com",
            "junaedychristison@gmail.com",
            "sibarani691@gamil.com"

    };

    private static int[] ImagesKelompok = {
            R.drawable.khori,
            R.drawable.tri,
            R.drawable.idham,
            R.drawable.chris,
            R.drawable.flicker
    };

    static ArrayList<Kelompok> getListData() {
        ArrayList<Kelompok> grup = new ArrayList<>();
        for (int position = 0; position < NamaKelompok.length; position++) {
            Kelompok kelompok = new Kelompok();
            kelompok.setNama(NamaKelompok[position]);
            kelompok.setStambuk(StambukKelompok[position]);
            kelompok.setEmail(EmailKelompok[position]);
            kelompok.setFoto(ImagesKelompok[position]);
            grup.add(kelompok);
        }
        return grup;
    }
}
