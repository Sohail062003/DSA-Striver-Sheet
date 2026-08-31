public class printPattern {

    // pattern 1
    public static void squarePattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("x ");
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


    public static void main(String[] args) {
        
        // squarePattern(5);
        // rightTrianglePattern(5);
        // rightTrianglePatternNumber(5);
        // rightTrianglePatternRow(5);
        // reverseRightTriangle(5);
        // reverseRightTriangleNumber(5);
        printTriangleStar(5);
    }
}
