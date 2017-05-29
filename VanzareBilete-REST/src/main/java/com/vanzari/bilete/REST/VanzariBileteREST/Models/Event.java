package com.vanzari.bilete.REST.VanzariBileteREST.Models;

import javax.persistence.*;

/**
 * Created by Robert on 5/20/2017.
 */
@Entity
@Table(name = "`Evenimente`")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, name= "`ID`")
    private int id;

    @Column( name = "`nume`")
    private String nume;

    @Column( name = "`data`")
    private String data;

    @Column( name = "`locatie`")
    private String locatie;

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public String getLocatie() {
        return locatie;
    }

    public String getNume() {
        return nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
