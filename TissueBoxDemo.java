import java.util.Scanner;

class TissueBox{
    private int TissueCount;
    private final int Capacity;

    //Constructor
    public TissueBox(int initialCount, int capacity)
    {
        this.TissueCount=initialCount;
        Capacity = capacity;
    }
    //Methods for tissue box
    public void dispenseTissue()
    {
        if (TissueCount>0) {
            System.out.println("A Tissue has been dispensed");
            TissueCount--;
        }else {
            System.out.println("Tissue Box is Empty. Please Refill");
        }
    }
    public void refillTissue(int amount)
    {
        if (TissueCount + amount <= Capacity) {
            TissueCount += amount;
            System.out.println("Tissues are Refilled. Current Tissues: " + TissueCount);
        }
        else {
            System.out.println("Cannot refill. The box is at full capacity (" + Capacity + " tissues).");
        }

    }

    public int getTissueCount() {
        return TissueCount;
    }

    public int getCapacity() {
        return Capacity;
    }
}
public class TissueBoxDemo {
    public static void main(String[] args) {
        int boxcapacity =100;
        TissueBox tb = new TissueBox(100,boxcapacity);

        System.out.println("Welcome to the Tissue Box Demo. ");
        System.out.println("Current Tissues in Box: "+tb.getTissueCount());
        System.out.println("Tissue Box capacity: "+tb.getCapacity());
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nOptions");
            System.out.println("1- Dispense Tissue");
            System.out.println("2- Refill Tissue");
            System.out.println("3- Check Tissues");
            System.out.println("4- Exit");


            System.out.println("Select any option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    tb.dispenseTissue();
                    break;
                case 2:
                    System.out.println("Enter Number of Tissues to refill. ");
                    int refill= sc.nextInt();
                    tb.refillTissue(refill);
                    break;
                case 3:
                    System.out.println("Check Current Tissues: "+tb.getTissueCount());
                    break;
                case 4:
                    System.out.println("Sayōnara(GOOD-BYE!)");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again ");



            }
        }
    }
}