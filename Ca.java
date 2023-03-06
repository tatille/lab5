public class Ca extends DongVat {
    // Khai báo các thuộc tính
    private String mauSac;
    private String thucAn;
    
    // Định nghĩa phương thức bơi
    public void boi() {
        // Thực hiện chức năng bơi của cá
        System.out.println("Ca dang boi");
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getThucAn() {
        return thucAn;
    }

    public void setThucAn(String thucAn) {
        this.thucAn = thucAn;
    }
}
