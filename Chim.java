public class Chim extends DongVat {
    // Khai báo các thuộc tính
    private String mauLong;
    private double saiCanh;
    private String thucAnChinh;
    
    // Định nghĩa phương thức bay
    public void bay() {
        // Thực hiện chức năng bay của chim
        System.out.println("Chim dang bay");
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public double getSaiCanh() {
        return saiCanh;
    }

    public void setSaiCanh(double saiCanh) {
        this.saiCanh = saiCanh;
    }

    public String getThucAnChinh() {
        return thucAnChinh;
    }

    public void setThucAnChinh(String thucAnChinh) {
        this.thucAnChinh = thucAnChinh;
    }
}
