class Vehical{
    //initial registration fee
    private static float registrationFee = 2000f;

    private String ownerName;
    private String vehicalType;
    private final long registrationNumber;

    //create constructor for initilizing data
    Vehical(String ownerName,String vehicalType , long registrationNumber){
        this.ownerName = ownerName;
        this.vehicalType = vehicalType;
        this.registrationNumber = registrationNumber;
    }


    //create updateRegistrationFee method update fees of registration
    public static void updateRegistrationFee(float fee){
        Vehical.registrationFee = fee;
    }

    //create a function for print vehical data
    public void printVehicalDetail(){
        System.out.println("Vehical Owner name is : " + ownerName);
        System.out.println("Vehical type : " + vehicalType);
        System.out.println("Vehical registration number : " + registrationNumber);
        System.out.println("Vehical registration fee : " + Vehical.registrationFee);
    }
}

public class VehicalRegistrationSystem {
    public static void main(String[] args) {

        //create vehical class object and initilize constructor
        Vehical vehical1 = new Vehical("Puspendra Jaiswal" , "Car" , 54721854);
        if(vehical1 instanceof Vehical){
            vehical1.printVehicalDetail();
        }else{
            System.out.println("vehical1 is not instance of Vehical class");
        }

        System.out.println();
        //call method by class name for update registration fee
        Vehical.updateRegistrationFee(2500f);
        Vehical vehical2 = new Vehical("Sonu Jaiswal" , "Bike" , 54725784);
        if(vehical2 instanceof Vehical){
            vehical2.printVehicalDetail();
        }else{
            System.out.println("vehical2 is not instance of Vehical class");
        }

    }
}