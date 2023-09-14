package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PerizinanPage {
    private WebDriver driver;

    public PerizinanPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    // tombol di List Perizinan
    @FindBy(xpath = "//button[normalize-space()='Input Data']")
    WebElement btnInputData;
    @FindBy(xpath = "//button[normalize-space()='Send Selected Email']")
    WebElement btnSendEmail;

    // Table list Perizinan
    @FindBy(xpath = "//tr[@role='row']")
    List<WebElement> listTableDokumenPerizinan;
    @FindBy(xpath = "//div[@id='vizindoc_info']")
    WebElement txtJumlahShowing;
    @FindBy(xpath = "//td[@class='dataTables_empty']")
    WebElement txtDataNoAvailable;
    @FindBy(xpath = "//span[@class='btn btn-xs btn-primary']")
    WebElement btnView;
    @FindBy(xpath = "//span[@class='btn btn-xs btn-warning']")
    WebElement btnEdit;

    //Pencarian
    @FindBy(xpath = "//input[@id='nodokizin']")
    WebElement cariNoPerizinan;
    @FindBy(xpath = "//input[@id='nama']")
    WebElement cariNamaPerizinan;
    @FindBy(xpath = "//select[@id='dept_id']")
    WebElement cariDepartemen;
    @FindBy(xpath = "//select[@id='file_exist']")
    WebElement cariKetersediaan;
    @FindBy(xpath = "//button[@id='btnFilter']")
    WebElement btnFilter;

    //Header
    @FindBy(xpath = "//span[normalize-space()='Perizinan']")
    WebElement menuPerizinan;
    @FindBy(xpath = "//li[contains(text(),'Perizinan')]")
    WebElement txtListPerizinan;
    @FindBy(xpath = "//li[normalize-space()='Input Perizinan']")
    WebElement txtInputPerizinan;
    @FindBy(xpath = "//li[normalize-space()='Edit Perizinan']")
    WebElement txtEditPerizinan;
    @FindBy(xpath = "//li[normalize-space()='Data Arsip']")
    WebElement txtViewPerizinan;
    @FindBy(xpath = "//i[@id='jml']")
    WebElement txtJumlahData;


    public void clickMenuPerizinan() {
        menuPerizinan.click();
    }

    public void clickBtnInputData() {
        btnInputData.click();
    }

    public void clickBtnFilter() {
        btnFilter.click();
    }

    public String getTxtListPerizinan() {
        return txtListPerizinan.getText();
    }

    public String getTxtInputPerizinan() {
        return txtInputPerizinan.getText();
    }

    public String getTxtViewPerizinan() {
        return txtViewPerizinan.getText();
    }

    public String getTxtEditPerizinan() {
        return txtEditPerizinan.getText();
    }

    public String getTxtDataNoAvailable() {
        return txtDataNoAvailable.getText();
    }

    //Pencarian
    public void searchNoPerizinan() {
        cariNoPerizinan.sendKeys("Nomor Perizinan");
    }

    public void searchNoPerizinanInvalid() {
        cariNoPerizinan.sendKeys("@Ini Contoh!");
    }
    public void searchNoPerizinanViewDOCX() {
        cariNoPerizinan.sendKeys("ContohDOCX");
    }
    public void searchNoPerizinanViewPDF() {
        cariNoPerizinan.clear();
        cariNoPerizinan.sendKeys("ContohPDF");
    }

    public void searchNamaPerizinan() {
        cariNamaPerizinan.sendKeys("Nama Perizinan");
    }

    public void searchNamaPerizinanInvalid() {
        cariNamaPerizinan.sendKeys("@Ini Contoh!");
    }

    public void searchDepartemen() {
        cariDepartemen.sendKeys(Keys.ARROW_DOWN);
        cariDepartemen.sendKeys(Keys.ARROW_DOWN);
        cariDepartemen.sendKeys(Keys.ARROW_DOWN);
        cariDepartemen.sendKeys(Keys.ENTER);
    }

    public void searchFileAda() {
        cariKetersediaan.sendKeys(Keys.ARROW_DOWN);
        cariKetersediaan.sendKeys(Keys.ARROW_DOWN);
        cariKetersediaan.sendKeys(Keys.ENTER);
    }

    public void searchFileTidakAda() {
        cariKetersediaan.sendKeys(Keys.ARROW_DOWN);
        cariKetersediaan.sendKeys(Keys.ENTER);
    }

    // Table List Perizinan
    public int getTxtJumlahDokumen() {
        String teksAngka = txtJumlahData.getText();
        int angka = Integer.parseInt(teksAngka);
        return angka;
    }

    public int getJumlahDataDiList() {
        String textShowing = txtJumlahShowing.getText();
        String[] bagian = textShowing.split(" ");
        String entri = bagian[5];
        int angka = Integer.parseInt(entri);
        return angka;
    }

    public boolean getListNilaiDataPerizinan(String pilih) {
        boolean value = false;
        int idx;
        String keyword = "";

        switch (pilih) {
            case "NoPerizinan":
                idx = 2;
                keyword = cariNoPerizinan.getText();
                break;
            case "NamaPerizinan":
                idx = 3;
                keyword = cariNamaPerizinan.getText();
                break;
            case "Departemen":
                idx = 4;
                String departemen = new Select(cariDepartemen).getFirstSelectedOption().getText();
                keyword = departemen;
                break;
            case "File":
                idx = 7;
                String file = new Select(cariKetersediaan).getFirstSelectedOption().getText();
                keyword = file;
                break;
            default:
                idx = 0;
                break;
        }

        for (int i = 1; i < listTableDokumenPerizinan.size(); i++) {
            WebElement kolom = listTableDokumenPerizinan.get(i).findElements(By.tagName("td")).get(idx);
            String isiKolom = kolom.getText();
            if (isiKolom.contains(keyword)) {
                value = true;
                //System.out.println(isiKolom);
            }
        }
        return value;
    }

    public void clickListData(int idx) {
        WebElement kolom = listTableDokumenPerizinan.get(idx).findElements(By.tagName("td")).get(0);
        kolom.click(); //tbody/tr[9]/td[1]
    }

    public void clickEdit() {
        btnEdit.click();
    }

    public void clickView() {
        btnView.click();
    }

    public boolean verifyUnduhan(){
        boolean value = false;
        String direktoriUnduh = System.getProperty("user.home") + "\\Downloads";
        String polaNamaFile1 = "Perizinan3.docx";
        String polaNamaFile2 = "Perizinan3 \\(\\d+\\)\\.docx";

        DriverSingleton.delay(3);

        File folder = new File(direktoriUnduh);
        File[] daftarFile = folder.listFiles();
        Pattern pola1 = Pattern.compile(polaNamaFile1);
        Pattern pola2 = Pattern.compile(polaNamaFile2);

        for (File file : daftarFile) {
            String namaFile = file.getName();
            Matcher matcher1 = pola1.matcher(namaFile);
            Matcher matcher2 = pola2.matcher(namaFile);

            if (matcher1.matches() || matcher2.matches()) {
                //System.out.println("File " + namaFile + " telah berhasil diunduh.");
                value = true;
                break;
            } else {
                value = false;
            }
        }
        return value;
    }
    public String verifyShowPdf(){
        ArrayList<String> newTb = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTb.get(1));
        String titleTwo = driver.getTitle();

        //System.out.println("Judul Dua " + titleTwo);
        DriverSingleton.delay(3);

        driver.close();
        driver.switchTo().window(newTb.get(0));
        return titleTwo;
    }

}
