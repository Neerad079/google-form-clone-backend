package com.neerad.googleformclone.repository;

import com.neerad.googleformclone.entity.Form;
// we need to import the entity it will perform CRUD operations on
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<Form, Long> {
    /* Form - is the entity type on which the repository will perform
    database operations on
    Long-the type of the primary key of the Form entity
    */

}
