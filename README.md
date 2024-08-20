ParkingLot
----------
- slots: List<Slot>
- maxSlots: int
-----------------
+ parkVehicle(vehicle: Vehicle): boolean
+ leaveVehicle(slotNumber: int): boolean
+ getAvailableSlots(): List<Slot>

Slot
----
- slotNumber: int
- isOccupied: boolean
- vehicle: Vehicle
-------------------
+ park(vehicle: Vehicle): void
+ vacate(): void
+ isAvailable(): boolean

Vehicle
-------
- licensePlate: String
-----------------------
+ getLicensePlate(): String

Car extends Vehicle
-------------------
+ getLicensePlate(): String

Bike extends Vehicle
-------------------
+ getLicensePlate(): String
