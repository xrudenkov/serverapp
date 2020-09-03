package launch;

import back.db.InitialDB;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {

        // initial DB Postgres
        InitialDB.init();

        String webappDirLocation = "src/main/webapp/";
        Tomcat tomcat = new Tomcat();

        tomcat.setPort(8888);

        StandardContext ctx = (StandardContext) tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        // Declare an alternative location for your "WEB-INF/classes" dir
        // Servlet 3.0 annotation will work
        File additionWebInfClasses = new File("target/classes");
        WebResourceRoot resources = new StandardRoot(ctx);
        resources.addPreResources(new DirResourceSet(resources, "/WEB-INF/classes",
                additionWebInfClasses.getAbsolutePath(), "/"));
        ctx.setResources(resources);
//        ctx.setDefaultWebXml(System.getProperty("user.id") + "src/main/webapp/WEB-INF/web.xml");

        tomcat.start();
        tomcat.getServer().await();
    }
}