package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Create by bh on 8/4/2020.
 */
public class Vet extends Person {

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
