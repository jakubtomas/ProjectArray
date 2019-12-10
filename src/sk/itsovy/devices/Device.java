package sk.itsovy.devices;

abstract class Device {
    private String name;

    public  static  int count;

    public Device(String name) {
        this.name = name;
        count++;

    }

    public String getName() {
        return name;
    }



    public static int getCount() {
        return count;
    }



}
