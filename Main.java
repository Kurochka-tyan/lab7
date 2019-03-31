package lab7;
import java.util.Arrays;
import lab6.*;
public class Main {
    public static void main(String[] args) {
        CarSet carSet = new CarSet();
        ЛегковыеАвтомобили бибипка = new ЛегковыеАвтомобили("Mercury Monterey",48154,452,25);
        System.out.println(carSet.isEmpty());
        System.out.println("___________________");
        carSet.add(бибипка);
        System.out.println(carSet.isEmpty());
        System.out.println("___________________");
        System.out.println(carSet.size());
        System.out.println("___________________");
        System.out.println(carSet.contains(new ЛегковыеАвтомобили("Mercury Monterey",48154,452,25)));
        System.out.println("___________________");
        ЛегковыеАвтомобили бибипка1 = new ЛегковыеАвтомобили("Packard",10000,45,78 );
        carSet.add(бибипка1);
        System.out.println("___________________");
        System.out.println(carSet.size());
        System.out.println("___________________");
        System.out.println(carSet.contains(new ЛегковыеАвтомобили("Buick Roadmaster Limited",47843,152,50)));
        System.out.println("___________________");
        System.out.println(carSet.contains(бибипка1));
        System.out.println("___________________");
        System.out.println (Arrays.toString(carSet.toArray()));
        carSet.add(null);
        System.out.println("___________________");
        System.out.println (Arrays.toString(carSet.toArray()));
    }
}
