class Time {
    int hours, minutes;

    Time(int h, int m) {
        this.hours = h;
        this.minutes = m;
        normalize();
    }

    void normalize() {
        hours += minutes / 60;
        minutes = minutes % 60;
    }

    Time add(Time t) {
        return new Time(this.hours + t.hours, this.minutes + t.minutes);
    }

    Time subtract(Time t) {
        int totalMins1 = this.hours * 60 + this.minutes;
        int totalMins2 = t.hours * 60 + t.minutes;
        int diff = Math.abs(totalMins1 - totalMins2);
        return new Time(diff / 60, diff % 60);
    }

    void display() {
        System.out.println(hours + "h " + minutes + "m");
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 75);
        Time t2 = new Time(1, 50);
        Time sum = t1.add(t2);
        Time diff = t1.subtract(t2);

        System.out.print("t1: "); t1.display();
        System.out.print("t2: "); t2.display();
        System.out.print("Sum: "); sum.display();
        System.out.print("Difference: "); diff.display();
    }
}
