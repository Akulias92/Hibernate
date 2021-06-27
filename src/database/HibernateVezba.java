package database;

import hibernateEntity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author lukak
 */
public class HibernateVezba {

    public static void main(String[] args) {
        /*Create object SessionFactory and configure(hibernate.cfd.xml).
          Add AnotatedClass or model class which you will use.
          Build SessionFactory.
          Create Session. Current Session.
         */
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session sesija = factory.getCurrentSession();
        try {
            //Create User object
            User korisnik = new User("Luka", "Kurcubic", "Luka92@gmail.com");
            System.out.println("Creating new student...");
            // Start transaction
            sesija.getTransaction().begin();
            // Save the object User
            sesija.save(korisnik);
            System.out.println("Saving User...");

        } finally {
            sesija.close();
        }

    }

}
