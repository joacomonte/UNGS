        static boolean hayInterseccionPorColumna(int[][] mat1, int[][]mat2) 
        { 
    		boolean ret=true;
    		
    		if(mat1.length==0 || mat2.length==0 || mat1[0].length!=mat2[0].length )
    			return false;
    		else {
    			for(int colum=0; colum<mat1[0].length; colum++) {
    				ret =ret && hayIntersec(mat1, colum, mat2);
    			}
    		}
    		return ret;
    	}
    	
    	static boolean hayIntersec(int [][] mat1, int col, int[][] mat2) {
    		boolean ret=false;
    		for(int indiceFilaM1=0; indiceFilaM1<mat1.length;indiceFilaM1++) {
    			for(int indiceFilaM2=0; indiceFilaM2<mat2.length;indiceFilaM2++) {
    				ret=ret || mat1[indiceFilaM1][col] == mat2[indiceFilaM2][col];
    			}
    		}
    		return ret;
    	}