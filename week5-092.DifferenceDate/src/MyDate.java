public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public int differenceInYears(MyDate compareDate) {
        int count = 1;
        if (this.earlier(compareDate)) {
            while (true) {
                MyDate testDate = new MyDate(this.day, this.month, this.year + count);
                if (compareDate.earlier(testDate)) {
                    break;
                }
                else {
                    count++;
                }
        }
        }
        else {
           while (true) {
               MyDate testDate = new MyDate(this.day, this.month, this.year - count);
                if (testDate.earlier(compareDate)) {
                    break;
                }
                else {
                    count++;
                }
            } 
        }
        
        return count - 1;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
