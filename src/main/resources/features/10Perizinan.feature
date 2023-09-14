Feature: Perizinan Page Test
  #  Halaman Perizinan #
  Scenario: TP001 User Mengunjungi Halaman Perizinan menggunakan Sidebar Menu
    When User Klik Menu Perizinan di Sidebar
    Then User Berhasil Menampilkan Halaman Perizinan

  # Halaman Input Perizinan #
  Scenario: TP002 User mengunjungi halaman Input Data Perizinan
    When User Klik Tombol Input Data
    Then User Berhasil Menampilkan Halaman Input Data Perizinan

  # Input Data Perizinan # POSITIF
  Scenario: User Mendapatkan Hasil Pencarian
    #When User Klik Tombol Input Data
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Tanggal Reminder
    And User Input Jenis Media
    And User Input Jumlah Dokumen
    And User Pilih File PDF Dokumen di Explorer
    And User Input Share
    And User Input Status Dokumen
    And User Klik Simpan
    Then User Berhasil Menyimpan Data

# Input Data Perizinan # NEGATIF
  Scenario: TP004 User Tidak Memasukkan Data Apapun
    When User Klik Tombol Input Data
    And User Klik Simpan
#    When User Klik Simpan
    Then Menampilkan Alert di Kolom Nomor Dokumen

  Scenario: TP005 User Tidak input Nomor Perizinan
    Given Refresh Halaman
    When User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Tanggal Reminder
    And User Input Jenis Media
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Nomor Dokumen

  Scenario: TP006 User Tidak Input Nama Perizinan
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Nama Perizinan

  Scenario: TP007 User Tidak Input Tanggal Mulai
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Tanggal Mulai

  Scenario: TP008 User Tidak Input Tanggal Akhir
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Tanggal Akhir

  Scenario: TP009 User Tidak Input Diterbitkan Oleh
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Diterbitkan Oleh

  Scenario: TP010 User Tidak Input Deskripsi
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Deskripsi

  Scenario: TP011 User Tidak Input Pemilik Dokumen
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Pemilik Dokumen

  Scenario: TP012 User Tidak Input Dibuat Oleh
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Dibuat Oleh

  Scenario: TP013 User Tidak Input Tim Terkait
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Tim Terkait

  Scenario: TP014 User Tidak Input Tanggal Reminder
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Tanggal Reminder

  Scenario: TP015 User Tidak Input Jenis Media
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Tanggal Reminder
    And User Klik Simpan
    Then Menampilkan Alert di Kolom Jenis Media

  Scenario: TP016 User Input Tanggal Berakhir Di Bawah Tanggal Mulai
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Invalid Tanggal Mulai Perizinan
    And User Input Invalid Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Tanggal Reminder
    And User Input Jenis Media
    #And User Klik Simpan
    Then Menampilkan Alert Tanggal Akhir Tidak boleh Lebih Kecil

  Scenario: TP017 User Input Tanggal Reminder Di Bawah Tanggal Mulai
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Invalid Tanggal Mulai Perizinan
    And User Input Invalid Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Invalid Tanggal Reminder
    And User Input Jenis Media
    #And User Klik Simpan
    Then Menampilkan Alert di Kolom Tanggal Reminder Tidak Boleh Lebih Kecil

  Scenario: TP018 User Menambahkan File PDF
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Tanggal Reminder
    And User Input Jenis Media
    And User Input Jumlah Dokumen
    And User Pilih File PDF Dokumen di Explorer
    Then User Berhasil Diupload File PDF

  Scenario: TP019 User Menambahkan File DOCX
    Given Refresh Halaman
    When User Input Nomor Perizinan
    And User Input Nama Perizinan
    And User Input Tanggal Mulai Perizinan
    And User Input Tanggal Berakhir Perizinan
    And User Input Diterbitkan Oleh
    And User Input Deskripsi
    And User Input Pemilik Dokumen
    And User Input Dibuat Oleh
    And User Input Tim Terkait
    And User Input Tanggal Reminder
    And User Input Jenis Media
    And User Input Jumlah Dokumen
    And User Pilih File DOCX Dokumen di Explorer
    Then User Berhasil Diupload File DOCX

  Scenario: TP020 User Memilih Share dengan Departemen
    Given Refresh Halaman
    When User Pilih Share Ya
    Then User Menampilkan Departemen Akses

  Scenario: TP021 User Tidak Memilih Share dengan Departemen
    Given Refresh Halaman
    When User Pilih Share Tidak
    Then User Tidak Menampilkan Departemen Akses

  Scenario: TP022 User Hanya Memasukkan Data Kosong dan Invalid
    Given Refresh Halaman
    When User Input Invalid Nomor Perizinan
    And User Input Invalid Nama Perizinan
    And User Input Invalid Tanggal Mulai Perizinan Today
    And User Input Invalid Tanggal Berakhir Perizinan Today
    And User Input Invalid Diterbitkan Oleh
    And User Input Invalid Deskripsi
    And User Input Invalid Pemilik Dokumen
    And User Input Invalid Dibuat Oleh
    And User Input Invalid Tim Terkait
    And User Input Invalid Tanggal Reminder Today
    And User Input Invalid Jenis Media
    And User Klik Simpan
    Then Menampilkan Alert Data Tidak Boleh Kosong

  # Pencarian data Perizinan #
  Scenario: TP023 User Mencari berdasarkan Nomor Perizinan
    #Given Kembali ke halaman sebelumnya # <seharusnya ini, tp skrng mashi kesimpen
    Given Refresh Halaman
    When User Memasukkan Keyword di Kolom Pencarian Nomor Perizinan
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Pencarian yang Sesuai dari Nomor Perizinan

  Scenario: TP024 User Mencari berdasarkan Nama Perizinan
    Given Refresh Halaman
    When User Memasukkan Keyword di Kolom Pencarian Nama Perizinan
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Pencarian yang Sesuai dari Nama Perizinan

  Scenario: TP025 User Mencari berdasarkan Departemen
    Given Refresh Halaman
    When User Memasukkan Keyword di Kolom Pencarian Departemen
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Pencarian yang Sesuai dari Departemen

  Scenario: TP026 User Mencari berdasarkan File yang Ada
    Given Refresh Halaman
    When User Memasukkan Keyword di Kolom Pencarian Ketersediaan File Ada
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Pencarian

  Scenario: TP027 User Mencari berdasarkan File yang Tidak Ada
    Given Refresh Halaman
    When User Memasukkan Keyword di Kolom Pencarian Ketersediaan File Tidak Ada
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Pencarian

  Scenario: TP028 User Mencari berdasarkan Nomor Perizinan Invalid
    Given Refresh Halaman
    When User Memasukkan Keyword Invalid di Kolom Pencarian Nomor Perizinan
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Tidak Ditemukan

  Scenario: TP029 User Mencari berdasarkan Nama Perizinan Invalid
    Given Refresh Halaman
    When User Memasukkan Keyword Invalid di Kolom Pencarian Nama Perizinan
    And User Klik Filter
    Then User Cek Jumlah File
    And User Mendapatkan Hasil Tidak Ditemukan

  Scenario: TP030 User ke Halaman View Data
    Given Refresh Halaman
    When User Pilih Satu Data dan Klik Show Data
    And User Klik View
    Then User Berhasil Menampilkan Halaman View Data Perizinan

  Scenario: TP031 User Melihat File DOCX yang sudah Ditambahkan
    Given Kembali ke halaman sebelumnya
    When User Memasukkan Keyword DOCX
    And User Klik Filter
    And User Pilih Data dan Klik Show Data
    And User Klik View
    And User Klik View
    Then User Verifikasi Unduhan Berhasil

  Scenario: TP032 User Melihat File PDF yang sudah Ditambahkan
    Given Kembali ke halaman sebelumnya
    When User Memasukkan Keyword PDF
    And User Klik Filter
    And User Pilih Data dan Klik Show Data
    And User Klik View
    And User Klik View
    Then User Bisa Melihat File Pdf

  Scenario: TP033 User ke Halaman Edit Data
    Given Kembali ke halaman sebelumnya
    When User Pilih Satu Data dan Klik Show Data
    And User Klik Edit
    Then User Berhasil Menampilkan Halaman Edit Data Perizinan
