package org.cer.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

/**
 * Created by celghandour on 20/05/17.
 */

@Entity
public class Entreprise  implements Serializable{
@Id @GeneratedValue
    private Long code ;
    private String nom;
    private String email;
    private String raisonSociale ;
    @OneToMany(mappedBy = "entreprise",fetch = FetchType.LAZY)
    private Collection<Taxe> taxes ;

    public Entreprise() {
        super();
    }

    public Entreprise(String nom, String email, String raisonSociale) {
        this.nom = nom;
        this.email = email;
        this.raisonSociale = raisonSociale;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public void setTaxes(Collection<Taxe> taxes) {
        this.taxes = taxes;
    }

    public Long getCode() {

        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getEmail() {
        return email;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public Collection<Taxe> getTaxes() {
        return taxes;
    }
}
