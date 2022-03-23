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
    		for(int row=0; row<mat1.length;row++) {
    			for(int row2=0; row2<mat2.length;row2++) {
    				ret=ret || mat1[row][col] == mat2[row2][col];
    			}
    		}
    		return ret;
    	}
