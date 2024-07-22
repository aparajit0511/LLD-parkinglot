package carparkingsystem;

public class Vehicle {
    String liscenceNumber;
    String vehicleModel;

    public Vehicle(String liscenceNumber, String vehicleModel) {
        this.liscenceNumber = liscenceNumber;
        this.vehicleModel = vehicleModel;
    }

    public Vehicle(){

    }

    public String getLiscenceNumber() {
        return liscenceNumber;
    }

    public void setLiscenceNumber(String liscenceNumber) {
        this.liscenceNumber = liscenceNumber;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "liscenceNumber='" + liscenceNumber + '\'' +
                ", vehicleModel='" + vehicleModel + '\'' +
                '}';
    }
}
