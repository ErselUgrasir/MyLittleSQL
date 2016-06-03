package searchmatriscombinations;

import java.util.Scanner;

public class SearchMatrisCombinations {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("#Lütfen müşteri sayısını giriniz: ");
        Datas d = new Datas(input.nextInt());
        for (int i = 2; i < d.M; i++) {
            d.count(i);
        }
    }
}
