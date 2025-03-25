public class Time {

    int hours, minutes, seconds;

    Time(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    void displayTime(){
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }

    static Time addTime(Time t1, Time t2){
        int totalSeconds = (t1.hours * 3600 + t1.minutes * 60 + t1.seconds) + (t2.hours * 3600 + t2.minutes * 60 + t2.seconds);
        
        return fromSeconds(totalSeconds);
    }

    static Time subTime(Time t1, Time t2){
        int totalSeconds = (t1.hours * 3600 + t1.minutes * 60 + t1.seconds) - (t2.hours * 3600 + t2.minutes * 60 + t2.seconds);
        
        return fromSeconds(totalSeconds);
    }

    static Time fromSeconds(int totalSeconds){
        int newHours = totalSeconds / 3600;
        int newMinutes = (totalSeconds % 3600) / 60;
        int newSeconds = totalSeconds % 60;
        return new Time(newHours, newMinutes, newSeconds);
    }

    public static void main(String[] args) {
        Time time1 = new Time(12, 45, 30);
        Time time2 = new Time(2, 20, 15);

        System.out.print("Time 1: ");
        time1.displayTime();
        System.out.print("Time 2: ");
        time2.displayTime();

        Time addedTime = Time.addTime(time1, time2);
        System.out.print("Added Time: ");
        addedTime.displayTime();

        Time subtractedTime = Time.subTime(time1, time2);
        System.out.print("Subtracted Time: ");
        subtractedTime.displayTime();
    }
}