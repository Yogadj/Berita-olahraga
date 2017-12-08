package com.yogadj.berita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListKategori extends AppCompatActivity {


    RecyclerView recyclerView;
    LinearLayoutManager linear;

    List<pojo> item;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_kategori);
        getSupportActionBar().setTitle("HOT NEWS");


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        linear = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linear);

        item = new ArrayList<>();
        item.add(new pojo(R.drawable.news, "Football", "Man City Menang, Guardiola Petik Pelajaran Berharga",
                "FoxSportNews - Manchester City berhasil melanjutkan kemenangan di Liga Inggris setelah menundukkan West Ham United dengan skor 2-1 pada pekan ke-15 di Stadion Etihad, Minggu (3/12/2017).\n" +
                        "\n" + "David Silva melalui tendangan akrobatiknya pada menit ke-84 memastikan The Citizens meraih kemenangan atas tim asuhan David Moyes tersebut.\n" +
                        "\n" + "Setelah pertandingan, Manajer Manchester City, Pep Guardiola, menyatakan bahwa dia telah mendapatkan pelajaran berharga setelah melawan West Ham.\n" +
                        "\n" + "Kami mengawali pertandingan dengan baik, tetapi kami benar-benar kehilangan kesabaran. Kami tak punya ritme ketika Adrian selalu memegang bola selama 30 detik,\n" + "ujar Guardiola dilansir BolaSport.com dari BBC.\n" +
                        "\n" + "Seperti laga-laga sebelumnya, pada babak kedua, kami selalu mencetak gol. Mereka meletakkan 10 pemain di kotak penalti, itu hampir tidak mungkin. Ini adalah kemenangan besar,\" ujarnya. \n" + "Guardiola juga mengakui adanya perubahan taktik pada babak kedua yang membuat Man City bermain dengan dua striker.\n" +
                        "\n" + "Kami berusaha mencoba untuk memecahkannya (saat lawan menggunakan formasi bertahan). Kami punya dua striker pada babak kedua dan itu berhasil, pelajaran berharga bagi kami. Kami menciptakan banyak peluang dengan dua striker,\" ujar Guardiola.\n" +
                        "\n" + "Kecepatan yang bagus, kami lebih bisa masuk ke dalam kotak penalti. Kevin de Bruyne bermain sebagai gelandang bertahan untuk mengatur tempo,\" kata pelatih asal Spanyol itu.\n" +
                        "\n" + "Soal pertahanannya yang kembali kebobolan, Guardiola bertekad tak akan mengulangi kesalahannya saat bertemu Manchester United pada pekan depan.\n" +
                        "\n" + "Berbicara soal cara bertahan lewat set-piece, mereka memiliki postur tinggi. Hal itu tak akan terjadi lagi pekan depan. Kami akan mencoba dan mencegah kebobolan saat menghadapi bola mati,\" ucapnya.\n"));
        item.add(new pojo(R.drawable.foto2, "Football", "Manchester city samai rekor kemenangan arsenal & chelsea ",
                "Harapan Manchester United melihat Manchester City tersandung urung terwujud. Untuk kali ketiga berturut-turut City mampu bangkit mengklaim tiga poin dari posisi tertinggal.\n" +
                        "\n" + "Setelah Huddersfield Town dan Southampton, pada Minggu (3/12) giliran West Ham United yang mesti menyerah menghadapi kekuatan ofensif dan ketangguhan mental anak-anak asuhan Pep Guardiola walau memimpin terlebih dahulu.\n" +
                        "\n" + "City membukukan keunggulan 2-1 berkat sontekan David Silva tujuh menit jelang bubaran, setelah sebelumnya Nicolas Otamendi membalas gol pembuka West Ham melalui sundulan Angelo Ogbonna. "));
        item.add(new pojo(R.drawable.foto3, "NBA", "Durant dan Curry Main Lagi, Warriors Kalahkan Lakers",
                "Los Angeles - Kevin Durant dan Stephen Curry sudah bermain lagi dan langsung membantu Golden State Warriors mengalahkan Los Angeles Lakers walaupun harus lewat overtime.\n" +
                        "\n" +
                        "Durant dan Curry absen saat Warriors dikalahkan Kings awal pekan ini. Keduanya kembali main di Staples Center, Kamis (30/11/2017) WIB, saat Warriors menang 127-123 dari Lakers.\n" +
                        "\n" +
                        "Dua pemain itu juga langsung memperlihatkan kontribusi besar dalam kemenangan Warriors. Durant, misalnya, yang mencetak poin terbanyak Warriors dan juga menjadi penampil terbaik timnya dengan 29 poin, tujuh rebound, dan lima assist.\n" +
                        "\n" +
                        "Sementara itu Curry menyumbang 28 poin, cuma kalah banyak dari Durant di Warriors. Curry membuat 13 poin di antaranya saat overtime.\n" +
                        "\n" +
                        "Hasil ini membuat Warriors langsung bangkit usai kekalahan atas Kings. Catatan tanding Warriors kini menjadi 16-6. Sedangkan buat Lakers, itu menjadi kekalahan ke-13 musim ini (8-13). "));
        item.add(new pojo(R.drawable.foto4, "Badminton", "Jadi Juara Kejurnas, Ahsan/Hendra Sampaikan Pesan untuk Para Juniornya",
                "Pangkalpinang - Mohammad Ahsan/Hendra Setiawan tampil sebagai juara Kejuaraan Nasional Bulutangkis 2017. Ahsan/Hendra punya pesan untuk para pebulutangkis junior. \n" +
                        "\n" +
                        "Ahsan/Hendra tampil sebagai juara nomor ganda putra di Kejurnas Bulutangkis 2017 setelah mengalahkan Frengky Wijaya Putra/Sabar Karyaman Gutama, Sabtu (2/12/2017). Pada laga final di GOR Sahabudin, Pangkalpinang, Bangka Belitung, Ahsan/Hendra menang dua game langsung 21-13 dan 21-17 dalam tempo 28 menit.\n" +
                        "\n" +
                        "Di Kejurnas Bulutangkis 2017, Ahsan/Hendra kembali berpasangan setelah sempat berpisah pada akhir tahun lalu. Mereka pun gembira karena langsung jadi juara usai rujuk.\n" +
                        "\n" +
                        "\"Senang bisa juara lagi setelah sekian lama berpisah. Ini menjadi ajang tolok ukur kemampuan kamis ejauh mana kami masih bisa bersaing,\" ujar Ahsan kepada badmintonindonesia.org.\n" +
                        "\n" +
                        "\"Tadi sebenarnya lawan bisa memberikan perlawanan, tapi di akhir-akhir mereka justru banyak melakukan kesalahan sendiri,\" sambung Hendra. \n" +
                        "\n" +
                        "Ahsan/Hendra belum tahu apakah mereka akan lanjut berpasangan pada tahun depan atau kembali berpisah.\n" +
                        "\n" +
                        "\"Kami tidak tahu ke depannya seperti apa. Yang jelas kami akan istirahat dulu di sisa akhir tahun ini. Dan untuk tahun depan saya tunggu instruksi pelatih saja,\" ujar Ahsan.\n" +
                        "\n" +
                        "\"Kalau saya dipanggil ke Pelatnas lagi, saya akan coba pikirkan lagi, karena sejauh ini memang belum ada pembicaraan apapun,\" sambung Hendra.\n" +
                        "\n" +
                        "Ahsan/Hendra pernah menjadi ganda putra yang paling disegani. Juara dunia di tahun 2013 dan 2015 ini pun berpesan kepada para juniornya untuk terus bekerja keras.\n" +
                        "\n" +
                        "\"Untuk atlet muda harus berusaha kerja keras lagi. Jangan cepat puas dengan apa yang sudah dicapai. Dan yang pasti harus sering berdoa,\" sambung Ahsan.\n" +
                        "\n" +
                        "\"Mereka masih muda dan masih perlu banyak pengalaman dan pelajaran yang harus dihadapi. Jadi jangan cepat puas dan jangan cepat menyerah,\" kata Hendra. "));
        item.add(new pojo(R.drawable.foto5, "MotoGP", "Titel ke-10 Jadi Target Pertama Rossi di 2018",
                "Milan - Valentino Rossi mencanangkan tiga target untuk MotoGP 2018. Yang pertama adalah meraih titel juara dunianya yang ke-10.\n" +
                        "\n" +
                        "Dalam karier membalap di kejuaraan dunia balap motor grand prix, Rossi sudah punya sembilan gelar juara dunia. Tujuh di antaranya di kelas primer.\n" +
                        "\n" +
                        "Semenjak 2009, rider Italia yang membela tim Movistar Yamaha tersebut belum mampu menambah koleksi titel. Tapi itu tak membuatnya patah semangat. Tahun depan ia kembali menargetkan tambahan koleksi tersebut.\n" +
                        "\n" +
                        "\"Targetnya adalah titel ke-10, itu takkan mudah tapi tidaklah mustahil,\" kata Rossi kepada BT Sport seperti dilansir GPOne.com.\n" +
                        "\n" +
                        "\"Itu merupakan target pertama, yang kedua adalah memenangi balapan-balapan. Yang ketiga adalah memperlihatkan sejumlah balapan yang bagus.\"\n" +
                        "\n" +
                        "\"Dalam 20 tahun membalap, saya sudah memahami bahwa perasaan yang bersemayam di diri Anda 12 jam usai sebuah kemenangan adalah satu-satunya pemberi motivasi sejati. Angka-angka dan rekor tidak penting,\" ucapnya.\n "));
        item.add(new pojo(R.drawable.foto6, "NBA", "Bulls Telan Kekalahan ke-18, yang ke-8 secara Beruntun",
                "Chicago - Sacramento Kings memberi hantaman teranyar untuk Chicago Bulls. Kings menang di kandang Bulls, yang kini sudah melewati rentetan delapan kekalahan.\n" +
                        "\n" +
                        "Bulls kalah setengah bola, 106-107, ketika menjamu Kings di United Center, Sabtu (2/12/2017). Itu merupakan kekalahan ke-18 Bulls di musim reguler kali ini (3-18), juga yang kedelapan berturut-turut.\n" +
                        "\n" +
                        "Pertarungan kedua tim tersebut sebenarnya berjalan relatif imbang. Kedua tim bahkan membuat jumlah poin yang sama persis di kuarter ketiga dan keempat. Yang menjadi pembeda dalam hasil akhir di partai ini praktis adalah pencapaian poin di paruh pertama.\n" +
                        "\n" +
                        "Bulls mampu mengungguli Kings 31-29 di kuarter pertama. Tapi Kings kemudian gantian memimpin 61-60 atas Bulls di akhir kuarter kedua. Mereka kemudian sama-sama menambah 21 poin dan 25 poin di dua kuarter berikutnya.\n" +
                        "\n" +
                        "Menariknya, ini juga menjadi kali kedua beruntun Bulls kalah dengan selisih satu poin saja. Tepat sebelum ini mereka juga tunduk 110-110 dari Denver Nuggets.\n" +
                        "\n" +
                        "Dengan catatan tandingnya saat ini Bulls menjadi tim terburuk secara keseluruhan di musim reguler sejauh ini. Sementara Kings sedikit lebih baik dengan catatan 7-15.\n "));



        adapter = new Adapter(this, item);

        recyclerView.setAdapter(adapter);

    }
}


