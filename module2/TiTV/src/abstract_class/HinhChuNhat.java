package abstract_class;

public class HinhChuNhat extends Hinh {
    private double chieuRong;
    private double chieuCao;


    public HinhChuNhat(ToaDo toaDo, double chieuCao, double chieuRong) {
        super(toaDo);
        this.chieuCao = chieuCao;
        this.chieuRong =chieuRong;
    }
    public double tinhDienTich(){
        return this.chieuRong * this.chieuCao;
    }
}

