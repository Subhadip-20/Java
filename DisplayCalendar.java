  import java.util.*;

    public class DisplayCalendar
       {
        public static void main()
        {
       
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

       
            int daysMonth = 0;

            
            String monthDisplay = "";
            System.out.print("Enter the month in number");
            int month=sc.nextInt();
            
            
            
             System.out.print("Enter the weekday that the month starts: ");
             int firstDayYear = sc.nextInt();
             firstDayYear--;

            
            switch(month)
            {
                case 1: monthDisplay = "January"; 
                    daysMonth = 31;
                    break;

                case 2: 
                    monthDisplay = "February";
                    int leapYear = 0;
                   

                        
                        if (year%4==0)
                        {
                            daysMonth = 29;
                            break;
                        }

                        else 
                        {
                            daysMonth = 28;
                        }
                    
                    break;

                case 3: monthDisplay = "March";
                    daysMonth = 31;
                    break;

                case 4: monthDisplay = "April";
                    daysMonth = 30;
                    break; 

                case 5: monthDisplay = "May";
                    daysMonth = 31;
                    break;

                case 6: monthDisplay = "June";
                    daysMonth = 30;
                    break; 

                case 7: monthDisplay = "July";
                    daysMonth = 31;
                    break;

                case 8: monthDisplay = "August";
                    daysMonth = 31;
                    break;

                case 9: monthDisplay = "September";
                    daysMonth = 30;
                    break;

                case 10: monthDisplay = "October";
                    daysMonth = 31;
                    break;

                case 11: monthDisplay = "November";
                    daysMonth = 30;
                    break;

                case 12: monthDisplay = "December";
                    daysMonth = 31;
                    break; 

                default : System.out.print("Invalid: Your month is not recognized. ");
                    System.exit(0); 

            }
            System.out.println("                      "+ monthDisplay + " " + year);

            System.out.println("_________________________________________________________");

            System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");

            int firstDayEachMonth = (daysMonth + firstDayYear)%7;
            for (int space = 1; space <= firstDayEachMonth; space++)
                System.out.print("   ");

            for (int daysDisplay = 1; daysDisplay <= daysMonth; daysDisplay++)
            {
                if (firstDayYear%7 == 0)
                    System.out.println();

                System.out.printf("%3d      ", daysDisplay);
                firstDayYear += 1;
            }
            System.out.println();
        }

    }
