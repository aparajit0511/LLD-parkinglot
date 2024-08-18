package carparkingsystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Slot> slots;
    private int maxSlots;

    public ParkingLot(int maxSlots){
        this.maxSlots = maxSlots;
        this.slots = new ArrayList<>(maxSlots);
       for (int i=1;i<=maxSlots;i++){
           this.slots.add(new Slot(i));
       }
    }

    public boolean parkVehicle(Vehicle vehicle){
        for(Slot slot : slots){
            if(slot.isAvailable()){
                slot.park(vehicle);
                return true;
            }
        }
        return false;
    }

}
