package at.htl.vehicle.vehicle;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import java.util.ArrayList;
import java.util.List;

@Path("/vehicles")
public class VehicleResource {

    @Inject
    VehicleMapper vehicleMapper;
    @Inject
    VehicleDao vehicleDao;
    @GET
    @Path("{id}")
    public VehicleDto findById(@PathParam("id") long id) {
        return vehicleMapper.fromEntity(vehicleDao.findById(id));
    }

    @GET
    public List<VehicleDto> find(long id) {

        var vehicles = vehicleDao.findAll();
        return vehicles.stream()
                .map( v -> vehicleMapper
                .fromEntity(v))
                .toList();
       // return vehicleMapper.fromEntity(vehicleDao.findAll());
    }
}
