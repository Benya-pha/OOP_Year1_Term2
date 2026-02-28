package Clock;

public class Clock {
    int hour;
    int minute;

    public Clock(int hour , int minute){
        if (hour < 0 || hour >= 24 ){
            this.hour = 0;
        }else {
            this.hour = hour;
        }
        if (minute >= 60 || minute < 0){
            this.minute = 0;
        }else {
            this.minute = minute;
        }
    }

    public void setTime(int hour , int minute){
        if (hour < 0 || hour >= 24 ){
            this.hour = 0;
        }else {
            this.hour = hour;
        }
        if (minute >= 60 || minute < 0){
            this.minute = 0;
        }else {
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void increaseMinute(){
        minute += 1;
        if (minute >= 60){
            minute = 0;
            increaseHour();
        }
    }

    public void increaseHour(){
        hour +=1 ;
        if (hour >= 24){
            hour = 0;
        }
    }

    public String toString() {
        if (hour < 10 && minute < 10){
            return "0"+hour + ":" + "0"+ minute ;
        }else if(hour < 10 && minute > 10){
            return "0"+hour + ":" + minute ;
        }else if(hour > 10 && minute < 10){
            return hour + ":" + "0"+ minute ;
        }else {
            return hour + ":" + minute;
        }
    }
}
