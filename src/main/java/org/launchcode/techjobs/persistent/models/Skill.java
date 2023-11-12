package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {
    public Skill() {
    }

    @Size(min=3, max=500)
    private String description;
}
