/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anidaciones;

/**
 *
 * @author zabdy
 */
public class caja {
private int id_caja;
private String desc_caja;
private String disponible;
private boolean serie;
private int id_user;
private String folio_actual;

    /**
     * @return the id_caja
     */
    public int getId_caja() {
        return id_caja;
    }

    /**
     * @param id_caja the id_caja to set
     */
    public void setId_caja(int id_caja) {
        this.id_caja = id_caja;
    }

    /**
     * @return the desc_caja
     */
    public String getDesc_caja() {
        return desc_caja;
    }

    /**
     * @param desc_caja the desc_caja to set
     */
    public void setDesc_caja(String desc_caja) {
        this.desc_caja = desc_caja;
    }

    /**
     * @return the disponible
     */
    public String getDisponible() {
        return disponible;
    }

    /**
     * @param disponible the disponible to set
     */
    public void setDisponible(String disponible) {
        this.disponible = disponible;
    }

    /**
     * @return the serie
     */
    public boolean isSerie() {
        return serie;
    }

    /**
     * @param serie the serie to set
     */
    public void setSerie(boolean serie) {
        this.serie = serie;
    }

    /**
     * @return the id_user
     */
    public int getId_user() {
        return id_user;
    }

    /**
     * @param id_user the id_user to set
     */
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    /**
     * @return the folio_actual
     */
    public String getFolio_actual() {
        return folio_actual;
    }

    /**
     * @param folio_actual the folio_actual to set
     */
    public void setFolio_actual(String folio_actual) {
        this.folio_actual = folio_actual;
    }

}
