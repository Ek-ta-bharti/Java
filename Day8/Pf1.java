package Day8;

public class Pf1 {
    public static void fullPattern() {
        int n=10;
        for(int j=0; j<n; j++){
            for(int i=0; i<n; i++){
                if( i<=j ){
            System.out.print("*");
        }else{
            System.out.print(" ");
        }
    }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Pf1 dark = new Pf1();
        dark.fullPattern();
    }
}
