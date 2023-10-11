import java.util.Scanner;

public class Segitiga05 {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int sudut1, sudut2, sudut3, totalSudut;
    
    System.out.println("sudut1");
    sudut1=sc.nextInt();

    System.out.println("sudut2");
    sudut2=sc.nextInt();

    System.out.println("sudut3");
    sudut3=sc.nextInt();

    totalSudut= sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if ((sudut1 == 90)|| (sudut2 == 90)|| (sudut3 == 90))
            System.out.println("Segitiga tersebut adalah segitiga siku-siku");
        else if(sudut1 == sudut2 &&  sudut1 == sudut3)
            System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        else if((sudut1 == sudut2) || (sudut1 == sudut3) || (sudut2 == sudut3))
            System.out.println("Segitiga tersebut adalah segitiga sama kaki");
        else if (sudut1 != sudut2 && sudut1 == sudut3)
            System.out.println("Segitiga tersebut adalah segitiga sembarang");         

    } else
          System.out.println("Bukan Segitiga");
}
    
}
