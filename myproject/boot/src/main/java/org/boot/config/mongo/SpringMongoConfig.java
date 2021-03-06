package org.boot.config.mongo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
public class SpringMongoConfig {
    
    public @Bean MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new Mongo(), "database");
      }
    
}

//http://www.mkyong.com/mongodb/spring-data-mongodb-hello-world-example/
//http://stackoverflow.com/questions/23515295/spring-boot-and-how-to-configure-connection-details-to-mongodb


//@Configuration
//public class SpringMongoConfig extends AbstractMongoConfiguration {
//
//    @Override
//    public String getDatabaseName() {
//        return "freshDB";
//    }
//
//    @Override
//    @Bean
//    public Mongo mongo() throws Exception {
//        return new MongoClient("127.0.0.1");
//    }
//}
