package Miniprojiect;
import java.util.Scanner;
public class MayBanHangTuDong {
    int idSP;
    String tenSP;
    float soTien;
    float tienThua;
    float giaSP;
    int qty;
    int soLuong;
    public MayBanHangTuDong(int idSP,String tenSP,float giaSP, int qty){
        this.idSP = idSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.qty = qty;
    }
    public void soLuong(){
        Scanner ip = new Scanner(System.in);
        do {
            System.out.println("So luong: ");
            soLuong = ip.nextInt();
            if (soLuong>qty){
                System.out.println("So luong san pham con lai: "+ qty);
            }
        }while (soLuong == 0||soLuong>qty);

    }
    public void nhanTien(){
        Scanner ip = new Scanner(System.in);
        System.out.println("Nhap so tien:");
        soTien = ip.nextFloat();
    }
    public void bill(){
        if (giaSP*soLuong <= soTien){
            tienThua = soTien - giaSP*soLuong;
            System.out.println("Thanh toan thanh cong!");
            System.out.println("Ten san pham: "+tenSP);
            System.out.println("So luong: "+ soLuong);
            System.out.println("Thanh tien: "+giaSP*soLuong);
            System.out.println("Tien tra lai: "+ tienThua);
            qty--;
        }

        else {
            System.out.println("Ban chua nhap du tien!");
        }
    }

}