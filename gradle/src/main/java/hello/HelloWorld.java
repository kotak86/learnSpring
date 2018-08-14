package hello;

import org.joda.time.LocalTime;

public class HelloWorld {
  public static void main(String[] args) {
    LocalTime curTime = new LocalTime();
    System.out.println("Current Local Time " + curTime); 
    Greeter greeter = new Greeter();
    System.out.println(greeter.sayHello());
    RestCallExample rce = new RestCallExample();
    rce.getStockPrice();
  }
}
