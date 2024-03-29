package Oyun;

import java.util.Random;

public class Snake extends Monster {
    public Snake(){
        super(4, "Snake" ,0, 12 , 0 );
        Random a = new Random();
        int randomDamages = a.nextInt(4) + 3;
        super.setDamage(randomDamages);
    }
}
