static void customPattern(int n){ 
    int row=n+(n+2)+((n-1)/2)-1; 
    int col=n+(n+2)+n-1;
    for(int i=0;i<=row;i++){ 
        for(int j=0;j<=col;j++){ 
            // Triangle Star pattern
            if(j>=col-(n-1)-i && j<=col-(n-1)+i && i<=n-1){ 
                customPrint(true,"*");
            // print # , no. of n+2 time
            }else if(j==col-(n-1) && i>=n && i<=2*n+1){
                customPrint(true,"#");
            // print e , no. of n+2 time
            }else if(i==2*n+2-1 && j>=n && j<=col-n){
                customPrint(true,"e");
            // Print Squre, no. of n time
            }else if((i==row || i==row-n+1)  && j<=n-1 || i>=row-n+1 && (j==0||j==n-1)){
                customPrint(true,"*");
            // Print space , where no condition match
            }else{
                customPrint(false,"");
            }  

        }
        System.out.println(); 
    }
}

static void customPrint(boolean flag, String pnt){

    if(flag){
        System.out.print(pnt);
    }else{
        System.out.print(" ");
    } 
    
}

 
