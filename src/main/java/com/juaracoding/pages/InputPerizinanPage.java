package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class InputPerizinanPage {
    private WebDriver driver;

    public InputPerizinanPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //Form Perizinan
    @FindBy(xpath = "//input[@id='noijin']")
    WebElement inputNoPerizinan;
    @FindBy(xpath = "//input[@id='namaijin']")
    WebElement inputNamaPerizinan;
    @FindBy(xpath = "//input[@id='tgl_terbit']")
    WebElement inputTglMulai;
    @FindBy(xpath = "//input[@id='masa']")
    WebElement inputTglAkhir;
    @FindBy(xpath = "//input[@id='diterbitkan']")
    WebElement inputDiterbitkan;
    @FindBy(xpath = "//textarea[@id='deskripsi']")
    WebElement inputDeskripsi;
    @FindBy(xpath = "//input[@id='owner']")
    WebElement inputPemilik;
    @FindBy(xpath = "//input[@id='dibuat']")
    WebElement inputDibuat;
    @FindBy(xpath = "//input[@id='tim']")
    WebElement inputTimTerkait;
    @FindBy(xpath = "//input[@id='tgl_reminder']")
    WebElement inputTglReminder;
    @FindBy(xpath = "//select[@id='media']")
    WebElement inputJenisMedia;
    @FindBy(xpath = "//input[@id='jumlah']")
    WebElement inputJumlah;
    @FindBy(xpath = "//input[@id='file']")
    WebElement inputFile;
    @FindBy(xpath = "//select[@id='share']")
    WebElement inputShare;
    @FindBy(xpath = "//label[contains(@class,'col-sm-2')]")
    WebElement pilihDepartemen;
    @FindBy(xpath = "//select[@id='status']")
    WebElement inputStatus;
    @FindBy(xpath = "//b[normalize-space()='Data berhasil di saved!']")
    WebElement txtBerhasilSave;
    @FindBy(xpath = "//button[@id='singlebutton']")
    WebElement btnSimpan;

    //ini gk ada alertnya
    @FindBy(xpath = "//input[@id='alert-masa']")
    WebElement txtAlertTglAkhir;
    @FindBy(xpath = "//input[@id='alert-tgl_reminder']']")
    WebElement txtAlertTglReminder;
    @FindBy(xpath = "//input[@id='alert-null']")
    WebElement txtAlertTidakBolehKosong;


    String noPerizinan = "Nomor Perizinan";
    String namaPerizinan = "Perizinan ABC";
    String terbitOleh = "Diterbitkan oleh";
    String deskripsi = "Deskripsi";
    String pemilikDokumen = "Pemilik Dokumen";
    String dibuatOleh = "Dibuat Oleh";
    String timTerkait = "Tim Terkait";

    // =============== VALID METHOD =================== //
    public void addNomorPerizinan() {
        inputNoPerizinan.sendKeys(noPerizinan);
    }

    public void addNamaPerizinan() {
        inputNamaPerizinan.sendKeys(namaPerizinan);
    }

    public void addTglAwal() {
        inputTglMulai.click();
        inputTglMulai.sendKeys(Keys.ENTER);
    }

    public void addTglAkhir() {
        inputTglAkhir.click();
        inputTglAkhir.sendKeys(Keys.ARROW_DOWN);
        inputTglAkhir.sendKeys(Keys.ARROW_DOWN);
        inputTglAkhir.sendKeys(Keys.ARROW_DOWN);
        inputTglAkhir.sendKeys(Keys.ENTER);
    }

    public void addDiterbitkan() {
        inputDiterbitkan.sendKeys(terbitOleh);
    }

    public void addDeskripsi() {
        inputDeskripsi.sendKeys(deskripsi);
    }

    public void addPemilik() {
        inputPemilik.sendKeys(pemilikDokumen);
    }

    public void addDibuatOleh() {
        inputDibuat.sendKeys(dibuatOleh);
    }

    public void addTimTerkait() {
        inputTimTerkait.sendKeys(timTerkait);
    }

    public void addTglReminder() {
        inputTglReminder.sendKeys(Keys.ARROW_DOWN);
        inputTglReminder.sendKeys(Keys.ARROW_DOWN);
        inputTglReminder.sendKeys(Keys.ENTER);
    }

    public void addJenisMedia() {
        Select pilihJenis = new Select(inputJenisMedia);
        pilihJenis.selectByIndex(6);
    }

    public void addJumlah() {
        inputJumlah.sendKeys("");
    }

    public void addDokumenPdf() {
        String currentDirectory = System.getProperty("user.dir");
        String relativeFilePath = "contoh\\Perizinan.pdf";
        String fullPath = currentDirectory + "\\" + relativeFilePath;
        inputFile.sendKeys(fullPath);
        //inputFile.sendKeys("E:\\Bootcam\\Koding\\JCCucumberTestingDMS\\contoh\\Perizinan.pdf");
    }

    public void addDokumenDocx() {
        String currentDirectory = System.getProperty("user.dir");
        String relativeFilePath = "contoh\\Perizinan.docx";
        String fullPath = currentDirectory + "\\" + relativeFilePath;
        inputFile.sendKeys(fullPath);
    }

    public void addShareNo() {
        Select pilihShare = new Select(inputShare);
        pilihShare.selectByIndex(0);
    }

    public void addShareYes() {
        Select pilihShare = new Select(inputShare);
        pilihShare.selectByIndex(1);
    }

    public void addStatus() {
        Select pilihStatus = new Select(inputStatus);
        pilihStatus.selectByIndex(0);
    }

    public void clickBtnSimpan() {
        btnSimpan.click();
    }

    public String getTxtBerhasilSave() {
        return txtBerhasilSave.getText();
    }

    // =============== REQUIRED ELEMENT =================== //
    public String getNoPerizinanRequired() {
        return inputNoPerizinan.getAttribute("required");
    }

    public String getNamaPerizinanRequired() {
        return inputNamaPerizinan.getAttribute("required");
    }

    public String getTglMulaiRequired() {
        return inputTglMulai.getAttribute("required");
    }

    public String getTglAkhirRequired() {
        return inputTglAkhir.getAttribute("required");
    }

    public String getDiterbitkanRequired() {
        return inputDiterbitkan.getAttribute("required");
    }

    public String getDeskripsiRequired() {
        return inputDeskripsi.getAttribute("required");
    }

    public String getPemilikRequired() {
        return inputPemilik.getAttribute("required");
    }

    public String getDibuatOlehRequired() {
        return inputDibuat.getAttribute("required");
    }

    public String getTimTerkaitRequired() {
        return inputTimTerkait.getAttribute("required");
    }

    public String getTglReminderRequired() {
        return inputTglReminder.getAttribute("required");
    }

    public String getJenisMediaRequired() {
        return inputJenisMedia.getAttribute("required");
    }

    public String getTglAwal() {
        return inputTglMulai.getText();
    }

    public String getTglAkhir() {
        return inputTglAkhir.getText();
    }

    public String getTglReminder() {
        return inputTglReminder.getText();
    }

    public String getAlertTglAkhir() {
        return txtAlertTglAkhir.getText();
    }

    public String getAlertTglReminder() {
        return txtAlertTglReminder.getText();
    }

    public String getAlertTidakBolehKosong() {
        return txtAlertTidakBolehKosong.getText();
    }

    public String getFileExtension() {
        String uploadFile = inputFile.getAttribute("value");
        String fileExtension = uploadFile.substring(uploadFile.lastIndexOf(".") + 1);
        return fileExtension;
    }

    public boolean getDepartemen() {
        return pilihDepartemen.isDisplayed();
    }

    // =============== INVALID METHOD =================== //
    public void addInvalidTglAwal() {
        inputTglMulai.click();
        inputTglMulai.sendKeys(Keys.ARROW_DOWN);
        inputTglMulai.sendKeys(Keys.ARROW_DOWN);
        inputTglMulai.sendKeys(Keys.ARROW_DOWN);
        inputTglMulai.sendKeys(Keys.ENTER);
    }

    public void addInvalidTglAkhir() {
        inputTglAkhir.click();
        inputTglAkhir.sendKeys(Keys.ENTER);
    }

    public void addInvalidTglReminder() {
        inputTglReminder.sendKeys(Keys.ARROW_DOWN);
        inputTglReminder.sendKeys(Keys.ENTER);
    }

    public void addInvalidNomorPerizinan() {
        inputNoPerizinan.sendKeys(" ");
    }

    public void addInvalidNamaPerizinan() {
        inputNamaPerizinan.sendKeys(" ");
    }

    public void addInvalidTglAwalToday() {
        inputTglMulai.sendKeys(Keys.ENTER);
    }

    public void addInvalidTglAkhirToday() {
        inputTglAkhir.sendKeys(Keys.ENTER);
    }

    public void addInvalidDiterbitkan() {
        inputDiterbitkan.sendKeys(" ");
    }

    public void addInvalidDeskripsi() {
        inputDeskripsi.sendKeys(" ");
    }

    public void addInvalidPemilik() {
        inputPemilik.sendKeys(" ");
    }

    public void addInvalidDibuatOleh() {
        inputDibuat.sendKeys(" ");
    }

    public void addInvalidTimTerkait() {
        inputTimTerkait.sendKeys(" ");
    }

    public void addInvalidTglReminderToday() {
        inputTglReminder.sendKeys(Keys.ENTER);
    }

    public void addInvalidJenisMedia() {
        Select pilihJenis = new Select(inputJenisMedia);
        pilihJenis.selectByIndex(1);
    }

}
