package net.toregard.jerseydemo.config;

import net.toregard.jerseydemo.restresources.AdminResource;
import net.toregard.jerseydemo.restresources.PingResource;
import net.toregard.jerseydemo.restresources.PropertiesResource;
import net.toregard.jerseydemo.restresources.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {


    public JerseyConfig() {
        register(UserResource.class);
        register(AdminResource.class);
        register(PingResource.class);
        register(PropertiesResource.class);
    }
}
