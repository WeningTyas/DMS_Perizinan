package com.juaracoding;

import com.juaracoding.pages.InputPerizinanPage;
import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.PerizinanPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestPerizinan {
    static WebDriver driver;
    static ExtentTest extentTest;
    static PerizinanPage perizinanPage = new PerizinanPage();
    static InputPerizinanPage inputPerizinanPage = new InputPerizinanPage();

    public TestPerizinan() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Refresh Halaman")
    public void refresh_halaman() {
        driver.navigate().refresh();
    }

    @Given("Kembali ke halaman sebelumnya")
    public void back_halaman() {
        driver.navigate().back();
    }

    // ============================ WHEN =============================== //
    @When("User Klik Menu Perizinan di Sidebar")
    public void user_klik_menu_perizinan_di_sidebar() {
        perizinanPage.clickMenuPerizinan();
        extentTest.log(LogStatus.PASS, "User Klik Menu Perizinan di Sidebar");
    }

    @When("User Klik Tombol Input Data")
    public void user_klik_tombol_input_data() {
        perizinanPage.clickBtnInputData();
        extentTest.log(LogStatus.PASS, "User Klik Tombol Input Data");
    }

    @When("User Input Nomor Perizinan")
    public void user_input_nomor_perizinan() {
        inputPerizinanPage.addNomorPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Nomor Perizinan");
    }

    @When("User Input Invalid Nomor Perizinan")
    public void user_input_invalid_nomor_perizinan() {
        inputPerizinanPage.addInvalidNomorPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Invalid Nomor Perizinan");
    }

    @When("User Pilih Share Ya")
    public void user_input_shared_yes() {
        inputPerizinanPage.addShareYes();
        extentTest.log(LogStatus.PASS, "User Pilih Share Ya");
    }

    @When("User Pilih Share Tidak")
    public void user_input_shared_no() {
        inputPerizinanPage.addShareNo();
        extentTest.log(LogStatus.PASS, "User Pilih Share Tidak");
    }

    @When("User Memasukkan Keyword di Kolom Pencarian Nomor Perizinan")
    public void user_input_filter_Nomor() {
        perizinanPage.searchNoPerizinan();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword di Kolom Pencarian Nomor Perizinan");
    }

    @When("User Memasukkan Keyword di Kolom Pencarian Nama Perizinan")
    public void user_input_filter_nama() {
        perizinanPage.searchNamaPerizinan();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword di Kolom Pencarian Nama Perizinan");
    }

    @When("User Memasukkan Keyword di Kolom Pencarian Departemen")
    public void user_input_filter_departemen() {
        perizinanPage.searchDepartemen();
        System.out.println("drowdown kosong");
        Assert.assertEquals(" ", "IT Programmer");
        extentTest.log(LogStatus.FAIL, "User Memasukkan Keyword di Kolom Pencarian Departemen");
    }

    @When("User Memasukkan Keyword di Kolom Pencarian Ketersediaan File Ada")
    public void user_input_ada_file() {
        perizinanPage.searchFileAda();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword di Kolom Pencarian Ketersediaan File Ada");
    }

    @When("User Memasukkan Keyword di Kolom Pencarian Ketersediaan File Tidak Ada")
    public void user_input_tidak_ada_file() {
        perizinanPage.searchFileTidakAda();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword di Kolom Pencarian Ketersediaan File Tidak Ada");
    }

    @When("User Memasukkan Keyword Invalid di Kolom Pencarian Nomor Perizinan")
    public void user_input_filter_Nomor_invalid() {
        perizinanPage.searchNoPerizinanInvalid();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword Invalid di Kolom Pencarian Nomor Perizinan");
    }

    @When("User Memasukkan Keyword Invalid di Kolom Pencarian Nama Perizinan")
    public void user_input_filter_nama_invalid() {
        perizinanPage.searchNamaPerizinanInvalid();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword Invalid di Kolom Pencarian Nama Perizinan");
    }

    @When("User Pilih Satu Data dan Klik Show Data")
    public void user_klik_show() {
        DriverSingleton.delay(2);
        perizinanPage.clickListData(4);
        extentTest.log(LogStatus.PASS, "User Pilih Satu Data dan Klik Show Data");
    }
    @When("User Memasukkan Keyword DOCX")
    public void user_input_filter_no_docx() {
        perizinanPage.searchNoPerizinanViewDOCX();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword DOCX");
    }
    @When("User Memasukkan Keyword PDF")
    public void user_input_filter_no_pdf(){
        perizinanPage.searchNoPerizinanViewPDF();
        extentTest.log(LogStatus.PASS, "User Memasukkan Keyword PDF");
    }


    // ============================ AND =============================== //
    @And("User Input Nama Perizinan")
    public void user_input_nama_perizinan() {
        inputPerizinanPage.addNamaPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Nama Perizinan");
    }

    @And("User Input Invalid Nama Perizinan")
    public void user_input_invalid_nama_perizinan() {
        inputPerizinanPage.addInvalidNamaPerizinan();
        extentTest.log(LogStatus.PASS, "User Input Invalid Nama Perizinan");
    }

    @And("User Input Tanggal Mulai Perizinan")
    public void user_input_tgl_mulai() {
        inputPerizinanPage.addTglAwal();
        extentTest.log(LogStatus.PASS, "User Input Tanggal Mulai Perizinan");
    }

    @And("User Input Invalid Tanggal Mulai Perizinan")
    public void user_input_invalid_tgl_mulai() {
        inputPerizinanPage.addInvalidTglAwal();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Mulai Perizinan");
    }

    @And("User Input Invalid Tanggal Mulai Perizinan Today")
    public void user_input_invalid_tgl_mulai_today() {
        inputPerizinanPage.addInvalidTglAwalToday();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Mulai Perizinan");
    }

    @And("User Input Tanggal Berakhir Perizinan")
    public void user_input_tgl_akhir() {
        inputPerizinanPage.addTglAkhir();
        extentTest.log(LogStatus.PASS, "User Input Tanggal Berakhir Perizinan");
    }

    @And("User Input Invalid Tanggal Berakhir Perizinan")
    public void user_input_invalid_tgl_akhir() {
        inputPerizinanPage.addInvalidTglAkhir();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Berakhir Perizinan");
    }

    @And("User Input Invalid Tanggal Berakhir Perizinan Today")
    public void user_input_invalid_tgl_akhir_today() {
        inputPerizinanPage.addInvalidTglAkhirToday();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Berakhir Perizinan Today");
    }

    @And("User Input Diterbitkan Oleh")
    public void user_input_diterbitkan() {
        inputPerizinanPage.addDiterbitkan();
        extentTest.log(LogStatus.PASS, "User Input Diterbitkan Oleh");
    }

    @And("User Input Invalid Diterbitkan Oleh")
    public void user_input_Invalid_diterbitkan() {
        inputPerizinanPage.addInvalidDiterbitkan();
        extentTest.log(LogStatus.PASS, "User Input Invalid Diterbitkan Oleh");
    }

    @And("User Input Deskripsi")
    public void user_input_desc() {
        inputPerizinanPage.addDeskripsi();
        extentTest.log(LogStatus.PASS, "User Input Deskripsi");
    }

    @And("User Input Invalid Deskripsi")
    public void user_input_invalid_desc() {
        inputPerizinanPage.addInvalidDeskripsi();
        extentTest.log(LogStatus.PASS, "User Input Invalid Deskripsi");
    }

    @And("User Input Pemilik Dokumen")
    public void user_input_pemilik() {
        inputPerizinanPage.addPemilik();
        extentTest.log(LogStatus.PASS, "User Input Pemilik Dokumen");
    }

    @And("User Input Invalid Pemilik Dokumen")
    public void user_input_invalid_pemilik() {
        inputPerizinanPage.addInvalidPemilik();
        extentTest.log(LogStatus.PASS, "User Input Invalid Pemilik Dokumen");
    }

    @And("User Input Dibuat Oleh")
    public void user_input_dibuat_oleh() {
        inputPerizinanPage.addDibuatOleh();
        extentTest.log(LogStatus.PASS, "User Input Dibuat Oleh");
    }

    @And("User Input Invalid Dibuat Oleh")
    public void user_input_invalid_dibuat_oleh() {
        inputPerizinanPage.addInvalidDibuatOleh();
        extentTest.log(LogStatus.PASS, "User Input Invalid Dibuat Oleh");
    }

    @And("User Input Tim Terkait")
    public void user_input_tim_terkait() {
        inputPerizinanPage.addTimTerkait();
        extentTest.log(LogStatus.PASS, "User Input Tim Terkait");
    }

    @And("User Input Invalid Tim Terkait")
    public void user_input_invalid_tim_terkait() {
        inputPerizinanPage.addInvalidTimTerkait();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tim Terkait");
    }

    @And("User Input Tanggal Reminder")
    public void user_input_tgl_reminder() {
        inputPerizinanPage.addTglReminder();
        extentTest.log(LogStatus.PASS, "User Input Tanggal Reminder");
    }

    @And("User Input Invalid Tanggal Reminder")
    public void user_input_invalid_tgl_reminder() {
        inputPerizinanPage.addInvalidTglReminder();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Reminder");
    }

    @And("User Input Invalid Tanggal Reminder Today")
    public void user_input_invalid_tgl_reminder_Today() {
        inputPerizinanPage.addInvalidTglReminderToday();
        extentTest.log(LogStatus.PASS, "User Input Invalid Tanggal Reminder Today");
    }

    @And("User Input Jenis Media")
    public void user_input_jenis_media() {
        inputPerizinanPage.addJenisMedia();
        extentTest.log(LogStatus.PASS, "User Input Jenis Media");
    }

    @And("User Input Invalid Jenis Media")
    public void user_input_invalid_jenis_media() {
        inputPerizinanPage.addInvalidJenisMedia();
        extentTest.log(LogStatus.PASS, "User Input Invalid Jenis Media");
    }

    @And("User Input Jumlah Dokumen")
    public void user_input_jumlah() {
        inputPerizinanPage.addJumlah();
        extentTest.log(LogStatus.PASS, "User Input Jumlah Dokumen");
    }

    @And("User Pilih File PDF Dokumen di Explorer")
    public void user_tambah_pdfdokumen() {
        inputPerizinanPage.addDokumenPdf();
        extentTest.log(LogStatus.PASS, "User Pilih File Dokumen PDF di Explorer");
    }

    @And("User Pilih File DOCX Dokumen di Explorer")
    public void user_tambah_docxdokumen() {
        inputPerizinanPage.addDokumenDocx();
        extentTest.log(LogStatus.PASS, "User Pilih File Dokumen Docx di Explorer");
    }

    @And("User Input Share")
    public void user_input_shared() {
        inputPerizinanPage.addShareNo();
        extentTest.log(LogStatus.PASS, "User Input Share");
    }

    @And("User Input Status Dokumen")
    public void user_input_status() {
        inputPerizinanPage.addStatus();
        extentTest.log(LogStatus.PASS, "User Input Status Dokumen");
    }

    @And("User Klik Simpan")
    public void user_klik_simpan() {
        inputPerizinanPage.clickBtnSimpan();
        extentTest.log(LogStatus.PASS, "User Klik Simpan");
    }

    @And("User Klik Filter")
    public void user_click_filter() {
        perizinanPage.clickBtnFilter();
        extentTest.log(LogStatus.PASS, "User Klik Filter");
    }

    @And("User Klik Edit")
    public void user_click_edit() {
        perizinanPage.clickEdit();
        extentTest.log(LogStatus.PASS, "User Klik Edit");
    }

    @And("User Klik View")
    public void user_click_view() {
        perizinanPage.clickView();
        extentTest.log(LogStatus.PASS, "User Klik View");
    }
    @And("User Pilih Data dan Klik Show Data")
    public void user_klik_show_data() {
        DriverSingleton.delay(2);
        perizinanPage.clickListData(1);
        extentTest.log(LogStatus.PASS, "User Pilih Data dan Klik Show Data");
    }

    // ============================ THEN =============================== //
    @Then("User Berhasil Menampilkan Halaman Perizinan")
    public void user_get_text_title_perizinan_page() {
        Assert.assertEquals(perizinanPage.getTxtListPerizinan(), "Perizinan");
        extentTest.log(LogStatus.PASS, "User Berhasil Menampilkan Halaman Perizinan");
    }

    @Then("User Berhasil Menampilkan Halaman Input Data Perizinan")
    public void user_get_text_tittle_input_perizinan() {
        Assert.assertEquals(perizinanPage.getTxtInputPerizinan(), "Input Perizinan");
        extentTest.log(LogStatus.PASS, "User Berhasil Menampilkan Halaman Input Data Perizinan");
    }

    @Then("User Berhasil Menyimpan Data")
    public void user_get_text_berhasil_save() {
        Assert.assertEquals(inputPerizinanPage.getTxtBerhasilSave(), "Data berhasil di saved!");
        extentTest.log(LogStatus.PASS, "User Berhasil Menyimpan Data");
    }

    @Then("Menampilkan Alert di Kolom Nomor Dokumen")
    public void user_get_required_no_dokumen() {
        Assert.assertEquals(inputPerizinanPage.getNoPerizinanRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Nomor Dokumen");
    }

    @Then("Menampilkan Alert di Kolom Nama Perizinan")
    public void user_get_required_nama_dokumen() {
        Assert.assertEquals(inputPerizinanPage.getNamaPerizinanRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Nomor Dokumen");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Mulai")
    public void user_get_required_tanggal_mulai() {
        Assert.assertEquals(inputPerizinanPage.getTglMulaiRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tanggal Mulai");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Akhir")
    public void user_get_required_tanggal_akhir() {
        Assert.assertEquals(inputPerizinanPage.getTglAkhirRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tanggal Akhir");
    }

    @Then("Menampilkan Alert di Kolom Diterbitkan Oleh")
    public void user_get_required_diterbitkan() {
        Assert.assertEquals(inputPerizinanPage.getDiterbitkanRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Diterbitkan Oleh");
    }

    @Then("Menampilkan Alert di Kolom Deskripsi")
    public void user_get_required_deskripsi() {
        Assert.assertEquals(inputPerizinanPage.getDeskripsiRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Deskripsi");
    }

    @Then("Menampilkan Alert di Kolom Pemilik Dokumen")
    public void user_get_required_pemilik() {
        Assert.assertEquals(inputPerizinanPage.getPemilikRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Pemilik Dokumen");
    }

    @Then("Menampilkan Alert di Kolom Dibuat Oleh")
    public void user_get_required_dibuat_oleh() {
        Assert.assertEquals(inputPerizinanPage.getDibuatOlehRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Dibuat Oleh");
    }

    @Then("Menampilkan Alert di Kolom Tim Terkait")
    public void user_get_required_tim_terkait() {
        Assert.assertEquals(inputPerizinanPage.getTimTerkaitRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tim Terkait");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Reminder")
    public void user_get_required_tgl_reminder() {
        Assert.assertEquals(inputPerizinanPage.getTglReminderRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Tanggal Reminder");
    }

    @Then("Menampilkan Alert di Kolom Jenis Media")
    public void user_get_required_jenis_media() {
        Assert.assertEquals(inputPerizinanPage.getJenisMediaRequired(), "true");
        extentTest.log(LogStatus.PASS, "Menampilkan Alert di Kolom Jenis Media");
    }

    @Then("Menampilkan Alert Tanggal Akhir Tidak boleh Lebih Kecil")
    public void get_alert_tgl_akhir_tidak_kurang_dari_tgl_awal() {
        System.out.println("belum ada peringatannya");
        Assert.assertEquals(inputPerizinanPage.getAlertTglAkhir(), "Tanggal Akhir Tidak boleh Lebih Kecil Dari Tanggal Mulai");
        extentTest.log(LogStatus.FAIL, "Menampilkan Alert Tanggal Akhir Tidak boleh Lebih Kecil");
    }

    @Then("Menampilkan Alert di Kolom Tanggal Reminder Tidak Boleh Lebih Kecil")
    public void get_alert_tgl_reminder_tidak_kurang_dari_tgl_awal() {
        System.out.println("belum ada peringatannya");
        Assert.assertEquals(inputPerizinanPage.getAlertTglReminder(), "Tanggal Reminder Tidak boleh Lebih Kecil/Besar Dari Tanggal Mulai/Berakhir");
        extentTest.log(LogStatus.FAIL, "Menampilkan Alert di Kolom Tanggal Reminder Tidak Boleh Lebih Kecil");
    }

    @Then("User Berhasil Diupload File PDF")
    public void user_get_file_pdf() {
        Assert.assertEquals(inputPerizinanPage.getFileExtension(), "pdf");
        extentTest.log(LogStatus.PASS, "User Berhasil Diupload File PDF");
    }

    @Then("User Berhasil Diupload File DOCX")
    public void user_get_file_docx() {
        Assert.assertEquals(inputPerizinanPage.getFileExtension(), "docx");
        extentTest.log(LogStatus.PASS, "User Berhasil Diupload File docx");
    }

    @Then("Menampilkan Alert Data Tidak Boleh Kosong")
    public void get_alert_data_invalid() {
        System.out.println("belum ada peringatannya");
        Assert.assertEquals(inputPerizinanPage.getAlertTidakBolehKosong(), "Mohon Masukkan Data yang Valid");
        extentTest.log(LogStatus.FAIL, "User Menampilkan Alert Data Tidak Boleh Kosong");
    }

    @Then("User Menampilkan Departemen Akses")
    public void get_department_view() {
        Assert.assertTrue(inputPerizinanPage.getDepartemen());
        extentTest.log(LogStatus.PASS, "User Menampilkan Departemen Akses");
    }

    @Then("User Tidak Menampilkan Departemen Akses")
    public void get_no_department_view() {
        Assert.assertFalse(inputPerizinanPage.getDepartemen());
        extentTest.log(LogStatus.PASS, "User Tidak Menampilkan Departemen Akses");
    }

    @Then("User Cek Jumlah File")
    public void get_jumlah_data_list() {
        DriverSingleton.delay(3);
        Assert.assertEquals(perizinanPage.getTxtJumlahDokumen(), perizinanPage.getJumlahDataDiList());
        extentTest.log(LogStatus.PASS, "User Cek Jumlah File");
    }

    @Then("User Mendapatkan Hasil Tidak Ditemukan")
    public void get_no_data_available() {
        Assert.assertEquals(perizinanPage.getTxtDataNoAvailable(), "No data available in table");
        extentTest.log(LogStatus.PASS, "User Mendapatkan Hasil Tidak Ditemukan");
    }

    @Then("User Berhasil Menampilkan Halaman Edit Data Perizinan")
    public void user_get_text_title_Edit_Page() {
        Assert.assertEquals(perizinanPage.getTxtEditPerizinan(), "Edit Perizinan");
        extentTest.log(LogStatus.PASS, "User Berhasil Menampilkan Halaman Edit Data Perizinan");
    }

    @Then("User Berhasil Menampilkan Halaman View Data Perizinan")
    public void user_get_text_title_View_Page() {
        Assert.assertEquals(perizinanPage.getTxtViewPerizinan(), "Data Arsip");
        extentTest.log(LogStatus.PASS, "User Berhasil Menampilkan Halaman View Data Perizinan");
    }
    @Then("User Verifikasi Unduhan Berhasil")
    public void verify_download(){
        Assert.assertTrue(perizinanPage.verifyUnduhan());
        extentTest.log(LogStatus.FAIL, "Verifikasi Unduhan Berhasil");
    }
    @Then("User Bisa Melihat File Pdf")
    public void verify_view_pdf(){
        Assert.assertEquals(perizinanPage.verifyShowPdf(), "PDF");
        extentTest.log(LogStatus.FAIL, "User Bisa Melihat File Pdf");
    }

    // ============================ AND after THEN =============================== //
    @And("User Mendapatkan Hasil Pencarian yang Sesuai dari Nomor Perizinan")
    public void get_value_nomor_perizinan() {
        Assert.assertTrue(perizinanPage.getListNilaiDataPerizinan("NoPerizinan"));
        extentTest.log(LogStatus.PASS, "User Mendapatkan Hasil Pencarian yang Sesuai dari Nomor Perizinan");
    }

    @And("User Mendapatkan Hasil Pencarian yang Sesuai dari Nama Perizinan")
    public void get_value_nama_perizinan() {
        Assert.assertTrue(perizinanPage.getListNilaiDataPerizinan("NamaPerizinan"));
        extentTest.log(LogStatus.PASS, "User Mendapatkan Hasil Pencarian yang Sesuai dari Nama Perizinan");
    }

    @And("User Mendapatkan Hasil Pencarian yang Sesuai dari Departemen")
    public void get_value_departemen() {
        Assert.assertTrue(perizinanPage.getListNilaiDataPerizinan("Departemen"));
        extentTest.log(LogStatus.FAIL, "User Mendapatkan Hasil Pencarian yang Sesuai dari Departemen");
    }

    @And("User Mendapatkan Hasil Pencarian")
    public void get_value_ada_file() {
        Assert.assertTrue(perizinanPage.getListNilaiDataPerizinan("File"));
        extentTest.log(LogStatus.PASS, "User Mendapatkan Hasil Pencarian");
    }

}
