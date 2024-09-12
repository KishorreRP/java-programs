//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int n = 50;
        for(int i=0;i<=n;i++){
            prime(i);

        }
    }

    public static void prime(int n){
        int Count = 0;
        for(int j=2;j<n; j++){
            if(n%j==0){
                Count ++;
            }

        }
        if(Count ==0){

            System.out.println("the prime is "+n);
        }else{
            System.out.println("the prime is not "+n);
        }

    }
}




