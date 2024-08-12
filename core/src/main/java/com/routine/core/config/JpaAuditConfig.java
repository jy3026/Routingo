package com.routine.core.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.routine.core.domain")
@EnableJpaRepositories(basePackages = "com.routine.core.domain")
@EnableJpaAuditing
public class JpaAuditConfig {
}
