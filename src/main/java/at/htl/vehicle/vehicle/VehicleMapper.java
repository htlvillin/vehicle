package at.htl.vehicle.vehicle;

import at.htl.vehicle.person.Person;
import at.htl.vehicle.person.PersonDto;

import javax.enterprise.context.ApplicationScoped;
import java.time.format.DateTimeFormatter;

@ApplicationScoped
public class VehicleMapper {
    public VehicleDto fromEntity(Vehicle v) {
        return new VehicleDto(v.getId(), v.getModel(), v.getBrand());
    }
}
