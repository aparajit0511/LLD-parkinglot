package carparkingsystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Slot> slots;
    private int maxSlots;

//    List<Slot> availableSlots = new ArrayList<>();

    public ParkingLot(int maxSlots){
        this.maxSlots = maxSlots;
        this.slots = new ArrayList<>(maxSlots);
        System.out.println("Slots "+slots.size());
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

    public boolean leaveVehicle(int slotNumber){
        if(slotNumber > 0 && slotNumber <= maxSlots){
            Slot slot = slots.get(slotNumber-1);
            if(!slot.isAvailable()){
                slot.vacate();
                return true;
            }
        }
        return false;
    }

    public List<Slot> getAvailableSlots(){
        List<Slot> availableSlots = new ArrayList<>();

        for(Slot slot:slots){
            if(slot.isAvailable()){
                availableSlots.add(slot);
            }
        }
        System.out.println("Check size now "+ slots.size());
        return availableSlots;
    }

}
