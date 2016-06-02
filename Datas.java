package mylittlesql;

import java.util.ArrayList;
import java.util.Random;

public class Datas {

    final int N, M;
    private final int[][] matris;
    private final Random r;
    private final int[] sutunToplam;
    private final int[] sutunIndex;

    public Datas(int N) {
        this.N = N;
        M = 10;
        r = new Random();
        matris = new int[N][M];
        sutunToplam = new int[M];
        sutunIndex = new int[M];
        matrisDoldur();
        matrisYazdir();
        sutunToplamHesapla();
        sutunToplamSirala();
        sutunToplamYazdir();
    }

    private void matrisDoldur() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matris[i][j] = r.nextInt(2);
            }
        }
    }

    private void matrisYazdir() {
        System.out.println("#Oluşturulan ürün matrisi :");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private void sutunToplamHesapla() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                sutunToplam[i] += matris[j][i];
                sutunIndex[i] = i;
            }
        }
    }

    private void sutunToplamYazdir() {
        System.out.print("#Ürün numarası  : ");
        for (int i = 0; i < M; i++) {
            System.out.print(sutunIndex[i] + " ");
        }
        System.out.println("");

        System.out.print("#Satılan ürün : ");
        for (int i = 0; i < M; i++) {
            System.out.print(sutunToplam[i] + " ");
        }
        System.out.println("");

    }

    private void sutunToplamSirala() {
        quicksort(sutunToplam, 0, sutunToplam.length - 1);
    }

    private void quicksort(int[] A, int left, int right) {
        if (left < right) {
            int pivot = partition(A, left, right);
            quicksort(A, left, pivot);
            quicksort(A, pivot + 1, right);
        }
    }

    private int partition(int[] A, int left, int right) {
        int x = A[left];
        int i = left;
        int j = right;
        while (true) {
            while (A[i] > x) {
                i++;
            }
            while (A[j] < x) {
                j--;
            }
            if (i < j) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                int temp2 = sutunIndex[i];
                sutunIndex[i] = sutunIndex[j];
                sutunIndex[j] = temp2;
                i++;
                j--;
            } else {
                return j;
            }
        }
    }

    void count(int n) {
        int[] indices;
        CombinationGenerator x = new CombinationGenerator(this.sutunIndex.length, n);
        StringBuffer combination;
        while (x.hasMore()) {
            combination = new StringBuffer();
            indices = x.getNext();
            for (int i = 0; i < indices.length; i++) {
                combination.append(this.sutunIndex[indices[i]]);
            }
            cokluHesapla(combination);
        }
    }

    private void cokluHesapla(StringBuffer s) { 
        ArrayList<Integer> x = new ArrayList();
        int sayac, sayac2 = 0;
        for (int i = 0; i < s.length(); i++) {
            x.add(Integer.parseInt(s.substring(i, i+1)));
        }
        int y;
        int y2 = x.size();
        for (int i = 0; i < N; i++) {
            sayac = 0;
            y = x.size();
            while(y > 0){
                sayac += matris[i][x.get(y - 1)];
                y--;
            }
            if (sayac == y2) {
                sayac2++;
            }
        }
        System.out.println( x + " -> " + sayac2);
    }
}
