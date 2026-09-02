public class printPattern {

    // pattern 1
    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("x ");
                // space = space - 2;
            }
            System.out.println("");
        }
    }

    //pattern 2
    public static void rightTrianglePattern(int n) {
        for (int i=0; i < n; i++) {
            for (int j=0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }    
    }

    // pattern 3
    public static void rightTrianglePatternNumber(int n) {
        for (int i=1; i <= n; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }    
    }

    // pattern 4
    public static void rightTrianglePatternRow(int n) {
        for (int i=1; i<=n; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }

    // pattern 5
    public static void reverseRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i+1; j++) { //
                System.out.print("*");
            }
            System.out.println();
        }
    }
 
    // pattern 6
    public static void reverseRightTriangleNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    // pattern 7
    public static void printTriangleStar(int n) {
        
        for (int i=0; i<n; i++) {
            // space
            for (int j=0; j<=n-i-1; j++) {
                System.out.print(" ");
            }

            // star
            for (int j=0; j < 2*i+1; j++) {
                System.out.print("*");
            }

            // space
            for (int j=0; j<=n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }

        
    }

   
    // pattern 8
    public static void printReverseTriangleStar(int n) {
        for (int i=0; i<n; i++) {
            // space
            for (int j=0; j<i; j++) {
                System.out.print( " ");
            }
            // star
            for (int j=0; j< 2*n - (2*i + 1); j++) {
                System.out.print("*");
            }
            //space
            for (int j=0; j<i; j++) {
                System.out.print( " ");
            }
            System.out.println("");
        }
    }

    // pattern 10
    public static void printSideTriangleStar(int n) {
        for (int i=1; i<= 2*n-1; i++) {
            int stars = i;
            if (i > n ) stars = 2*n - i; 
            for (int j=1; j<= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // pattern 11
    public static void RightAngleTriangleWithZeroAndOne(int n) {
        int start = 1;
        for (int i=0; i<n; i++) {
            if (i % 2 == 0) { 
                start = 1; 
            } else {
                start = 0;
            }
 
            for (int j=0; j<=i; j++) {
                System.out.print(start);
                start = 1- start;
            }

            System.out.println("");
        }
    }
    
    // pattern 12
    public static void pattern12(int n) {
        int space = 2 * (n -1);

        for (int i=1; i<=n; i++) {
            // number 
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }

            // space
            for (int j=1; j<=space; j++) {
                System.out.print(" ");
                
            }

            // number
            for (int j=i; j>=1; j--) {
                System.out.print(j);
            }

            System.out.println("");
            space -= 2;
        }
    }
    

    // pattern 13
    public static void pattern13(int n) {
        int num = 1;
        for (int i=1; i<=n; i++) {

            for (int j=1; j<=i; j++) {
                System.out.print(num + " ");
                num +=1;
            }

            System.out.println("");
        }
    }
    
    // pattern 14
    public static void pattern14(int n) {
        for (int i=0; i<n; i++) {
            for (char ch='A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // pattern 15
    public static void pattern15(int n) {
        for (int i=0; i<n; i++) {
            for (char ch='A'; ch <= 'A' + (n-i-1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // pattern 16
    public static void pattern16(int n) {
        for (int i=0; i<n; i++){
            char ch = (char) ('A' + i);
            for (int j=0; j<=i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    // pattern 17
    public static void pattern17(int n) {
        for (int i=0; i<n; i++) {
            // space
            for (int j=0; j<n-i-1; j++){  
                System.out.print(" ");
            }

            // char
            char ch='A';
            int breakPoint = (2*i+1)/2;
            for (int j=0; j < 2*i+1; j++) {   
                System.out.print(ch);
                if (j < breakPoint) ch++;
                else ch--;
            }

            // space
            for (int j=0; j<n-i-1; j++){  
                System.out.print(" ");
            }
            System.out.println();

        }
    }


    // pattern 18
    public static void pattern18(int n) {
        for (int i=0; i<n; i++) {
            for (char ch= (char)('E' - i); ch <= 'E'; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    // pattern 19
    public static void pattern19(int n) {
        int space = 0;
        // first part 
        for (int i=0; i<n; i++) {
            // start
            for (int j=1; j<=n-i; j++) {
                System.out.print("*");
            }

            // space 
            for (int j=0; j<space; j++){
                System.out.print(" ");
            }

            // start
            for (int j=1; j<=n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
            space += 2;
        }

    }

    public static void main(String[] args) { 
        
        // squarePattern(5);
        // rightTrianglePattern(5);
        // rightTrianglePatternNumber(5);
        // rightTrianglePatternRow(5);
        // reverseRightTriangle(5);
        // reverseRightTriangleNumber(5);
        // printTriangleStar(5);
        // printReverseTriangleStar(5);
        // printSideTriangleStar(5);
        // RightAngleTriangleWithZeroAndOne(5);
        // pattern12(4);
        // pattern13(5);
        // pattern14(5);
        // pattern15(5);
        // pattern16(5);
        // pattern17(5);
        // pattern18(5);
        pattern19(5);
    }
}
