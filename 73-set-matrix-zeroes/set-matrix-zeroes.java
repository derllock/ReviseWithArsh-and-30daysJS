class Solution {
    public void setZeroes(int[][] matrix) {
        int mat2[][]=new int[(matrix[0].length)*(matrix.length)][2];
        int k=0,m=0;
        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
                if(matrix[i][j]==0){
                    mat2[k][m]=i;
                    mat2[k][m+1]=j; // doing with leetsync
                    ++k;m=0;
                    

                }  
            }

        }
        if(k!=0){            // mistake 3: if matrix has 1 sing.
                            // element==1 then loop will execute as it is checked in last
        int a=0,b=0;  
        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[0].length;++j){
                if(i==mat2[a][b] ||j==mat2[a][b+1]){
                    matrix[i][j]=0;
                }
                
            }
            if(i==(matrix.length)-1){           // mistake 1: incorrect identify final index
                    i=-1;        // mistake 4: i will be ++ in next iteration 0 will be skipped
                    ++a;
                    
                }
            
            if(a==k)break;                      // mistake 2: < here I'm a fool
        } 
        }
         System.out.println(Arrays.deepToString(matrix));   // this is new .deepToString, no loop is required here. It displays 
    }
}