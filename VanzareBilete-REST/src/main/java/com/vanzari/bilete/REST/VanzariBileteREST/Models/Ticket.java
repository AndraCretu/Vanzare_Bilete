package com.vanzari.bilete.REST.VanzariBileteREST.Models;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Robert on 5/20/2017.
 */
@Entity
@Table(name = "Bilete")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, name = "`ID`")
    private int ID;

    @Column( name = "`Id_eveniment`",nullable = false)
    private int id_eveniment;

    public int getID() {
        return ID;
    }

    public int getId_eveniment() {
        return id_eveniment;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setId_eveniment(int id_eveniment) {
        this.id_eveniment = id_eveniment;
    }

}
