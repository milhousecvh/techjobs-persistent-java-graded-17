package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.launchcode.techjobs.persistent.models.data.EmployerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Employer extends AbstractEntity {

    @ManyToOne
    @NotNull
    @Size(max = 50)
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<>();


//    @OneToOne(cascade = CascadeType.ALL)
//    @Valid
//    @NotNull
//    private EmployerDetails employerDetails;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public Employer() {
    }
}
