import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("Output.txt");

        //file input proccess

        int[] datalist = readFile();

        // main execution

        int term;

        try{

            PrintWriter output = new PrintWriter(file);

            for(int i = 1 ; i< datalist.length ; i++){

                term = main_execution(datalist[i],datalist[i+1]);

                System.out.println("terms : "+term);

                output.println("case #"+((i+2)/2)+": "+ term);

                i = i+1;
            }

            output.close();

        }catch (FileNotFoundException e) {System.out.println("File not found");}
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

    private static int[] readFile() throws FileNotFoundException {


        File file1 = new File("D:\\Java\\NoNine\\input.txt");

        Scanner sc = new Scanner(file1);

        int ctr = 0 ;
        while(sc.hasNext()){

            ctr++;
            sc.nextInt();
        }

        int[] testcase = new int[ctr];

        Scanner scanner1 = new Scanner(file1);

        for ( int i =0 ; i<testcase.length ; i++){
            testcase[i] = scanner1.nextInt();
        }

        return testcase;
    }

    private static int main_execution(int i , int j){

        int term = 0;


        while(i <= j){

            int c = checknine(i);

            if (c == 1){
                term = term + 1;
            }

            i = i+1;
        }

        return term;
    }
}
