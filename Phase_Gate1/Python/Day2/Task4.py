def to_nearest_pump(distance, miles_per_gallon, gallons):
	max_distance = miles_per_gallon * gallons

	if max_distance <= distance:
		return True
	else:
		return False

print(to_nearest_pump(50, 25, 2))


