import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");  
        int i=1;
        String champ =StdIn.readString();  
        do{
            i++;
            String input=StdIn.readString();
            boolean probablity=StdRandom.bernoulli(1.0/i);
            if (probablity){
                 champ = input ;

            } 
        }while (!StdIn.isEmpty());
        StdOut.println(champ);
    }
}
