package com.skyhills.dummy;

/**
 * Created by soeunpark on 2018. 1. 8..
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Sun1 {

    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = {'a', 'b', 'c'};
        Permutation main = new Permutation(arr, arr.length);
        main.perm(0);

    }

    public static class Permutation {
        private static int n;
        private int r;
        private ArrayList<Character> itemList;
        private int[] res;

        public Permutation(char[] intArr, int r){
            this.r = r;
            this.n = intArr.length;
            this.res = new int[r];
            itemList = new ArrayList<Character>();
            for(char item : intArr)
                itemList.add(item);
        }

        public void perm(int depth){
            perm(itemList, 0);
        }

        public void perm(ArrayList<Character> itemList, int depth) {

            if (depth == r) {
                System.out.println(Arrays.toString(res));
                return;
            }

            for (int i = 0; i < n; i++){
//                System.out.println("aaa");
                res[depth] = itemList.get(i);
                perm(itemList, depth+1);
            }
        }
    }
}