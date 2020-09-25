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

        Object o1 = new Notebook("Aceer 456 ", "tesla", 6, 4.5);

        Device[] arr = new Device[5];

        arr[0] = (Device)m1;
        arr[1] = m2;
        arr[4] = new Mobile("samsung" , 4.5);


        for (Device dev : arr) {
            if (dev instanceof Mobile) {
                System.out.println();
            }
        }





/*
rozhrania vedia spajat triedy co maju nieco spolocne
instanceof zistuje type objekt */


        Computer c2 = new Computer("appple", "Intel i 9", 32);

        /*

         viem pretypovat

         premmen typu computr


         pretypovanie*/


    }
}
