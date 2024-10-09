package midterm;

public class Main {
      public static void main(String[] args) {
            System.out.println("Days Of week: ");
            for (int i = 0;i < 9;i++) {
                   System.out.println("Number: " + i + "\tDay Of Week: " + DaysOfWeek.DayOfWeekStr(i) );
            }
      }
public class DaysOfWeek {
      public static String DayOfWeekStr(int NumberOfDay) {
            String dayStr = "";
            switch (NumberOfDay) {
                   case 1:
                        dayStr = "Sunday";
                        break;
                   case 2:
                        dayStr = "Monday";
                        break;
                   case 3:
                        dayStr = "Tuesday";
                        break;
                   case 4:
                        dayStr = "Wednesday";
                        break;
                   case 5:
                        dayStr = "Thursday";
                        break;
                   case 6:
                        dayStr = "Friday";
                        break;
                   case 7:
                        dayStr = "Saturday";
                        break;
                   case 8:
                        dayStr = "Sunday";
                        break;
            }
			return dayStr;
        }
    }
}
//Line 2 Days and dates is not an actual thing that can be imported 
//Line 8 missed a ; to complete the statement.
//Line 12 is missing a return statement.
//Line 13 missed a ; to complete the statement.
//Line 22 missed a ; to complete the statement. 
// Is missing Sunday