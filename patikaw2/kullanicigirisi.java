package patikaw2;

import java.util.Scanner;

public class kullanicigirisi {
    public static void main(String[] args) {
        String userName,password;

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your user name");
        userName=input.nextLine();

        System.out.println("Enter your password");
        password=input.nextLine();

        if(userName.equals("patika")){
            if(password.equals("java123")){
                System.out.println("Başarı ile giriş yaptınız");
            }else{
                System.out.println("Şifreniz yanlış şifrenizi sıfırlamak istermisiniz\nEvet\nHayır");
                String cevap=input.nextLine();
                if(cevap.equals("evet")){
                    System.out.println("Yeni şifrenizi giriniz");
                    String yeniSifre=input.nextLine();
                    if(yeniSifre.equals("java123")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else{
                        System.out.println("Şifre oluşturuldu");
                    }
                }
                }
            }
        
        else{
            System.out.println("Kullanıcı adı yanlış");
    }
    input.close();    
}
}
 