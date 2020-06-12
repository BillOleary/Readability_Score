class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        // implement me
        if ((minutes = ++minutes % 60 == 0 ? 0 : minutes) == 0) {
            hours = ++hours % 13 == 0 ? 1 : hours;
        }

    }

//    public static void main(String[] args) {
//        Clock clock = new Clock();
//        clock.hours = 12;
//        clock.minutes = 0;
//        clock.next();
//        System.out.println(clock.hours + ":" + clock.minutes);
//    }
}