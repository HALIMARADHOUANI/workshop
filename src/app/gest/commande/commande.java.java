/*bonjour
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.gest.commande;

/**
 *
 * @author asus
 */
public class commande {
 
    private int id;
    private String désignation;
    private float prix;
    private int Qtéstocké;
    private String catégorie;

    public commande(int id, String désignation, float prix, int Qtéstocké, String catégorie) {
        this.id = id;
        this.désignation = désignation;
        this.prix = prix;
        this.Qtéstocké = Qtéstocké;
        this.catégorie = catégorie;
    }

    public int getId() {
        return id;
    }

    public String getDésignation() {
        return désignation;
    }

    public float getPrix() {
        return prix;
    }

    public int getQtéstocké() {
        return Qtéstocké;
    }

    public String getCatégorie() {
        return catégorie;
    }
    
    
}
