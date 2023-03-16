package at.htl.vehicle.vehicle;

import javax.persistence.*;

@Entity
@Table (name = "X_VEHICLE")
//@NamedQueries({
@NamedQuery(
        name="Vehicle.findAll",
         query= "select v from Vehicle v"
        )
//}//
public class Vehicle {
    @Id@GeneratedValue(strategy= GenerationType.SEQUENCE)
    @Column( name = "V_ID")
    private Long id;
    @Column(name="V_MODEL", nullable=false )
    private String brand;
    @Column(name="V_BRAND", nullable=false)
    private String model;

    public Vehicle() {
    }

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    //region getter and setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //endregion
}