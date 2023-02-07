
public class Date { // date class
// field members
    public static int year;
    public static int month;
    public static int day;
// printing date
    public static void print() {
        System.out.println(Date.year + "/" + Date.month + "/" + Date.day);
    }
// adding a number of days
    public static void addDays(int n) {
        Date.day = Date.day + n; // update days
        // numbers of dates in every months
        int Arr[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        // january
        if (Date.day == Arr[0] + 1 && Date.month == 1) {
            Date.day=Date.day-31;
            Date.month++;
        } 
        // febuarary with both leap year and non leap year days
        else if (Date.month == 2) {
            if (Date.day >= 28 && (Date.year) % 4 != 0) { // non-leap
                Date.day=Date.day-28;
                Date.month++;
            } 
            else if (Date.day >= 29 && Date.year % 4 == 0) { // leap
                Date.day=Date.day-29;
                Date.month++;
            }
        } 
        // march
        else if (Date.day >= Arr[2] + 1 && Date.month == 3) {
            Date.day=Date.day-31;
            Date.month++;
        } 
        // april
        else if (Date.day >= Arr[3] + 1 && Date.month == 4) {
           Date.day=Date.day-30;
            Date.month++;
        } 
        // may
        else if (Date.day >= Arr[4] + 1 && Date.month == 5) {
            Date.day=Date.day-31;
            Date.month++;
            // june
        } else if (Date.day >= Arr[5] + 1 && Date.month == 6) {
            Date.day=Date.day-30;
            Date.month++;
        } 
        // july
        else if (Date.day >= Arr[6] + 1 && Date.month == 7) {
            Date.day=Date.day-31;
            Date.month++;
        } 
        //August
        else if (Date.day >= Arr[7] + 1 && Date.month == 8) {
            Date.day=Date.day-31;
            Date.month++;
        } 
         // september
        else if (Date.day >= Arr[8] + 1 && Date.month == 9) {
            Date.day=Date.day-30;
            Date.month++;
        } 
       // october
        else if (Date.day >= Arr[9] + 1 && Date.month == 10) {
            Date.day=Date.day-31;
            Date.month++;
        } 
        // November
        else if (Date.day >= Arr[10] + 1 && Date.month == 11) {
            Date.day=Date.day-30;
            Date.month++;
        } 
        // December
        else if (Date.day >= Arr[11] + 1 && Date.month == 12) {
            Date.day=Date.day-31;
            Date.month=1;
            Date.year++;
        }
        // print date
        System.out.println(Date.year + "/" + Date.month + "/" + Date.day);
    }
    // compare method
   public static void compare(Date CurrentDate){
       
        CurrentDate.day=7;
        CurrentDate.month=2;
        CurrentDate.year=2012;
        // diff in years
       int differenceYears= CurrentDate.year-Date.year;
       if(differenceYears<=0){
      differenceYears=differenceYears*(-1);
      differenceYears= differenceYears*365;
       }
       else{
      differenceYears= differenceYears*365;
       }
       // diff in months
       int differencemonths= CurrentDate.month-Date.month;
        if(differencemonths<=0){
      differencemonths=differencemonths*(-1);
      differencemonths= differencemonths*30;
       }
       else{
      differencemonths= differencemonths*30;
       }
        // diff in days
     int Differencedays = Date.day -CurrentDate.day;
       if(Differencedays<=0){
      Differencedays=Differencedays*(-1);
      Differencedays= Differencedays+0;
       }
       else{
      Differencedays= Differencedays+0;
       }
       int totalDiff=Differencedays+differencemonths+differenceYears;
       System.out.println(totalDiff);
   }

    public static void main(String[] args) {
        Date year = new Date(); // date object year
        Date.year = 1992; // year
        Date month = new Date(); // date object month
        Date.month = 2; // month
        Date day = new Date(); // date object day
        Date.day = 28; //day
        Date.print(); // print date
        int numberDys = 10; // number of days to be added
        Date.addDays(numberDys); // call addDays method
        Date CurrentDate = new Date(); 
       Date.compare(CurrentDate);
        

    } // end main
}// end date
