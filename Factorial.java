public class Factorial {
    public int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Factorial f=new Factorial();
        System.out.println(f.fact(5));
    }
}
