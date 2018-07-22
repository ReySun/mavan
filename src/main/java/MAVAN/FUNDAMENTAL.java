package MAVAN;

import java.util.Arrays;
import java.util.Scanner;

class FUNDAMENTAL{
    public static void main(String[] args){

    }

    // whild 循环猜数字游戏
    public void numberGuess_while(){
        System.out.println("whild 循环猜数字游戏");
        int num = (int) (Math.random() * 100) + 1;
        System.out.print("请输入0-100的数字，退出请按0：");
        Scanner s = new Scanner(System.in);
        int guest = s.nextInt();

        while(guest != num){
            if(guest == 0){
                break;
            }else if(guest > num){
                System.out.println("太大了");
            }else if(guest < num){
                System.out.println("太小了");
            }
            System.out.print("请输入0-100的数字，退出请按0：");
            guest = s.nextInt();
        }

        if(guest == num){
            System.out.println("恭喜你，猜对了");
        }else{
            System.out.println("很遗憾，祝你下次好运");
        }
        s.close();
    }

    // do whild 循环猜数字游戏
    public void numberGuess_do_while(){
        System.out.println("do whild 循环猜数字游戏");
        int num = (int) (Math.random() * 100) + 1;
        Scanner s = new Scanner(System.in);
        int guest = -1;

        do {
            System.out.print("请输入0-100的数字，退出请按0：");
            guest = s.nextInt();
            if(guest == 0){
                break;
            }else if(guest > num){
                System.out.println("太大了");
            }else if(guest < num){
                System.out.println("太小了");
            }
        } while (guest != num);

        if(guest == num){
            System.out.println("恭喜你，猜对了");
        }else{
            System.out.println("很遗憾，祝你下次好运");
        }
        s.close();
    }

    public void java_array(){
        // 申明方式1
        int[] arr_int = {10, 20, 30}; // [10, 20, 30]
        // 申明方式2
        String[] arr_string;
        arr_string = new String[]{"40", "50", "60"}; // ["40", "50", "60"]
        // 复制数组1
        int[] arr_copy1 = new int[5];
        System.arraycopy(arr_int, 1, arr_copy1, 1, 2); // [0, 20, 30, 0, 0]
        String[] arr_copy2 = new String[5];
        System.arraycopy(arr_string, 1, arr_copy2, 1, 2); // [null, 20, 30, null, null]
        

        // 复制数组2
        int[] arr_copy3 = Arrays.copyOf(arr_int, arr_int.length + 1); // [10, 20, 30, 0]
        String[] arr_copy4 = Arrays.copyOf(arr_string, arr_string.length + 1); // ["40", "50", "60", null]
        
        int[] arr_unsort = {2, 323, 72, 90, 108};
        Arrays.sort(arr_int);
        // this.print_array(arr_copy3);
    }

    public void print_array(Object[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}