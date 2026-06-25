public class practice {
   public static void main(String[] args) {
   // print out the sum of all the positive integers from 1-100 and the sum of the
   // even integers from 1-100 and the odd integers from 1-100   
   System.out.println(getDayNumber("monday"));
   getFactorial();
  
   
   }

 public static void getFactorial(){
/* for (int k = 0; k <= 100; k++) {
      total+=k;

      if (k % 2 == 0) {
         evenTot+= k;
         continue;
      }
      oddTot+= k;
      
   } */
   
   int evenTot = 0;
   int oddTot = 0;
   int total = 0;

 for (int j = 0; j <= 100; j++) {
   total+=j;

      switch ( j % 2) {
         case 0:
         evenTot+= j;
         continue;

         default:
         oddTot+= j;

      }
   }

   System.out.println("Odd Total: "+ oddTot);
   System.out.println("Even Total: "+ evenTot);
   System.out.println("Odd Total + Even Total: " + total);

   // System.out.println(factorialMethod(10));
   // System.out.println(factorialMethod(4));

/* public static int factorialMethod(int start) {
    int total = 1;
    for (int i = 2; i <= start; i++) {
         total *= i;
     } 
    return total;
    }*/
    

 }

    public static int getDayNumber(String day) {

     return switch(day.toLowerCase()) {
            case "monday" -> 1;
            case "tuesday" -> 2;
            case "wednesday" -> 3;
            case "thursday" -> 4;
            case "friday" -> 5;
            case "saturday" -> 6;
            case "sunday" -> 7;
            default -> -1;
      };

     /*  switch (day) {

         case "Monday":
             System.out.println(1);
             break;
         case "Tuesday":
             System.out.println(2);
             break;
         case "Wednesday":
             System.out.println(3);
             break;
         case "Thursday":
               System.out.println(4);
               break;
         case "Friday":
             System.out.println(5);
             break;
         case "Saturday":
               System.out.println(6);
               break;
         case "Sunday":
               System.out.println(7);
                break;
         default:
         System.out.println("Invalid Day"); */
      }
    }

  