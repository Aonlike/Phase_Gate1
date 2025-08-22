#1. Create a parking space that will accept 20 cars
#2. store each of the cars entered
#3. The slot should be occupied or it should be empty
#4. A car can leave a slot
#5. Display an entry message if a car enters a slot
#6. Display an exit message if a car leaves a slot


parking_slots = [0,0,0,1,1,1,1,0,1,0,1,0,1,1,1,1,0,0,1,1]

def enter_park():
    for slot in range(len(parking_lot)):
        if parking_slots[slot] == 0:
            parking_slots[slot] = 1
            print("car can enter slot")
        else:
            return
    print("No parking space!")


def leave_park():
index = slot_number - 1
    if 0 <= index < len(parking_lot):
        if parking_lot[index] == 1:
            parking_lot[index] = 0
            print("car left")
        else:
            print("Slot { is already empty.")



  










def leave_car(slot_number):
    

# Example usage:
enter_car()
enter_car()
leave_car(1)
enter_car()