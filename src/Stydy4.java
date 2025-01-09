public class Stydy4 {

    public static void main(String[] args) {

        int left = 24;
        int right = 27;
        int answer = 0;

        for(int i = left; i <= right; i++) {
            int sqrt = (int) Math.sqrt(i);
            if(sqrt * sqrt == i) {
                answer -= i;
            }else {
                answer += i;
            }
        }

        System.out.println(answer);

    }
}
