package javaprograms;

public class triangleStar {

    public static void main(String[] args) {
        
        for(int i1 = 1; i1 <= 5; i1++) {
            for(int j1 = 1; j1 <= i1; j1++) {
              
				System.out.print( "*   " );
            }
            System.out.println();
        }
    }
}