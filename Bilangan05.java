import java.util.Scanner;
public class Bilangan05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan1, bilangan2, bilangan3;
        
    
        System.out.println("Bilangan 1");
        bilangan1 = sc.nextInt();
        System.out.println("Bilangan 2");
        bilangan2 = sc.nextInt();
        System.out.println("bilangan3");
        bilangan3 = sc.nextInt();

        if (bilangan1>bilangan2){
            if(bilangan1 > bilangan3){
                System.out.println("Bilangan terbesar: " + bilangan1);

            
        }else{
            if(bilangan1 > bilangan3){
                System.out.println("Bilangan Terbesar: " + bilangan1); 

                } else{
                    System.out.println("Bilangan terbesar" + bilangan3);
                
                }
        }
        } else{
            if(bilangan1 > bilangan3){
                System.out.println("Bilanagn terbesar: " + bilangan2 );

            }else {
                if(bilangan2 > bilangan3){
                    System.out.println("Bilangan terbesar: " + bilangan2);
            }else{
                System.out.println("Bilangan terbesar: " + bilangan3);
            }        
            
                
            }        

                }        

            
        }
            
        }
    


    

        