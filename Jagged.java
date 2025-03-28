import java.util.Scanner;
public class Jagged {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jarr[][][]= new int [3][][];
        jarr [0]= new int[2][2];
        jarr [1]= new int[3][2];
        jarr [2]= new int [3][4];
        for(int i=0;i<jarr.length;i++){
            for (int j=0;j<jarr[i].length;j++){
                for( int k=0;k<jarr[i][j].length;k++){
                    jarr[i][j][k]=scan.nextInt(); 

                }
            }
        }
        for(int i=0;i<jarr.length;i++){
            for (int j=0;j<jarr[i].length;j++){
                for( int k=0;k<jarr[i][j].length;k++){
                     System.out.println(jarr[i][j][k]); 

                }
            }
        }
    }
}
