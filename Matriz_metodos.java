package matriz;

public class Matriz_metodos {
	public void multi () {
	

	        int[][] matriz1 = {
	                {4, 6, 2},
	                {9, 8, 6},
	                {7, 3, 1},
	        };
	        int[][] matriz2 = {
	                {4, 6},
	                {9, 8},
	                {1, 2},
	        };

	        int[][] producto = new int[matriz2.length][matriz2[0].length];

	        
	        for (int a = 0; a < matriz2[0].length; a++) {  
	            for (int i = 0; i < matriz1.length; i++) {
	                int suma = 0;
	                for (int j = 0; j < matriz1[0].length; j++) {  
	                    suma += matriz1[i][j] * matriz2[j][a];
	                }
	              
	                producto[i][a] = suma;
	            }
	        }
	        
	        for (int i = 0; i < matriz2.length; i++) {
	            for (int j = 0; j < matriz2[0].length; j++) {
	                System.out.printf("%d ", producto[i][j]);
	            }
	            System.out.print("\n");
	        }
	    }
	
	public void suma() {

		int[][] matrizoriginal = {
				{1,2,3},
				{4,5,6},
				{7,8,9},
				{10,11,12}};
		
		int[][] matrizT = new int[matrizoriginal[0].length][matrizoriginal.length];
		
		for (int i=0; i < matrizoriginal.length; i++) {
			  for (int a=0; a < matrizoriginal[i].length; a++) {
			    matrizT[a][i] = matrizoriginal[i][a];
			  }
			}
		for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT[0].length; j++) {
                System.out.printf("%d ", matrizT[i][j]);
            }
            System.out.print("\n");
        }
		
	}
	
	public void suma_diagonal() {
		int[][] matriz = {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		int sumap= 0;
		
		for(int i=0; i<matriz.length;i++) {
			sumap=sumap+matriz[i][i];
		}
		System.out.println("La suma de la diagonal principal es: "+sumap);
		
		
	}
	}
