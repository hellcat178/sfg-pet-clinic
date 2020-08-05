package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * Create by bh on 8/5/2020.
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
