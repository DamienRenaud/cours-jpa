package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Damien on 12/10/2016.
 */
@Entity
@Table(name = "COUNTRY")
public class Country {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
