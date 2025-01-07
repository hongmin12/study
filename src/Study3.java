public class Study3 {

    public static void main(String[] args) {

        String s = "one4seveneight";
        int answer = 0;

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i = 0; i < arr.length; i++) {
            if(s.contains(arr[i])) {
               s = s.replace(arr[i], Integer.toString(i));
            }
        }

        answer = Integer.parseInt(s);

        System.out.println(answer);

    }

}
