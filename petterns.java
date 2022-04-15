


import java.util.Scanner;

public class petterns {
    public static void main(String[] args) {
        System.out.print("enter the pettern number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i ;
        int j ;
        {
            //     *****
           //        ***
            //        **
            //         *
            
            
            for( i =0; i<=n; i++) {
                for ( j = 0; j <= i; j++) {
                    System.out.print(" ");
                }
                for(j= i; j<=n; j++){
                   System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("    ");
            
            //*
            //**
            //***
            //****
            //***
            //**
            //*
            
            
            
            for (i=1; i<=n;i++){
                if(i<=n/2){
                    for(j=1;j<i;j++){
                        System.out.print("*");
                    }
                }
                else{
                    if(i>n/2){
                        for(j=i;j<=n;j++){
                            System.out.print("*");
                        }
                    }
                }
                System.out.println(" ");
            }
            
            
        }

    }
}
