package com.juaracoding.utils;

public enum TestCases {

    T6("User Input Valid Username And Password"),

    T201("TP001 User Mengunjungi Halaman Perizinan menggunakan Sidebar Menu"),
    T202("TP002 User mengunjungi halaman Input Data Perizinan"),
    T203("TP003 User Berhasil Menambahkan Data Perizinan"),
    T204("TP004 User Tidak Memasukkan Data Apapun"),
    T205("TP005 User Tidak input Nomor Perizinan"),

    T206("TP006 User Tidak Input Nama Perizinan"),
    T207("TP007 User Tidak Input Tanggal Mulai"),
    T208("TP008 User Tidak Input Tanggal Akhir"),
    T209("TP009 User Tidak Input Diterbitkan Oleh"),
    T210("TP010 User Tidak Input Deskripsi"),

    T211("TP011 User Tidak Input Pemilik Dokumen"),
    T212("TP012 User Tidak Input Dibuat Oleh"),
    T213("TP013 User Tidak Input Tim Terkait"),
    T214("TP014 User Tidak Input Tanggal Reminder"),
    T215("TP015 User Tidak Input Jenis Media"),

    T216("TP016 User Input Tanggal Berakhir Di Bawah Tanggal Mulai"),
    T217("TP017 User Input Tanggal Reminder Di Bawah Tanggal Mulai"),
    T218("TP018 User Menambahkan File PDF"),
    T219("TP019 User Menambahkan File DOCX"),
    T220("TP020 User Hanya Memasukkan Data Kosong dan Invalid"),

    T221("TP021 User Tidak Memilih Share dengan Departemen"),
    T222("TP022 User Hanya Memasukkan Data Kosong dan Invalid"),
    T223("TP023 User Mencari berdasarkan Nomor Perizinan"),
    T224("TP024 User Mencari berdasarkan Nama Perizinan"),
    T225("TP025 User Mencari berdasarkan Departemen"),

    T226("TP026 User Mencari berdasarkan File yang Ada"),
    T227("TP027 User Mencari berdasarkan File yang Tidak Ada"),
    T228("TP028 User Mencari berdasarkan Nomor Perizinan Invalid"),
    T229("TP029 User Mencari berdasarkan Nama Perizinan Invalid"),
    T230("TP030 User ke Halaman View Data"),

    T231("TP031 User Melihat File DOCX yang sudah Ditambahkan"),
    T232("TP032 User Melihat File PDF yang sudah Ditambahkan"),
    T233("TP033 User ke Halaman Edit Data"),
    T234("User Logout");

    private String testCasesName;

    TestCases(String value){
        testCasesName = value;
    }

    public String getTestCasesName(){
        return testCasesName;
    }
}
