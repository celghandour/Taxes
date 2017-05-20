package org.cer.dao;

import org.cer.entities.Entreprise;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by celghandour on 20/05/17.
 */
public interface EntrepriseRepository  extends JpaRepository<Entreprise,Long>{

}