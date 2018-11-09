import java.rmi.Naming;

public class GumballMachineTestDrive {

    public static void main(String[] args) {

        String [] location = {"rmi ://santafe.mightygumball .сот/gumballmachine" ,
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://Seattle.mightygumball.com/gumballmachine"};
        GumballMonitor [] monitor = new GumballMonitor[location .length];

        for (int i = 0;i < location.length; i++) {

            try{
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine) ;
                System.out.println(monitor[i]);
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
        for (int i = 0; i < monitor. length; i++) {
            monitor [i] .report();
        }

    }

}
