package org.acme;

import io.quarkus.hibernate.orm.PersistenceUnit;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
@PersistenceUnit("one")
public class Book extends PanacheEntity {
    String name;
}
