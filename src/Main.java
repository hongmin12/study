import java.util.*;

public class Main {
    public static void main(String[] args) {

        String answer = "";

        String x = "5525";
        String y = "1255";

        List<Character> x1 = new ArrayList<>();
        List<Character> y1 = new ArrayList<>();

        for(char c : x.toCharArray()) {
            x1.add(c);
        }

        for(char c : y.toCharArray()) {
            y1.add(c);
        }

        outerloop:
        for(int i=0; i<x1.size(); i++){
            for(int j=0; j<y1.size(); j++){
                if(x1.get(i).equals(y1.get(j)) && !x1.get(i).equals('0')){
                    answer += x1.get(i);
                    x1.remove(i);
                    y1.remove(j);
                    i--;
                    continue outerloop;
                }else if(x1.get(i).equals(y1.get(j)) && x1.get(i).equals('0')){
                    if(answer.isEmpty() || answer.equals("0")) {
                        answer = "0";
                    }else {
                        answer += "0";
                    }
                    x1.remove(i);
                    y1.remove(j);
                    i--;
                    continue outerloop;
                }
            }
        }

        if(answer.isEmpty()){
            answer = "-1";
        }else if(!answer.equals("0")){
            List<Integer> ans1 = new ArrayList<>();
            for(char c : answer.toCharArray()){
                ans1.add(Character.getNumericValue(c));
            }

            ans1.sort(Comparator.reverseOrder());
             StringBuilder sb = new StringBuilder();
             for(int i : ans1) {
                 sb.append(i);
             }
             answer = sb.toString();
        }

        System.out.println(answer);

    }
}