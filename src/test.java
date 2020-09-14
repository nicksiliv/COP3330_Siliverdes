import java.util.Scanner;
public class test {
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
   public static String decrypt(String number) {
       int num[] = new int[4];
       for(int i=0;i<4;i++) {
           char ch = number.charAt(i);
           num[i] = Character.getNumericValue(ch);
       }
       int cha = num[0];
       num[0]=num[2];
       num[2]=cha;
       cha = num[1];
       num[1]=num[3];
       num[3]=cha;
       for(int i=0;i<4;i++) {
           int digit = num[i];
           switch(digit) {
           case 0:
               num[i] = 3;
               break;
           case 1:
               num[i] = 4;
               break;
           case 2:
               num[i] = 5;
               break;
           case 3:
               num[i] = 6;
               break;
           case 4:
               num[i] = 7;
               break;
           case 5:
               num[i] = 8;
               break;
           case 6:
               num[i] = 9;
               break;
           case 7:
               num[i] = 0;
               break;
           case 8:
               num[i] = 1;
               break;
           case 9:
               num[i] = 2;
               break;
           }
       }
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
       System.out.print("Enter a 4 digit integer:");
       String number = sc.nextLine();
       String encryptedNumber = encrypt(number);
       System.out.println("The decrypted number is:"+encryptedNumber);
       System.out.println("The original number is:"+decrypt(encryptedNumber));
      
   }

}
