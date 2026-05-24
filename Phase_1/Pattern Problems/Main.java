public class Main {
    public static void main(String []args) {
    // 1. Hollow Butterfly Pattern ==> 
    // *              *
    // * *          * *
    // *   *      *   *
    // *     *  *     *
    // *     *  *     *
    // *   *      *   *
    // * *          * *
    // *              *

    // int n = 4;
    // int N = 2*n;
    // for(int r = 1; r <= N; r++){
    //    if(r <= n) {//upper part
    //      //upper left
    //     for(int c = 1; c <=r; c++){
    //         if(c == 1|| c == r) {
    //              System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     // space :
    //     for(int s = 1; s <=n-r; s++){
    //         System.out.print(" ");
    //     }
    //     // --------------upper right----------------
    //     for(int s = 1; s <=n-r; s++){
    //         System.out.print(" ");
    //     }
    //     for(int c = 1; c <=r; c++){
    //         if(c == 1|| c == r) {
    //              System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //    } else {// r = 5 6 7 8 
    //     //stars : 
    //     for(int c = 4; c >=(r-n); c--){
    //         if(c == 4 || c == (r-n)) {
    //             System.out.print("*");
    //         }else {
    //              System.out.print(" ");
    //         }
    //     }
    //     //spaces : 
    //     for(int c = 1; c <= (r-(n+1)); c++){
    //         System.out.print(" ");
    //     }
    //     for(int c = 1; c <= (r-(n+1)); c++){
    //         System.out.print(" ");
    //     }
    //      for(int c = 4; c >=(r-n); c--){
    //         if(c == 4 || c == (r-n)) {
    //             System.out.print("*");
    //         }else {
    //              System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //    }
    // }
    // Conclusion : It  took me 30  minutes to solve this pattern.
    // ---------------- 2nd try --------------------------------   
    // int n = 4;
    // int N = 2*n;
    // for(int r = 1; r <= N; r++) { // prints rows
    //     if(r <=n) { //upper half
    //     // upper left
    //     //   star : 
    //     for(int c = 1; c <=r; c++){
    //         if( c == 1|| c == r){
    //           System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }

    //     //   space :
    //     for(int c = 1; c <= n - r; c++){
    //         System.out.print(" ");
    //     }
        
    //     //upper  right : 
    //     //space : 
    //      for(int c = 1; c <= n - r; c++){
    //         System.out.print(" ");
    //     }

    //     //   star : 
    //     for(int c = 1; c <=r; c++){
    //         if( c == 1|| c == r){
    //           System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //     }
    //     System.out.println();
    //     } else { //lower half
    //         //lower left star
    //        for(int c = n; c >=(r-n);c--){
    //         if(c == n || c == r-n){
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //        }
    //        // space :
    //        for(int c = 1; c <= (r - (n+1));c++) {
    //         System.out.print(" ");
    //        }
    //        // lower right parts 
    //        //space : 
    //          for(int c = 1; c <= (r - (n+1));c++) {
    //         System.out.print(" ");
    //        }
    //     //    stars :
    //        for(int c = n; c >=(r-n);c--){
    //         if(c == n || c == r-n){
    //             System.out.print("*");
    //         } else {
    //             System.out.print(" ");
    //         }
    //        }

    //        System.out.println();
    //     }

    // }
        // ---------------- 3rd try --------------------------------  
    // int n = 4;
    // int N = 2*n;
    //  for(int r = 1; r <=N;r++){
    //     if(r <=n){
    //         for(int c=1; c <=r; c++){
    //             if(c == 1 || c == r) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         for(int c =1; c <=n-r; c++){
    //             System.out.print(" ");
    //         }
    //         for(int c =1; c <=n-r; c++){
    //             System.out.print(" ");
    //         }
    //          for(int c=1; c <=r; c++){
    //             if(c == 1 || c == r) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     } else {
    //         for(int c=4; c >= r-n; c--){
    //             if(c == 4 || c == r-n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         for(int c =1; c <=r-(n+1); c++){
    //             System.out.print(" ");
    //         }
    //         for(int c =1; c <=r-(n+1); c++){
    //             System.out.print(" ");
    //         }
    //         for(int c=4; c >= r-n; c--){
    //             if(c == 4 || c == r-n) {
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    //  }
    //  Conclusion : It  took me 7  minutes to solve this pattern with different approach.
// 2. Hollow Diamond
//       *
//     *   *
//   *       *
// *           *
//   *       *
//     *   *
//       *
//   int N = 10;
//   int n = (N+1)/2;
//   for(int r = 1; r <=N;r++){
//     if(r <=n){
//         // spaces  
//     for(int c = 1; c <= (n-r);c++){
//         System.out.print(" ");
//     }
//     // stars : 
//     for(int c = 1; c <= r;c++){
//         if(c == 1){
//             System.out.print("*");
//         }else {
//             System.out.print(" ");
//         }
//     }
//     for(int c = 1; c <= r-1;c++){
//         if(c == r-1) {
//             System.out.print("*");
//         } else {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
//     } else {
//         // spaaces :
//         for(int c = 1; c <= r-n;c++){
//         System.out.print(" ");
//     }
//     for(int c = 1; c <= 2*n - (r);c++){
//         if(c == 1){
//             System.out.print("*");
//         }else {
//             System.out.print(" ");
//         }
//     }
//     for(int c = 1; c <= 2*n - (r+1);c++){
//         if(c == 2*n - (r+1)){
//             System.out.print("*");
//         }else {
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
//     }
//   }
// -----------------------------------------------------
// 3. Sandglass Pattern
// * * * * *
//   * * * *
//     * * *
//       * *
//         *
//       * *
//     * * *
//   * * * *
// * * * * *
        // int N = 8;
        // int n = (N+1)/2;
        // for(int r = 1; r <= N; r++){
        //   if(r <= n) {
        //       for(int c = 1; c < r;c++){
        //         System.out.print("  ");
        //       }
        //       for(int c = r; c <= n;c++){
        //         System.out.print("* ");
        //      }

        //     System.out.println();
        //   } else {
        //     for(int c = 1; c <= N-r;c++){
        //         System.out.print("  ");
        //       }
        //       for(int c = 1; c <= r-n+1;c++){
        //         System.out.print("* ");
        //      }
        //       System.out.println();

        //   }
        // }
        // --------------------------- 4th Try ---------------------
      //  int n = 3;
      //  for(int r = 1; r <=2*n; r++){
      //   if(r <=n) {
      //     for(int c = 1; c <=r;c++){
      //       if(c == 1|| c == r){
      //         System.out.print("*");
      //       } else {
      //         System.out.print(" ");
      //       }
      //     }
      //     for(int c = 1; c <= n-r;c++){
      //       System.out.print(" ");
      //     }
      //     for(int c = 1; c <= n-r;c++){
      //       System.out.print(" ");
      //     }
      //       for(int c = 1; c <=r;c++){
      //       if(c == 1|| c == r){
      //         System.out.print("*");
      //       } else {
      //         System.out.print(" ");
      //       }
      //     }
      //     System.out.println();

      //   } else {
      //     for(int c = 1; c <= (2*n - r +1);c++){
      //       if(c == 1|| c == 2*n - r +1){
      //         System.out.print("*");
      //       } else {
      //         System.out.print(" ");
      //       }
      //     }

      //     for(int c = 1; c <= r-(n+1);c++){
      //       System.out.print(" ");
      //     }
      //     for(int c = 1; c <= r-(n+1);c++){
      //       System.out.print(" ");
      //     }
      //       for(int c = 1; c <= (2*n - r +1);c++){
      //       if(c == 1|| c == 2*n - r +1){
      //         System.out.print("*");
      //       } else {
      //         System.out.print(" ");
      //       }
      //     }
      //     System.out.println();
      //   }

      //  }
      //  Conclusion : It took me 11 minutes without any book pen i.e dry run
      // ---------------------- 5th try -------------------------
      // int n = 4;
      // for(int r = 1; r <= 2*n; r++){
      //   if(r <= n) {
      //     for(int c = 1; c <=r;c++){
      //       if(c ==1 || c == r) {
      //         System.out.print("*");
      //       } else {
      //         System.out.print("=");
      //       }
      //     }
      //     for(int c = 1; c <= n-r; c++){
      //        System.out.print("=");
      //     }
      //     for(int c = 1; c <= n-r; c++){
      //        System.out.print("=");
      //     }
      //     for(int c = 1; c <=r;c++){
      //       if(c ==1 || c == r) {
      //         System.out.print("*");
      //       } else {
      //         System.out.print("=");
      //       }
      //     }
      //     System.out.println();
      //   } else {
      //     for(int c = 1; c <= (2*n -r)+1; c++){
      //        if(c ==1 || c == (2*n -r)+1) {
      //         System.out.print("*");
      //       } else {
      //         System.out.print("=");
      //       }
      //     }
      //     for(int c = 1; c <= r-(n+1)  ;c++){
      //       System.out.print("=");
      //     }
      //     for(int c = 1; c <= r-(n+1)  ;c++){
      //       System.out.print("=");
      //     }
      //     for(int c = 1; c <= (2*n -r)+1; c++){
      //        if(c ==1 || c == (2*n -r)+1) {
      //         System.out.print("*");
      //       } else {
      //         System.out.print("=");
      //       }
      //     }
      //     System.out.println();

      //   }
      // }
      // Conclusion : almost 10 minutes still got confused between lower left part logic 
      // // ---------------- 6th try -----------
      // int n = 5;
      // for(int r = 1; r <= 2*n; r++){
      //   if( r <= n) {
      //     for(int c = 1; c<=r; c++){
      //       if( c == 1 || c == r) {
      //         System.out.print("*");
      //       } else {
      //         System.out.print(" ");
      //       }
      //     }
      //     for(int c = 1; c <= n-r;c++){
      //       System.out.print(" ");
      //     }
      //     for(int c = 1; c <= n-r;c++){
      //       System.out.print(" ");
      //     }
      //      for(int c = 1; c<=r; c++){
      //       if( c == 1 || c == r) {
      //         System.out.print("*");
      //       } else {
      //         System.out.print(" ");
      //       }
      //     }
      //     System.out.println();
      //   } else {
      //     for(int c = 1; c<=((2*n)-r)+1;c++) {
      //       if(c == 1 || c == ((2*n)-r)+1) {
      //         System.out.print("*");
      //       } else {
      //          System.out.print(" ");
      //       }
      //     }
         
      //     for(int c = 1; c <= r - (n+1); c++){
      //       System.out.print(" ");
      //     }
      //     for(int c = 1; c <= r - (n+1); c++){
      //       System.out.print(" ");
      //     }
      //     for(int c = 1; c<=((2*n)-r)+1;c++) {
      //       if(c == 1 || c == ((2*n)-r)+1) {
      //         System.out.print("*");
      //       } else {
      //          System.out.print(" ");
      //       }
      //     }
      //      System.out.println();

      //   }
      // }
   // Conclusion : almost 13 minutes still got confused between lower left part logic 
    }
}