import java.util.Scanner;

public class Gaji05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String Kategori;
    int penghasilan, gajibersih;
    double pajak = 0;

    System.out.println("Masukan kategori");
    Kategori =sc.nextLine();
    System.out.println("Masukan besarnya penghasilan");
    penghasilan =sc.nextInt();
    
    if (Kategori.equalsIgnoreCase("pekerja")) {
        if ((penghasilan) == 20000000) 
            pajak = 0.1;
            else if (penghasilan <=3000000)
            pajak = 0.15;
            else
                pajak =0.2;
            gajibersih = (int) (penghasilan - (pajak*penghasilan));
            System.out.println("Penghasilan bersih : " + gajibersih );
            
    
    
           
    }else if (Kategori.equalsIgnoreCase("pebisnis")) {
        if (penghasilan <= 2500000) 
        pajak =0.15;
        else if(penghasilan <= 3500000) 
        pajak = 0.2;
        else
        pajak = 0.25;
        gajibersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Penghasilan bersih :" + gajibersih);
    }else
        System.out.println("Masukan kategori salah ");


        }

}
    

