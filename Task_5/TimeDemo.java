class Time {
    private int hours;
    private int minutes;


    public Time(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        normalize();
    }


    private void normalize() {
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        } else if (minutes < 0) {
            int borrow = (Math.abs(minutes) + 59) / 60;
            hours -= borrow;
            minutes += borrow * 60;
        }
        if (hours < 0) hours = 0;
    }


    public Time add(Time other) {
        return new Time(this.hours + other.hours, this.minutes + other.minutes);
    }


    public Time subtract(Time other) {
        return new Time(this.hours - other.hours, this.minutes - other.minutes);
    }


    public String toString() {
        return hours + "h " + minutes + "m";
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time(2, 75);
        Time t2 = new Time(1, 50);

        Time sum = t1.add(t2);
        Time diff = t1.subtract(t2);

        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + diff);
    }
}
