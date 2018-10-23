public class Main {

    public static void main(String[] args) {

        int[] distance = new int[2];

        distance[0] = 16;
        distance[1] = 26;

        int term = 0;

        int i = distance[0];

        while(i <= distance[1]){

            int c = checknine(i);

            if (c == 1){
                term = term + 1;
            }

            i = i+1;
        }

        System.out.println("terms = "+term);
    }

    private static int checknine(int i) {

        int a = 0;
        int flag = 0;

        while(i > 0) {

            int x = i % 10;
            if (x == 9 ){
                flag = 1;
            }
            a = a + x;
            i = i / 10;
        }

        if (a == 9){
            flag = flag + 1;
        }

        if(flag > 0){

            return 0;
        }else{
            return 1;
        }
    }
}
