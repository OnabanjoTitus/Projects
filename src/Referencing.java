public class Referencing {
    public static void main(String[] args) {
        int a[]= {1,2,3};
        int b[]=a;
        b[0]=9;
        System.out.println(a.equals(b));
        for (int i = 0; i < 3; i++) {
            System.out.printf("%d%d%n",a[i],b[i]);
        int a1=1;
        int b1=a1;
        System.out.println(a1);
        System.out.println(b1);
        a1=7;
        System.out.println(a1);
        System.out.println(b1);
        }
    }
}
