/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author muthm
 */

import java.util.ArrayList;

public class Posttest1 {
    public static void main(String[] args) {
        // Membuat ArrayList Untuk Menyimpan Objek Musik
        ArrayList<Musik> musics = new ArrayList<>();
        
        // Menambahkan Objek Ke Dalam ArrayList
        musics.add(new Musik("Dan", "Sheila On 7", 1999));
        musics.add(new Musik("Merasa Indah", "Tiara Andhini", 2021));
        musics.add(new Musik("Super Shy", "New Jeans", 2023));
        musics.add(new Musik("Dar+ling", "Seventeen", 2022));
        musics.add(new Musik("Seven", "Jungkook", 2023));
        musics.add(new Musik("Hati-Hati Di Jalan", "Tulus", 2022));
        
        System.out.println("================================================================");
        System.out.println("                          DAFTAR MUSIK");
        System.out.println("================================================================");
        
        // Menampilkan Objek Dalam ArrayList Menggunakan Perulangan
        for (int i=0; i<6; i++){
            Musik musik = musics.get(i);
            System.out.println((i+1) + "." + " Lagu " + musik.judul + " oleh " + 
                    musik.penyanyi + " yang dirilis tahun " + musik.tahunRilis);
        }
    }
}
