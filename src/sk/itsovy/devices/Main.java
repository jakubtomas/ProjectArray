package sk.itsovy.devices;

public class Main {
    public static void main(String[] args) {


        System.out.println("hellou sss");


        Movable m1 = new Notebook("lenovo sj", "intel j 22", 2, 15.6);


        Mobile m2 = new Mobile("helloou", 4);

        System.out.println("Number of device" + Device.getCount());


        Device d1;
        d1 =  (Device) m1;

        Computer c1 = new Desktop("Dell 466" , "CPU super" , 3 , "Big Tower");


    }
}
