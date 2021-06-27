
package hibernateEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author lukak
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    @Column(name="id")
    private int id;
    
    private String ime,prezime,email;

    public User() {
    }

    public User(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", ime=" + ime + ", prezime=" + prezime + ", email=" + email + '}';
    }
    
    
    
    

    
    
    
}
