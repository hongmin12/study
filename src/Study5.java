import java.util.HashMap;

public class Study5 {

    public static void main(String[] args) {

        int[] absolutes = {1, 2, 3};
        boolean[] signs = {false, false, true};
        int answer = 0;

        HashMap<Integer, String> temp = new HashMap<>();

        for(int i=0; i<absolutes.length; i++) {

            if(signs[i]) {
                temp.put(absolutes[i], "+");
            }else {
                temp.put(absolutes[i], "-");
            }

            answer += Integer.parseInt(temp.get(absolutes[i])+absolutes[i]);

        }


        System.out.println(answer);

    }

}
