public class Cho extends DongVat {
    // Khai báo các thuộc tính
    private String mauLong;
    private String mauMat;
    private double chieuCaoCao;
    private double canNang;

    // Định nghĩa phương thức sủa
    public void sua() {
        // Thực hiện chức năng sủa của chó
        System.out.println("Cho dang sua");
    }
    
    // Định nghĩa phương thức di chuyển @Override
    public void diChuyen() {
        // Thực hiện chức năng di chuyển của chó
        System.out.println("Cho dang di chuyen bang 4 chan");
    }

    public String getMauLong() {
        return mauLong;
    }

    public void setMauLong(String mauLong) {
        this.mauLong = mauLong;
    }

    public String getMauMat() {
        return mauMat;
    }

    public void setMauMat(String mauMat) {
        this.mauMat = mauMat;
    }

    public double getChieuCaoCao() {
        return chieuCaoCao;
    }

    public void setChieuCaoCao(double chieuCaoCao) {
        this.chieuCaoCao = chieuCaoCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }
}
