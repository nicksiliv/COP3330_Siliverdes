import java.util.Scanner;
public class encryptnumbers {
   public static String encrypt(String number) {
       int num[] = new int[4];
       for(int i=0;i<4;i++) {
           char ch = number.charAt(i);
           num[i] = Character.getNumericValue(ch);
       }
       for(int i=0;i<4;i++) {
           int cha = num[i] ;
           cha += 7 ;
           cha = cha % 10 ;
           num[i] = cha ;
       }
       int cha = num[0];
       num[0] = num[2];
       num[2]= cha ;
       cha = num[1];
       num[1] =num[3];
       num[3] = cha ;
       int newn = 0 ;
       for(int i=0;i<4;i++)
           newn = newn * 10 + num[i];
       String output = Integer.toString(newn);
       if(num[0]==0)
           output = "0"+output;
           
       return output;
   }
   
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a 4 digit number:");
       String number = sc.nextLine();
       String encryptedNumber = encrypt(number);
       System.out.println("The encrypted number is:"+encryptedNumber);
       }
       
       
 }