package com.doranco.jpa.models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column
    private TYPE_STOCK typeStock;
    @Column
    private String name;
    @Column
    private long quantite;
    @Column
    @Temporal(TemporalType.DATE)
    private Date datearrivee;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dlc;
    @Column
    @Temporal(TemporalType.DATE)
    private Date datesortie;

    public Date getDatesortie() {
        return datesortie;
    }

    public void setDatesortie(Date datesortie) {
        this.datesortie = datesortie;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TYPE_STOCK getTypeStock() {
        return typeStock;
    }

    public void setTypeStock(TYPE_STOCK typeStock) {
        this.typeStock = typeStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantite() {
        return quantite;
    }

    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }

    public Date getDatearrivee() {
        return datearrivee;
    }

    public void setDatearrivee(Date datearrivee) {
        this.datearrivee = datearrivee;
    }

    public Date getDlc() {
        return dlc;
    }

    public void setDlc(Date dlc) {
        this.dlc = dlc;
    }

}
