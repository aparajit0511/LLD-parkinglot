package carparkingsystem;

public class Slot {
    private int slotNumber;
    private boolean isOccupied;
    private Vehicle vehicle;

    public Slot(int slotNumber){
        this.slotNumber = slotNumber;
        this.isOccupied = false;
    }

    public boolean isAvailable(){
        return !this.isOccupied;
    }

    public void park(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void vacate(){
        this.isOccupied = false;
    }

    public int getSlotNumber(){
        return slotNumber;
    }
}
