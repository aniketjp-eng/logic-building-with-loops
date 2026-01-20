// package Phase_1;
class WhileLoop {
    public static void main(String []args) {
//  Print all numbers from 1 down to 10 using a loop -->
        //     int i = 1;
        //     while(i <= 10) {
        //     System.out.println(i);
        //     i++;
        //    }
//  Print numbers from 10 down to 1 in reverse order -->
        // int i = 10;
        // while(i >=1) {
        //     System.out.println(i);
        //     i--;
        // }
//  Print all even numbers between 1 and 100 -->
        // int i = 1;
        // while(i <= 100) {
        //     if(i % 2 == 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
//  Print all odd numbers between 1 and 100 --> 
        // int i = 1;
        // while(i <= 100) {
        //     if(i % 2 != 0) {
        //         System.out.println(i);
        //     }
        //     i++;
        // }
//  Print the multiplication table of a given number from n x 1 to n x 10 --> 
        // int n = 4, i = 1;
        // while(i <= 10) {
        //     System.out.println(n + " * " + i + " = " + n*i);
        //     i++;
        // }
//  Calculate and print the sum of the first n natural numbers --> 
// method 1 : Formula --> 
        // int n = 4;
        // int sum = (n * (n + 1)) / 2;
        // System.out.println(sum);
// method 2 : Basic method -->
        //  int n = 4;
        //  int i = 1;
        //  int sum = 0;
        //  while(i <= n) {
        //    sum+= i;
        //    i++;
        //  }
        //  System.out.println(sum);

//  Calculate the sum of all even numbers from 1 up to n --> 
        //  int n = 4;
        //  int i = 1;
        //  int sum = 0;
        //  while(i <= n) {
        //    if(i %2 == 0) {
        //      sum +=i;
        //    }
        //     i++;
        //  }
        //  System.out.println(sum);
//  Calculate the sum of all odd numbers from 1 up to n --> 
        //   int n = 4, i = 1, sum = 0;
        //  while(i <= n) {
        //     if(i % 2 != 0) {
        //         sum+= i;
        //     }
        //     i++;
        //  }
        //  System.out.println(sum);
//  Calculate and print the factorial of a given number --> 
        //  increment operator (++)--> 
        // int i = 1;
        // int n = 5;
        // int fact = 1;
        // while(i <= n) { 
        //     fact *= i;
        //     i++;
        // }
        // System.out.println(fact);
        //  decrement operator(--) --> 
        // int n = 5;
        // int fact = 1;
        // while(n >= 1) { 
        //     fact *= n;
        //     n--;
        // }
        // System.out.println(fact);

//  Find and print the product of all digits of a given number -->  it took a little bit time 
        // int n = 111181, prod = 1;
        // while(n != 0) {
        //     int lastDigit = n % 10;
        //     prod *= lastDigit;
        //     n /= 10;
        // }
        // System.out.println(prod);
        
//  Count and print the total number of digits in a given number --> it took a little bit time  
        // int num = 841255;
        // int i = 0;
        // while(num !=0) {
        //         num /= 10;//remove last digit
        //         i++;
        // }
        // System.out.println(i);
//  Reverse the given number and print the reversed value --> it took a little bit more time 
//    int num = 12202;
//    int ans = 0;
//    while(num != 0) {
//         int ld = num % 10;
//         ans =  (ans * 10) + ld;
//         num /= 10;
//    }
//    System.out.println(ans);
//  Check whether the given number is a palindrome -->
// method 1 ---> 
//  int ogNum = 12521;
//  int reverseNum = 0;
//  int test = ogNum;
//  while( test != 0) {
//         int ld = test % 10;
//         reverseNum = (reverseNum * 10) + ld;
//         test /= 10;
//  }
//  if(ogNum == reverseNum) {
//         System.out.println("Palindrome number ");
//  } else {
//         System.out.println("Not a Palindrome");
//  }
//  method 2 --> 
//  int ogNum = 12521;  // test =  12          new  = 125 jaha newnum > testnum waha ruk jao qki hum half num tak ka reverse kar chuke hai
//  int halfRev = 0;
//  int test = ogNum;      
//  while( test > halfRev) {
//         int ld = test % 10;
//         halfRev = (halfRev * 10) + ld;
//         test /= 10;
//  }
//  System.out.println(halfRev);

//  if(test == halfRev || test == halfRev/10) {
//         System.out.println("Palindrome number ");
//  } else {
//         System.out.println("Not a Palindrome");
//  }
//  Find and print the sum of digits of the given number ----> 
//  int nums = 11111;
//  int sum = 0;
//  while(nums != 0) {
//         int ld = nums % 10;
//         sum += ld;
//         nums /= 10;
//  }
//  System.out.println(sum);
//  Check whether the given number is an Armstrong number --> 
int pow = 0;

// int nums = 153;
int nums = 1654;
int test1 =  nums;
int test2 =  nums;
while ( test1 != 0) {
        test1 /= 10;
        pow++;
      }
int sum = 0;
while (test2 != 0) {
        int ld =  test2 % 10;
        sum += Math.pow(ld, pow);
        test2 /= 10;
        
}
if(sum == nums) {
        System.out.println("Armstrong Number!");
} else {
        System.out.println("not Armstrong Number!");
}

// System.out.println(pow);





//  ===============================================================
    }
}








//  Check whether the given number is a Perfect number
//  Print all prime numbers between 1 and 100
//  Check whether the given number is a prime number
//  Print the Fibonacci series up to n terms
//  Find and print the sum of the Fibonacci series up to n terms
//  Print the square of each number from 1 to n
//  Print the cube of each number from 1 to n
//  Print all numbers between a and b that are divisible by 7
// Print all factors of the given number.
// Find and print the sum of all factors of the given number.
// Find the HCF (Highest Common Factor) of two given numbers.
// Find the LCM (Least Common Multiple) of two given numbers.
// Find the smallest digit in the given number.
// Find the largest digit in the given number.
        
//     }
// }