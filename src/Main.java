import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("вводи число: ");

        String str = in.nextLine();

        if (str.length() == 1) {
            System.out.println(str);
            System.exit(0);

        }
        while (str.charAt(str.length()-1) == '0') {
            str = str.substring(0,str.length()-1);
        }


        char[] arr = str.toCharArray();
        int begin = 0;
        if (str.contains("-")) {
            begin++;
        }

        int end = arr.length-1;
        char temp;
        for (;begin < end;){
            temp = arr[begin];
            arr[begin] = arr[end];
            arr[end] = temp;
            begin++;
            end--;
        }
        str = new String(arr);
        System.out.println(str);
    }
}
