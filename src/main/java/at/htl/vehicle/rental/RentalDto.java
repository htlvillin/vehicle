package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.VehicleDto;

public record RentalDto(Long id, VehicleDto vehicle, long personId, long startDateTime, long endDateTime, double discount) {
}
