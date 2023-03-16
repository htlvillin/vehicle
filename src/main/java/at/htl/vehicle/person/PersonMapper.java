package at.htl.vehicle.person;

import javax.enterprise.context.ApplicationScoped;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

@ApplicationScoped
public class PersonMapper{

		public PersonDto fromEntity( Person p){
			return new PersonDto( p.getId(), p.getName(), p.getDob().format(DateTimeFormatter.ISO_LOCAL_DATE));
	}
	
}