package my_packge;

import java.util.Random;

public class Matrix {

	public static void main(String[] args) {

		 int m = 5;          
	        int [][] a = new int [m][m];
	        Random rand = new Random();
	        for(int i = 0; i < a.length; i++) {
	            for(int j = 0; j < a[i].length; j++) {
	                a[i][j] = rand.nextInt(10);
	                System.out.print(a[i][j] + " ");
	            }
	            System.out.println();

	            //сумма  диагоналей
	            int sum1 = 0;
	            int sum2 = 0;
	            for ( i = 0; i < m; i++) {
	                sum1 += a[i][i];
	                sum2 += a[i][m-1-i];
	            }
	            System.out.println(sum1);
	            System.out.println(sum2);
	        }    
//Без учета знака, для простоты.

int max = 0;
int quater = 0;
for(int x = 0; x < m; x++){
    for(int y = 0; y < m; y++){
        if(max < a[x][y] && x != y && x != m-y-1){
            max=a[x][y];
            if(x > y && x > m-y-1){
                quater = 1;
            } else if (x > y && x < m-y-1){
                quater = 2;
            } else if (x < y && x < m-y-1){
                quater = 3;
            } else {
                quater = 4;
            }
        }
    }    
}



	}

}
