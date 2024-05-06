public class ArrayExample {
    public static void main(String[] args) {
        String fruit[] = {"mango", "orange", "apple", "banana"};
        
        System.out.println(fruit);   //@372f7a8d
        System.out.println(fruit[0]); //mango
        System.out.println(fruit[1]); //orange
        System.out.println(fruit[2]); //apple
        System.out.println(fruit[3]); //banana

        for(int i=0; i<fruit.length; i++){
            System.out.println(fruit[i]); 
        }


        int roll[] =new int[4];
        roll[0] =1;
        roll[1] =7;
        roll[2] =9;
        roll[3] =10;
        for(int i=0; i<roll.length; i++){
            System.out.println(roll[i]);
        }

    }

}
