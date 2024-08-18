package carparkingsystem;

abstract class Vehicle {
    private String licensePlate;

    public Vehicle(String licensePlate){
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate(){
        return this.licensePlate;
    }

}
