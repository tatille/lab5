public class Meo extends DongVat {
    // Khai báo các thuộc tính
    private String mauLong;
    private double doDaiMui;
    private String dacDiem;
    
    // Định nghĩa phương thức bắt chuột
    public void batChuot() {
        // Thực hiện chức năng bắt chuột của mèo
        System.out.println("Meo dang bat chuot");
    }
    
    // Định nghĩa phương thức kêu
    public void keu() {
        // Thực hiện chức năng kêu của mèo
        System.out.println("Meo dang keu meo meo");
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public double getDoDaiMui() {
        return doDaiMui;
    }

    public void setDoDaiMui(double doDaiMui) {
        this.doDaiMui = doDaiMui;
    }

    public String getDacDiem() {
        return dacDiem;
    }

    public void setDacDiem(String dacDiem) {
        this.dacDiem = dacDiem;
    }
}