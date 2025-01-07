import java.util.ArrayList;

public class study1 {

    public static void main(String[] args) {

        int n = 10;
        int answer = 0;

        n = n-1;

        for(int i = 2; i <= n; i++) {

            if(n%i == 0) {
                answer = i;
                break;
            }

        }


        System.out.println(answer);

    }

}
