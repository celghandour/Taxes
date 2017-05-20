package org.cer.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by celghandour on 20/05/17.
 */
@Entity
@Inheritance(strategy =InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn(name="TYPE",discriminatorType = DiscriminatorType.STRING,length = 3)
public abstract class Taxe implements Serializable {
@Id @GeneratedValue
    private Long id ;
    private String  titre ;
    private Date dateTaxe ;
    private double montant ;
    @ManyToOne
    @JoinColumn(name="Code_ENT")
    private Entreprise entreprise;

    public Taxe() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDateTaxe() {
        return dateTaxe;
    }

    public void setDateTaxe(Date dateTaxe) {
        this.dateTaxe = dateTaxe;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public Taxe(String titre, Date dateTaxe, double montant, Entreprise entreprise) {

        this.titre = titre;
        this.dateTaxe = dateTaxe;
        this.montant = montant;
        this.entreprise = entreprise;
    }
}
