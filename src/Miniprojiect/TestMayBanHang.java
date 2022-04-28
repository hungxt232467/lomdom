package Miniprojiect;

import java.util.Scanner;
public class TestMayBanHang {
    public static void main(String[] args){
        int chonSP;
        Miniprojiect.MayBanHangTuDong sanPham1,sanPham2,sanPham3;
        sanPham1 = new Miniprojiect.MayBanHangTuDong(1,"Sua Milo",10000F,11);
        sanPham2 = new Miniprojiect.MayBanHangTuDong(2,"Bo huc", 15000F,24);
        sanPham3 = new MayBanHangTuDong(3,"Vodka",1234567,1);
        System.out.println("");
        Scanner ip = new Scanner(System.in);
        System.out.println("Chon san pham: ");
        chonSP = ip.nextInt();
        if (chonSP == 1){
            sanPham1.soLuong();
            sanPham1.nhanTien();
            sanPham1.bill();
        }
        if (chonSP == 2){
            sanPham2.soLuong();
            sanPham2.nhanTien();
            sanPham2.bill();
        }
        if (chonSP == 3){
            sanPham2.soLuong();
            sanPham3.nhanTien();
            sanPham3.bill();
        }
    }
}