public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);
        
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        this.seconds.next();
        if (this.seconds.getValue() == 0) {
            this.minutes.next();
            if (this.minutes.getValue() == 0) {
                this.hours.next();
            }
        }
    }
    
    public String toString() {
        // returns the string representation
        String hrs;
        String mins;
        String secs;
        
        if (this.hours.getValue() < 10) {
            hrs = "0" + this.hours.getValue();
        }
        else { hrs = Integer.toString(this.hours.getValue()); }
        if (this.minutes.getValue() < 10) {
            mins = "0" + this.minutes.getValue();
        }
        else { mins = Integer.toString(this.minutes.getValue()); }
        if (this.seconds.getValue() < 10) {
            secs = "0" + this.seconds.getValue();
        }
        else { secs = Integer.toString(this.seconds.getValue()); }
        
        return hrs + ":" + mins +
                ":" + secs;
    }
}
