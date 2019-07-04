package com.skyhills.dummy;

/**
 * Created by soeunpark on 2018. 1. 2..
 */
public class Jewel {
    public static void main(String[] args) {
        // 보석점에 있는 보석들( jewelType )과 가방이 견딜 수 있는 무게( capacity )가 주어졌을 때, 가방에 넣을 수 있는 보석의 최대가격을 리턴하는 함수 maxDuffelBagPrice 를 작성하세요.
        JewelType [] jewelTypes = new JewelType[] {
                new JewelType(7, 210),
                new JewelType(3, 90),
                new JewelType(2, 15),
        };
        maxDuffelBagPrice(20, jewelTypes);
    }

    private static int maxDuffelBagPrice(int capacity, JewelType[] jewelTypes) {
        int N = jewelTypes.length;
        int[][] V = new int[N + 1][capacity + 1];

        for (int item=1;item<=N;item++){
            for (int weight=1; weight<=capacity; weight++){
                if (jewelTypes[item-1].weight <=weight){
                    V[item][weight] = Math.max(jewelTypes[item-1].price + V[item-1][weight-jewelTypes[item-1].weight], V[item-1][weight]);
                } else {
                    V[item][weight] = V[item-1][weight];
                }
            }
        }
        System.out.println(V[N][capacity]);
        return V[N][capacity];
    }


    public static class JewelType {
        int weight;
        int price;

        public JewelType(int weight, int price) {
            this.weight = weight;
            this.price = price;
        }
    }
}


