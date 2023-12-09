//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Vehicle{
              //defining a method
    public void run() {
        System.out.println("Vehicle is moving");
    }
}
               //Creating a child class
class Car2 extends Vehicle{
              //defining the same method as in the parent class
    public void run(){
        System.out.println("car is running safely");
    }

    public static void main(String args[]){
        Vehicle v = new Vehicle();
        Car2 obj = new Car2();//creating object
        obj.run();//calling method
        v.run();;
    }
}