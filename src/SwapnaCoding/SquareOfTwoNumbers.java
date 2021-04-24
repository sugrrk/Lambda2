package SwapnaCoding;


interface square{
    int calculate(int x);



}






public class SquareOfTwoNumbers {
    public static void main(String[] args) {
//        square s = (int x)->x*x;
//        int calculate  = s.calculate(10);
//        System.out.println("The square of element is " + calculate);


        square s = x->x*x;
        System.out.println(s.calculate(10)+ " is the square of numbers");




    }
}
