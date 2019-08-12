package com.yoda.universitas_swasta;

import java.util.ArrayList;

//Penambahan data ke array
public class Univ_Data {
    public static String[][] data = new String[][]{
            {"Universitas Islam Indonesia","Peringkat pertama diisi oleh Universitas Islam Indonesia (UII) yang berlokasi di Yogyakarta. ","https://cdn.idntimes.com/content-images/post/20190116/03012010931-efdd630fbd901f73b0c74d2131cb076f.jpg"},
            {"Universitas Katolik Atma Jaya Jakarta","Universitas Katolik Atma Jaya Jakarta menduduki peringkat kedua. Kampus ini memiliki dua gedung perkuliahan yag berlokasi di kawasan Semanggi, Jakarta Selatan dan Pluit, Jakarta Utara.","https://cdn.idntimes.com/content-images/post/20190116/slide-atmajaya-semanggi-692897629ec9489c1e03e79cbef4bb09.jpg"},
            {"Universitas Telkom","Universitas Telkom yang berlokasi di Jalan Terusan Buahbatu, Bandung menduduki peringkat kampus swasta terbaik ketiga di Indonesia","https://cdn.idntimes.com/content-images/post/20190116/1519125933-telkom-uni-efbd741e8d73b4b5897b4ccc204b2dbd.jpg"},
            {"Universitas Katolik Atma Jaya Yogyakarta","Awalnya, Atma Jaya Yogyakarta berdiri sebagai cabang dari kampus Jakarta. Pada tahun 1973, kampus ini akhirnya memisahkan diri dan berada di bawah Yayasan Slamet Rijadi sebagai lembaga pendidikan independen.","https://cdn.idntimes.com/content-images/post/20190116/gedung-perpus-pusat-b067fd9c9e15bc237b332c67cdb71088.jpg"},
            {"Universitas Katolik Parahyangan","Unika Parahyangan juga masuk dalam deretan kampus swasta bergengsi setelah Universitas Telkom. Lokasinya terletak di Jalan Ciumbuleuit, Hagermanah, Bandung.","https://cdn.idntimes.com/content-images/post/20190116/sl-pusat-pembelajaran-arntz-geisse-1050x525-251c07983663b89420a85b9c92d89904.jpg"},
            {"Universitas Muhammadiyah Malang","Universitas Muhammadiyah Malang yang populer dengan sebutan Kampus Putih. Julukan ini muncul karena gedung UM Malang didominasi warna putih.","https://cdn.idntimes.com/content-images/post/20190116/umm4-825x425-555c6fcf47a0c583de1b42fe02280ca1.jpg"},
            {"Universitas Muhammadiyah Surakarta","Dari 164 Perguruan Tinggi Muhammadiyah (PTM) yang ada di Indonesia, salah satu kampusnya berada di Surakarta. Universitas Muhammadiyah Surakarta (UMS) membuka kelas dari program sarjana hingga doktoral.","https://cdn.idntimes.com/content-images/post/20190116/ums-c2b3365c7d49f35f6f403cf4e42a3448.jpeg"},
            {"Universitas Katolik Soegijapranata","Peringkat kedelapan diisi Universitas Katolik Soegijapranata yang berlokasi di Jalan Pawiyatan Luhur, Semarang. Kampus ini berdiri di bawah naungan Yayasan Sandjojo yang berafiliasi dengan Keuskupan Agung Semarang.","https://cdn.idntimes.com/content-images/post/20190116/unika-f66c14a857867c6a6e3d711cc1b4b6e3.png"},
            {"Universitas Bina Nusantara","Kampus swasta di peringkat kesembilan ini gak perlu diragukan lagi kualitas dan popularitasnya. Banyak mahasiswanya yang berasal dari kalangan selebritis dan publik figur.","https://cdn.idntimes.com/content-images/post/20190116/9-universitas-bina-nusantara-810x608-kampusajacom-1-april-2018-dc02cae7f988a2ba13388dc9b9cec34c.jpg"},
            {"Universitas Kristen Petra","Berlokasi di Surabaya, Universitas Kristen Petra menempati peringkat ke-10 kampus swasta terbaik di Indonesia. Ada tujuh fakultas tersedia untuk jenjang S1, empat program magister dan kelas doktoral teknik sipil.","https://cdn.idntimes.com/content-images/post/20190116/mg-2872-e403ac651acb0638c6a10a076614df8e.jpg"}
    };

    //pencetakan data array secara berurutan
    public static ArrayList<Univ_Model> getListData(){
        ArrayList<Univ_Model> list = new ArrayList<>();
        for (String[] aData : data){
            Univ_Model univ = new Univ_Model();
            univ.setJudul(aData[0]);
            univ.setDetail(aData[1]);
            univ.setPhoto(aData[2]);

            list.add(univ);
        }

        return  list;
    }
}
