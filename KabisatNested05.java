import java.util.Scanner;

public class KabisatNested05 {
    public static void main(String[] args) {
    
        Scanner input05 = new Scanner (System.in);

        int tahun;
        System.out.println("Masukan Tahun");
        tahun=input05.nextInt();

        if ((tahun % 4) == 0) {
            if (( tahun % 100) != 0) 
            System.out.println("tahun Kabisat");

        }else
            System.out.println("Bukan tahun kabisat");



}
}