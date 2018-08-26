import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Transaction transaction1 = new Transaction("Hadi" , "Hoda" , 100L);
        Transaction transaction2 = new Transaction("Hoda" , "Amin" , 1000L);
        Transaction transaction3 = new Transaction("Hoda" , "Amin" , 1000L);
        Transaction transaction4 = new Transaction("Amin" , "Nasrin" , 150L);

        Block firstBlock = new Block(0, Arrays.asList(transaction1,transaction2));
        System.out.println(firstBlock.hashcode());

        Block secondBlock = new Block(firstBlock.hashcode() , Arrays.asList(transaction3));
        System.out.println(secondBlock.hashcode());

        Block thirdBlock = new Block(secondBlock.hashcode() , Arrays.asList(transaction4));
        System.out.println(thirdBlock.hashcode());
    }
}
