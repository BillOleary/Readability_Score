class Car {

    int yearModel;
    String make;
    int speed;

    public Car() {
        this.yearModel = 2020;
        this.make = "Ford";
        this.speed = 0;
    }
    public Car(int yearModel, String make, int speed) {
        this.yearModel = yearModel;
        this.make = make;
        this.speed = speed;
    }

    public void accelerate() {
        this.speed += 5;
    }

    public void brake() {
        this.speed = this.speed - 5 <= 0 ? 0 : this.speed - 5;
    }


}