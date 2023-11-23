
package Entities;

/**
 *
 * @author patri
 */
public class Enfermeiro {
    private String nome;
    private String coren;

    public Enfermeiro(String nome, String coren) {
        this.nome = nome;
        this.coren = coren;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }
}
