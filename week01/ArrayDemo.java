package week01;

import java.util.Random;

class ArrayDemo {

    public static void main(String[] args) {
        int[] arr1 = { 1, 5, 4, 2, 8 };
        // System.out.println(arr1);
        // [I@28a418fc
        // [表示是数组，I表示是int类型，@间隔符号，后面的是具体地址值
        Random r = new Random();
        int randomIndex = r.nextInt(arr1.length);
        System.out.println(arr1[randomIndex]);


        char[] chars = yanzhengma(6);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }

    }

    public static char[] yanzhengma(int len) {

        char[] chas = new char[52];
        for (int i = 0; i < chas.length; i++) {
            if (i <= 25) {
                chas[i] = (char) (97 + i);
            } else if(i<=51){
                chas[i] = (char) (65 + i - 26);
            }
        }
        // for (int i = 0; i < chas.length; i++) {
        //     System.out.print(chas[i] + " ");
        // }
        // System.out.println();

        char[] res = new char[len];
        for (int i = 0; i < res.length; i++) {
            Random r = new Random();
            int index = r.nextInt(chas.length);
            res[i] = chas[index];
        }
        return res;
    }

}