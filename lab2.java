
public class lab2 {
	public static void main(String[] args) {
	   
		int[][] A = {{5, 7, 6}, {8, 7, 2}, {5, 4, 3}};
		int[][] B = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
		int[][] C = new int[3][3];
		    for ( int i = 0; i < 3; i++) {
		        for ( int j = 0; j < 3; j++) {
		         C[i][j] = A[i][j] ^ B[i][j];
		        }
		    }
	
	for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(C[i][j] + " "  );
      }
     System.out.println( );
     }
        int min = 0;
        int max = 0;
        int first_element;
         for (int i = 0; i < C.length; i++) {
                 first_element = C[0][i];
                 if ( i%2 ==0) {
                    for (int j = 0; j < C.length; j++) {
                        if (first_element < C[j][i]) {
                            first_element = C[j][i];
                        }
                    }
                     max += first_element;
                
                }
            	 else {
            	      for (int j = 0; j < C.length; j++) {
                                if (first_element > C[j][i]) {
                                    first_element = C[j][i];
                                }
                            }
                             min += first_element;
                        }
         }
                        System.out.println( min + max );
            	  
 }
}
