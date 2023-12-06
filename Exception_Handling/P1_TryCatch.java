package Exception_Handling;

// // Level 1 - having an exception
// public class P1_TryCatch{
//     public static void main(String[] args) {
//         int i,j,k;

//         i = 8;
//         j = 0;  // can cause exception if value is 0, otherwise no exception


//         k = i/j;   // critical statement, throws exception (ArithmeticException) an unchecked(runtime) error

//         System.out.println(k);   // this line is never reached
//     }
// }


// // Level 2 - using try - catch to solve that error
// public class P1_TryCatch{
//     public static void main(String[] args) {
//         int i,j,k;

//         i = 8;
//         j = 0;  

//         k = 0;

//         try {
//         k = i/j;   // critical statement is wrapped with try block
//         }
//         // exception thrown by try is handled by catch
//         // using object (e) of generic Exception class 
//         catch(Exception e){
//             System.out.println("Cannot be divided by zero");
//         }
        
//         // k must be initialized, as if exception occurs k will stay uninitiaized
//         System.out.println(k);   // this line is never reached
//     }
// }


// // LEvel 3 - handling multiple exceptions
public class P1_TryCatch{
    public static void main(String[] args) {
        int i,j,k;
        int[] arr = new int[4];

        i = 8;
        j = 1;  
        k = 0;

        // now we have multiple critical statments each which may throw different types of exceptions
        try {
        k = i/j;   // ArithmeticException

        // ArrayOutOfBoundsException
        for(int in = 0; in<=4; in++){
            arr[in] = 1;
        }
        }
        catch(ArithmeticException ae){
            System.out.println("Cannot be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException arre){
            System.out.println("Cannot access this index of array");
        }
        // this can handle any other type of errors
        catch(Exception e){
            System.out.println();
        }
        
        
        System.out.println(k); 
        for(int val : arr){
            System.out.print(val + ", ");
        };
    }
}