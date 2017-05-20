package org.cer.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by celghandour on 20/05/17.
 */
@Entity
@DiscriminatorValue("TVA")
public class TVA extends Taxe {
    public TVA() {
    }

    public TVA(String titre, Date dateTaxe, double montant, Entreprise entreprise) {
        super(titre, dateTaxe, montant, entreprise);
    }
}
