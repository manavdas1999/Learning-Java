package Exception_Handling;

// // Level 1
// public class P1_TryCatch{
//     public static void main(String[] args) {
//         int i,j,k;

//         i = 8;
//         j = 0;  // can cause exception if value is 0, otherwise no exception


//         k = i/j;   // critical statement, throws exception (ArithmeticException) an unchecked(runtime) error

//         System.out.println(k);   // this line is never reached
//     }
// }


// // Level 2
public class P1_TryCatch{
    public static void main(String[] args) {
        int i,j,k;

        i = 8;
        j = 0;  

        k = 0;

        try {
        k = i/j;   // critical statement is wrapped with try block
        }
        // exception thrown by try is handled by catch
        // using object (e) of generic Exception class 
        catch(Exception e){
            System.out.println("Cannot be divided by zero");
        }
        
        // k must be initialized, as if exception occurs k will stay uninitiaized
        System.out.println(k);   // this line is never reached
    }
}
