package main.java.com.stackroute.hackathon;

public class Driver{
    public String checkDriverAvailability()
    {
        if()
    }

}
public class Cab extends Driver {
    public String checkAvaialbility()
    {
        if()
    }
    public boolean bookCab()
    {

    }

}

public class User extends Cab{
    public static void main(String[] args)
    {
       Cab cab=new Cab();
     String availability= cab.checkAvaialbility();
       if(availability=="yes")
       {
           cab.bookCab();
       }

    }

}
