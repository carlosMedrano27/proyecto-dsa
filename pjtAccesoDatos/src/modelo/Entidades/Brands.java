package modelo.Entidades;
// Generated May 14, 2019 9:15:56 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Brands generated by hbm2java
 */
@Entity
@Table(name="brands"
    ,catalog="proyecto"
)
public class Brands  implements java.io.Serializable {


     private Integer id;
     private String brandName;
     private String status;
     private Set<Model> models = new HashSet<Model>(0);

    public Brands() {
    }

	
    public Brands(String brandName) {
        this.brandName = brandName;
    }
    public Brands(String brandName, String status, Set<Model> models) {
       this.brandName = brandName;
       this.status = status;
       this.models = models;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="brand_name", nullable=false, length=45)
    public String getBrandName() {
        return this.brandName;
    }
    
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    
    @Column(name="status", length=45)
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="brands")
    public Set<Model> getModels() {
        return this.models;
    }
    
    public void setModels(Set<Model> models) {
        this.models = models;
    }




}


