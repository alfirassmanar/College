/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkgswitch.case_college;
import java.util.Scanner;

/**
 *
 * @author alfir
 */
public class LatihanSwitchCase_College {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int pesan,sate,pilihan,total,harga,card;
        float pembayaran, kembali;
        String nama;
  
        System.out.println("Untuk Pelanggan mohon hanya menginputkan angka saja :)");
        System.out.print("Masukkan nama anda                  :");
        nama = input.next();
        
        System.out.print("                                     \n 1. yes"
                +        "                                     \n 2. no" 
                +        "                                     \nApakah anda memiliki kartu member :");
        card = input.nextInt();
        if(card == 1){
            System.out.println("Anda Mendapatkan Diskon 5%");
        }
        
        
//        System.out.print("Menu Kami : "
//                + "                     \n 1.pecel, "
//                + "                     \n 2.sate, "
//                + "                     \n 3.penyetan "
//                + "                     \n Pesan : ");
//        pilihan = input.nextInt();
//        
//         if(pilihan == 1){
//            System.out.println("Pilihan:\n 1. Sate Ayam(Rp. 1500/tusuk)" 
//                    + "                 \n 2. Sate Kambing(Rp. 3000/tusuk)");
//        } else if (pilihan == 2){
//            System.out.println("Pilihan:\n 1. Lauk Ayam(Rp. 13000/porsi)" 
//                    + "                 \n 2. Lauk Empal(Rp. 15000/porsi)");
//        }

 System.out.print("\nPilihan:     \n 1. Sate"
                + "               \n 2. Pecel"
                + "               \n 3. Penyetan\n");

 System.out.print("\nMasukkan Pilihan :");
        pilihan = input.nextInt();
        
 switch(pilihan){
            case 1:
                System.out.println("\nMenu Sate  :\n 1. Sate Ayam    (Rp. 1500)/tusuk"
                                +  "            \n 2. Sate Kambing (Rp. 3000)/tusuk");    
            break;
            case 2:
                System.out.println("\nMenu Pecel :\n 3. Nasi Ayam (Rp. 13.000)" 
                                +  "            \n 4. Nasi Empal(Rp. 15.000)");
            break;
            case 3:
               System.out.println("\nMenu Pecel :\n 5. Lauk tempe/tahu (Rp. 5000)" 
                                +  "           \n 6. Lauk telur      (Rp. 7.000)"
                                +  "           \n 7. Lauk ayam       (Rp. 10.000)");
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }       
 
// System.out.print("Pilihan:       \n 1. Nasi Goreng(Rp.15.000.00)"
//                + "               \n 2. Mie Ayam(Rp.10.000.00)"
//                + "               \n 3. Bakso(Rp.13.000.00)\n");
        
        System.out.print("\nMasukkan Pilihan :");
        sate = input.nextInt();
        System.out.print("Jumlah Pesan : ");
        pesan = input.nextInt();
        System.out.println("\n================");
        
//        System.out.println("Anda Telah Memesan Menu : " + pilihan);
       
        total = pesan * pilihan;
        switch(sate){
            case 1:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Sate Ayam");
                System.out.println("Harga : 1500/tusuk");
                harga = 1500;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
            case 2:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Sate Kambing");
                System.out.println("Harga : 3000/tusuk");
                harga = 3000;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
            case 3:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Ayam");
                System.out.println("Harga : 13.000");
                harga = 13000;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
             case 4:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Nasi Empal");
                System.out.println("Harga : 15.000");
                harga = 15000;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
             case 5:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Lauk Tempe/Tahu");
                System.out.println("Harga : 13.000");
                harga = 13000;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
             case 6:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Lauk Telur");
                System.out.println("Harga : 7000");
                harga = 7000;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
             case 7:
                System.out.println("Nama Pemesan :"+nama);
                System.out.println("Pesanan : Lauk Ayam");
                System.out.println("Harga : 10.000");
                harga = 10000;
                if(card == 1){
                     total = pesan * harga * 95/100;
                } else if (card == 2){
                    total = pesan * harga;
                }
                System.out.println("Jumlah Pesan : "+pesan);
                System.out.println("Total Bayar : "+total);
            break;
            default:
            System.out.println("Salah Pilih ! :(");
        }
        
        System.out.println("\nTransaksi Pembayaran");
        System.out.print("Masukan Nominal Uang                  Rp: ");
            pembayaran = input.nextFloat();
            
            double kembalian = pembayaran - total;
            System.out.println("Kembalian Anda : " + kembalian);
            if(kembalian == 0){
                System.out.println("Uang Anda Pass Silahkan Mampir Lagi :)");
            }
    }
    
}
