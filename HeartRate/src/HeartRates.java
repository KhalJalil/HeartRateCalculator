public class HeartRates

{
    public final int todaysDate = 2021;
    int todaysMonth = 2;
    private String firstName,lastName;
    private int day,year, month ;
    private int age, maxHeartRate;

    //max heart rate per minute
    // 220 -age years
    //50 -85 % of Max is the range
    public HeartRates(String firstName,String lastName, int month, int day, int year){
        this.firstName =firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;

    }
    public int calculateAge(){

        // int  todayDate = 2021;
        int  todaysMonth = 2;
        int todaysDay = 24;

        this.age = todaysDate - getYear();
        return age;
    }

    public int maxHeartRate(){
        this.maxHeartRate = 220- age;
        return maxHeartRate;
    }

    public String getTargetRange(){
        double lowerLimit = 0.50 * maxHeartRate;
        double upperLimit = (0.85 * maxHeartRate);

        String range = (lowerLimit)+" - "+(upperLimit);
        return range;
    }
    //First Name
    public void setFirstName(String firstName1){
        this.firstName = firstName1;
    }
    public String getFirstName(){
        return firstName;
    }

    //Second Name
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }

    //Month
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth(){
        return month;
    }

    //day
    public void setDay(int day){
        this.day = day;
    }
    public int getDay(){return day;}

    //year
    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){return year;}
}

