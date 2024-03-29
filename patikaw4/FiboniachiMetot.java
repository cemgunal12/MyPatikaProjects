package patikaw4;

public class FiboniachiMetot {
    static int fibonachi(int number){
        if((number==1)||(number==2)){
        return 1;}
        return fibonachi(number-1)+fibonachi(number-2);
    }
    public static void main(String[] args) {
        System.out.println(fibonachi(9));
    }
}
