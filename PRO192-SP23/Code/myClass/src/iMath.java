interface Operator{
    int calc(int firstNum, int secondNum);
}

public class iMath {
    static void Execute(int a, int b, Operator m){
        System.out.println(m.calc(a, b));
    }
    public static void main(String[] args) {
        Execute(18, 9, (x,y)->x/y);
        Execute(1, 9, (x,y)->{
            int s = 0;
            for (int i = x; i <= y; i++) {
                s += i;
            }
            return s;
        });
    }
}
