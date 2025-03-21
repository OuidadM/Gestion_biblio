import org.apache.catalina.startup.Tomcat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        // Initialisation de Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8088); // Définit le port d'écoute

        // Répertoire temporaire pour Tomcat
        String webappDirLocation = "src/main/webapp/";
        tomcat.addWebapp("", new File(webappDirLocation).getAbsolutePath());

        System.out.println("Démarrage de Tomcat sur http://localhost:8088/");

        // Démarrage de Tomcat
        tomcat.start();
        tomcat.getServer().await();
    }
}
