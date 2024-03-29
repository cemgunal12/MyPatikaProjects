package patikaw3;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        int select;
        int right=3;
        int balance=2000;

        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName=input.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password=input.nextLine();
            if((userName.equals("patika"))&&(password.equals("dev123"))){
            System.out.println("Zort Bankasına Hoşgeldiniz !");
            do{
                System.out.println("Yapmak istediğiniz işlemi giriniz");
                System.out.println("1-Para Yatırma \n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                select=input.nextInt();

                switch(select){
                    case 1:
                    System.out.println("Para miktarı : ");
                    int price=input.nextInt();
                    balance+=price;
                    System.out.println("Bakiyeniz"+ balance);
                    break;
                    case 2:
                    System.out.println("Para miktarı : ");
                    int money=input.nextInt();
                    if(balance>money){
                        balance-=money;
                        System.out.println("Kalan bakiyeniz : "+balance);
                    }else{
                        System.out.println("Bakiye yetersiz.");
                    }
                    break;
                    case 3:
                    System.out.println("Bakiyeniz : " + balance);
                    break;
                }

            }while(select!=4);
            System.out.println("Tekrar görüşmek üzere.");
            break;
        }else{
            right--;
            System.out.println("Girdiğiniz bilgiler hatalı");
            if(right==0){
                System.out.println("Hesabınız bloke olmuştur.");
            }else{
                System.out.println("Kalan hakkınız "+right);
            }
        }
        
        }
        input.close();
    }
}
