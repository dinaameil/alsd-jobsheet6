public class SortingMain08 {
    public static void main(String[] args) {
        
        int a[]= {20, 10, 2, 7, 12};
        int b[]= {30, 20, 2, 8, 14};

        Sorting08 dataurut1= new Sorting08(a, a.length);

        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println();

        Sorting08 dataurut2= new Sorting08(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut2.tampil();

    }
}
