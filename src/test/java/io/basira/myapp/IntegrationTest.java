package io.basira.myapp;

import io.basira.myapp.config.AsyncSyncConfiguration;
import io.basira.myapp.config.EmbeddedElasticsearch;
import io.basira.myapp.config.EmbeddedKafka;
import io.basira.myapp.config.EmbeddedSQL;
import io.basira.myapp.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { BasiraApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}
