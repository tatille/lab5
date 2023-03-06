import javafx.application.Application;
import javafx.stage.Stage;

public class DongVat extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Khởi tạo giao diện và các thành phần của ứng dụng ở đây
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Định nghĩa lớp cha DongVat
public class DongVat {
    // Khai báo các thuộc tính
    private String ten;
    private String loai;
    private double chieuCao;
    private double canNang;
    private String moiTruongSong;
    private String hinhThucSinhSan;
    
    // Định nghĩa phương thức ăn
    public void an() {
        // Thực hiện chức năng ăn của động vật
        System.out.println("Dong vat dang an");
    }
    
    // Định nghĩa phương thức ngủ
    public void ngu() {
        // Thực hiện chức năng ngủ của động vật
        System.out.println("Dong vat dang ngu");
    }
    
    // Định nghĩa phương thức nghỉ
    public void nghi() {
        // Thực hiện chức năng nghỉ của động vật
        System.out.println("Dong vat dang nghi");
    }
    
    // Định nghĩa phương thức di chuyển
    public void diChuyen() {
        // Thực hiện chức năng di chuyển của động vật
        System.out.println("Dong vat dang di chuyen");
    }
    
    // Định nghĩa phương thức giải trí tâm
    public void giaiTriTam() {
        // Thực hiện chức năng giải trí tâm của động vật
        System.out.println("Dong vat dang giai tri tam");
    }
    
    // Định nghĩa phương thức húc nhau
    public void hucNhau() {
        // Thực hiện chức năng húc nhau của động vật
        System.out.println("Dong vat dang huc nhau");
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(double canNang) {
        this.canNang = canNang;
    }

    public String getMoiTruongSong() {
        return moiTruongSong;
    }

    public void setMoiTruongSong(String moiTruongSong) {
        this.moiTruongSong = moiTruongSong;
    }

    public String getHinhThucSinhSan() {
        return hinhThucSinhSan;
    }

    public void setHinhThucSinhSan(String hinhThucSinhSan) {
        this.hinhThucSinhSan = hinhThucSinhSan;
    }
}

// Định nghĩa lớp Chim kế thừa từ lớp DongVat

// Định nghĩa lớp Ca kế thừa từ lớp DongVat

// Định nghĩa lớp Mèo kế thừa từ lớp DongVat

// Định nghĩa lớp Chó kế thừa từ lớp Động vật
