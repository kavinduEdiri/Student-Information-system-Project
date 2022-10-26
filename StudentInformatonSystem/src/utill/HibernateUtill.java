package utill;

import com.mysql.cj.Session;
import entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtill {
    private static SessionFactory sessionFactory=null;
    private SessionFactory HibernateUtill(){
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                .configure("./hibernate.cfg.xml")
                .build();




        Metadata metadata = new MetadataSources(standardRegistry)
                .addAnnotatedClass(Student.class)

                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();



        return  metadata.getSessionFactoryBuilder()

                .build();

    }


    public static Session getSession(){
        return (Session) sessionFactory.openSession();
    }







}
