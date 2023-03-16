package at.htl.vehicle.vehicle;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@ApplicationScoped
public class VehicleDao {

    // wenn kein private angegeben wird, wird das Injecten zur Compilezeit erledigt
    @Inject
    EntityManager em;

    public Vehicle findById(long id){
        return em.find( Vehicle.class, id );
    }
    public Vehicle findById1( long id ){
        return em
                .createQuery("select v from Vehicle v where v.id = :ID", Vehicle.class)
                .setParameter("ID", id).getSingleResult();
    }
    public List<Vehicle> findAll( ){

        // Variante 1 mit named Query
        return em
                .createNamedQuery("Vehicle.findAll", Vehicle.class)
                .getResultList();
    }
    /*public List<Vehicle> findAll2( ) {
        TypedQuery<Vehicle> query = em.createQuery("Select v from Vehicle v", Vehicle.class);
        List<Vehicle> vehicles =query.getResultList();
        return vehicles;
    } */

}
