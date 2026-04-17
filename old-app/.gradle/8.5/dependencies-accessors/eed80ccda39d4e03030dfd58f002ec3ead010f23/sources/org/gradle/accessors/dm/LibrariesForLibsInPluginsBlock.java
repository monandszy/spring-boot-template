package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `libs` extension.
 */
@NonNullApi
public class LibrariesForLibsInPluginsBlock extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final JavaagentLibraryAccessors laccForJavaagentLibraryAccessors = new JavaagentLibraryAccessors(owner);
    private final JmoleculesLibraryAccessors laccForJmoleculesLibraryAccessors = new JmoleculesLibraryAccessors(owner);
    private final JunitLibraryAccessors laccForJunitLibraryAccessors = new JunitLibraryAccessors(owner);
    private final JupiterLibraryAccessors laccForJupiterLibraryAccessors = new JupiterLibraryAccessors(owner);
    private final MapstructLibraryAccessors laccForMapstructLibraryAccessors = new MapstructLibraryAccessors(owner);
    private final ModulithLibraryAccessors laccForModulithLibraryAccessors = new ModulithLibraryAccessors(owner);
    private final OtelLibraryAccessors laccForOtelLibraryAccessors = new OtelLibraryAccessors(owner);
    private final PostgresqlLibraryAccessors laccForPostgresqlLibraryAccessors = new PostgresqlLibraryAccessors(owner);
    private final RabbitmqLibraryAccessors laccForRabbitmqLibraryAccessors = new RabbitmqLibraryAccessors(owner);
    private final SecurityLibraryAccessors laccForSecurityLibraryAccessors = new SecurityLibraryAccessors(owner);
    private final SpringLibraryAccessors laccForSpringLibraryAccessors = new SpringLibraryAccessors(owner);
    private final SprintLibraryAccessors laccForSprintLibraryAccessors = new SprintLibraryAccessors(owner);
    private final ThymelafLibraryAccessors laccForThymelafLibraryAccessors = new ThymelafLibraryAccessors(owner);
    private final ThymeleafLibraryAccessors laccForThymeleafLibraryAccessors = new ThymeleafLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibsInPluginsBlock(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for amqp (org.springframework.boot:spring-boot-starter-amqp)
     * with no version specified
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getAmqp() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("amqp");
    }

        /**
         * Creates a dependency provider for liquidbase (org.liquibase:liquibase-core)
     * with no version specified
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getLiquidbase() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("liquidbase");
    }

        /**
         * Creates a dependency provider for lombok (org.projectlombok:lombok)
     * with versionRef 'lombok'.
         * This dependency was declared in catalog libs.versions.toml
     * @deprecated Will be removed in Gradle 9.0.
         */
    @Deprecated
        public Provider<MinimalExternalModuleDependency> getLombok() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return create("lombok");
    }

    /**
     * Returns the group of libraries at javaagent
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JavaagentLibraryAccessors getJavaagent() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJavaagentLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jmolecules
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JmoleculesLibraryAccessors getJmolecules() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJmoleculesLibraryAccessors;
    }

    /**
     * Returns the group of libraries at junit
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JunitLibraryAccessors getJunit() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJunitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at jupiter
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public JupiterLibraryAccessors getJupiter() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForJupiterLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mapstruct
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public MapstructLibraryAccessors getMapstruct() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForMapstructLibraryAccessors;
    }

    /**
     * Returns the group of libraries at modulith
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ModulithLibraryAccessors getModulith() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForModulithLibraryAccessors;
    }

    /**
     * Returns the group of libraries at otel
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public OtelLibraryAccessors getOtel() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForOtelLibraryAccessors;
    }

    /**
     * Returns the group of libraries at postgresql
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public PostgresqlLibraryAccessors getPostgresql() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForPostgresqlLibraryAccessors;
    }

    /**
     * Returns the group of libraries at rabbitmq
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public RabbitmqLibraryAccessors getRabbitmq() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForRabbitmqLibraryAccessors;
    }

    /**
     * Returns the group of libraries at security
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public SecurityLibraryAccessors getSecurity() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForSecurityLibraryAccessors;
    }

    /**
     * Returns the group of libraries at spring
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public SpringLibraryAccessors getSpring() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForSpringLibraryAccessors;
    }

    /**
     * Returns the group of libraries at sprint
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public SprintLibraryAccessors getSprint() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForSprintLibraryAccessors;
    }

    /**
     * Returns the group of libraries at thymelaf
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ThymelafLibraryAccessors getThymelaf() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForThymelafLibraryAccessors;
    }

    /**
     * Returns the group of libraries at thymeleaf
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public ThymeleafLibraryAccessors getThymeleaf() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return laccForThymeleafLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public BundleAccessors getBundles() {
        org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JavaagentLibraryAccessors extends SubDependencyFactory {

        public JavaagentLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for impl (net.bytebuddy:byte-buddy-agent)
         * with versionRef 'javaagent.impl'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getImpl() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("javaagent.impl");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JmoleculesLibraryAccessors extends SubDependencyFactory {

        public JmoleculesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ddd (org.jmolecules:jmolecules-ddd)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getDdd() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jmolecules.ddd");
        }

            /**
             * Creates a dependency provider for events (org.jmolecules:jmolecules-events)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getEvents() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jmolecules.events");
        }

            /**
             * Creates a dependency provider for jpa (org.jmolecules.integrations:jmolecules-jpa)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJpa() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jmolecules.jpa");
        }

            /**
             * Creates a dependency provider for spring (org.jmolecules.integrations:jmolecules-spring)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jmolecules.spring");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JunitLibraryAccessors extends SubDependencyFactory {

        public JunitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for jupiter (org.junit.jupiter:junit-jupiter)
         * with versionRef 'junit.jupiter'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getJupiter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("junit.jupiter");
        }

            /**
             * Creates a dependency provider for platform (org.junit.platform:junit-platform-launcher)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getPlatform() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("junit.platform");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class JupiterLibraryAccessors extends SubDependencyFactory {

        public JupiterLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for testcontainers (org.testcontainers:junit-jupiter)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("jupiter.testcontainers");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MapstructLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MapstructLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mapstruct (org.mapstruct:mapstruct)
         * with versionRef 'mapstruct'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("mapstruct");
        }

            /**
             * Creates a dependency provider for lombok (org.projectlombok:lombok-mapstruct-binding)
         * with versionRef 'mapstruct.lombok'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getLombok() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("mapstruct.lombok");
        }

            /**
             * Creates a dependency provider for processor (org.mapstruct:mapstruct-processor)
         * with versionRef 'mapstruct'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getProcessor() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("mapstruct.processor");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ModulithLibraryAccessors extends SubDependencyFactory {
        private final ModulithAmqpLibraryAccessors laccForModulithAmqpLibraryAccessors = new ModulithAmqpLibraryAccessors(owner);

        public ModulithLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for events (org.springframework.modulith:spring-modulith-events-api)
         * with versionRef 'spring.modulith'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getEvents() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("modulith.events");
        }

            /**
             * Creates a dependency provider for exporter (org.springframework.modulith:spring-modulith-starter-jdbc)
         * with versionRef 'spring.modulith'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getExporter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("modulith.exporter");
        }

            /**
             * Creates a dependency provider for moments (org.springframework.modulith:spring-modulith-moments)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getMoments() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("modulith.moments");
        }

            /**
             * Creates a dependency provider for observability (org.springframework.modulith:spring-modulith-starter-insight)
         * with versionRef 'spring.modulith'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getObservability() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("modulith.observability");
        }

        /**
         * Returns the group of libraries at modulith.amqp
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ModulithAmqpLibraryAccessors getAmqp() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForModulithAmqpLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ModulithAmqpLibraryAccessors extends SubDependencyFactory {

        public ModulithAmqpLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for events (org.springframework.modulith:spring-modulith-events-amqp)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getEvents() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("modulith.amqp.events");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class OtelLibraryAccessors extends SubDependencyFactory {

        public OtelLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for starter (io.opentelemetry.instrumentation:opentelemetry-spring-boot-starter)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getStarter() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("otel.starter");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class PostgresqlLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public PostgresqlLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for postgresql (org.postgresql:postgresql)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> asProvider() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("postgresql");
        }

            /**
             * Creates a dependency provider for test (org.testcontainers:postgresql)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("postgresql.test");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class RabbitmqLibraryAccessors extends SubDependencyFactory {

        public RabbitmqLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.springframework.amqp:spring-rabbit-test)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("rabbitmq.test");
        }

            /**
             * Creates a dependency provider for testcontainers (org.testcontainers:rabbitmq)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("rabbitmq.testcontainers");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SecurityLibraryAccessors extends SubDependencyFactory {

        public SecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.springframework.security:spring-security-test)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("security.test");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringLibraryAccessors extends SubDependencyFactory {
        private final SpringDevLibraryAccessors laccForSpringDevLibraryAccessors = new SpringDevLibraryAccessors(owner);

        public SpringLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for actuator (org.springframework.boot:spring-boot-starter-actuator)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getActuator() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.actuator");
        }

            /**
             * Creates a dependency provider for data (org.springframework.boot:spring-boot-starter-data-jpa)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getData() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.data");
        }

            /**
             * Creates a dependency provider for modulith (org.springframework.modulith:spring-modulith-starter-core)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getModulith() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.modulith");
        }

            /**
             * Creates a dependency provider for security (org.springframework.boot:spring-boot-starter-security)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSecurity() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.security");
        }

            /**
             * Creates a dependency provider for session (org.springframework.session:spring-session-core)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSession() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.session");
        }

            /**
             * Creates a dependency provider for testcontainers (org.springframework.boot:spring-boot-testcontainers)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTestcontainers() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.testcontainers");
        }

            /**
             * Creates a dependency provider for tymeleaf (org.springframework.boot:spring-boot-starter-thymeleaf)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTymeleaf() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.tymeleaf");
        }

            /**
             * Creates a dependency provider for validation (org.springframework.boot:spring-boot-starter-validation)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getValidation() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.validation");
        }

            /**
             * Creates a dependency provider for web (org.springframework.boot:spring-boot-starter-web)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getWeb() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.web");
        }

        /**
         * Returns the group of libraries at spring.dev
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringDevLibraryAccessors getDev() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSpringDevLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringDevLibraryAccessors extends SubDependencyFactory {

        public SpringDevLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for tools (org.springframework.boot:spring-boot-devtools)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTools() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("spring.dev.tools");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SprintLibraryAccessors extends SubDependencyFactory {
        private final SprintModulithLibraryAccessors laccForSprintModulithLibraryAccessors = new SprintModulithLibraryAccessors(owner);

        public SprintLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.springframework.boot:spring-boot-starter-test)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("sprint.test");
        }

        /**
         * Returns the group of libraries at sprint.modulith
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SprintModulithLibraryAccessors getModulith() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForSprintModulithLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SprintModulithLibraryAccessors extends SubDependencyFactory {

        public SprintModulithLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for test (org.springframework.modulith:spring-modulith-starter-test)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getTest() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("sprint.modulith.test");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ThymelafLibraryAccessors extends SubDependencyFactory {

        public ThymelafLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for layouts (nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect)
         * with versionRef 'thymeleaf.layouts'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getLayouts() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("thymelaf.layouts");
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ThymeleafLibraryAccessors extends SubDependencyFactory {
        private final ThymeleafHtmxLibraryAccessors laccForThymeleafHtmxLibraryAccessors = new ThymeleafHtmxLibraryAccessors(owner);

        public ThymeleafLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for security (org.thymeleaf.extras:thymeleaf-extras-springsecurity6)
         * with no version specified
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getSecurity() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("thymeleaf.security");
        }

        /**
         * Returns the group of libraries at thymeleaf.htmx
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public ThymeleafHtmxLibraryAccessors getHtmx() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return laccForThymeleafHtmxLibraryAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class ThymeleafHtmxLibraryAccessors extends SubDependencyFactory {

        public ThymeleafHtmxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for integration (io.github.wimdeblauwe:htmx-spring-boot-thymeleaf)
         * with versionRef 'thymeleaf.htmx.integration'.
             * This dependency was declared in catalog libs.versions.toml
         * @deprecated Will be removed in Gradle 9.0.
             */
        @Deprecated
            public Provider<MinimalExternalModuleDependency> getIntegration() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return create("thymeleaf.htmx.integration");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final JavaagentVersionAccessors vaccForJavaagentVersionAccessors = new JavaagentVersionAccessors(providers, config);
        private final JunitVersionAccessors vaccForJunitVersionAccessors = new JunitVersionAccessors(providers, config);
        private final MapstructVersionAccessors vaccForMapstructVersionAccessors = new MapstructVersionAccessors(providers, config);
        private final SpringVersionAccessors vaccForSpringVersionAccessors = new SpringVersionAccessors(providers, config);
        private final ThymeleafVersionAccessors vaccForThymeleafVersionAccessors = new ThymeleafVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: lombok (1.18.32)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLombok() { return getVersion("lombok"); }

        /**
         * Returns the group of versions at versions.javaagent
         */
        public JavaagentVersionAccessors getJavaagent() {
            return vaccForJavaagentVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.junit
         */
        public JunitVersionAccessors getJunit() {
            return vaccForJunitVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.mapstruct
         */
        public MapstructVersionAccessors getMapstruct() {
            return vaccForMapstructVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.spring
         */
        public SpringVersionAccessors getSpring() {
            return vaccForSpringVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.thymeleaf
         */
        public ThymeleafVersionAccessors getThymeleaf() {
            return vaccForThymeleafVersionAccessors;
        }

    }

    public static class JavaagentVersionAccessors extends VersionFactory  {

        public JavaagentVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: javaagent.impl (1.14.18)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getImpl() { return getVersion("javaagent.impl"); }

            /**
             * Returns the version associated to this alias: javaagent.plugin (0.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("javaagent.plugin"); }

    }

    public static class JunitVersionAccessors extends VersionFactory  {

        public JunitVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: junit.jupiter (5.10.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getJupiter() { return getVersion("junit.jupiter"); }

    }

    public static class MapstructVersionAccessors extends VersionFactory  implements VersionNotationSupplier {

        public MapstructVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the version associated to this alias: mapstruct (1.6.0.Beta2)
         * If the version is a rich version and that its not expressible as a
         * single version string, then an empty string is returned.
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> asProvider() { return getVersion("mapstruct"); }

            /**
             * Returns the version associated to this alias: mapstruct.lombok (0.2.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLombok() { return getVersion("mapstruct.lombok"); }

    }

    public static class SpringVersionAccessors extends VersionFactory  {

        private final SpringBootVersionAccessors vaccForSpringBootVersionAccessors = new SpringBootVersionAccessors(providers, config);
        private final SpringDependencyVersionAccessors vaccForSpringDependencyVersionAccessors = new SpringDependencyVersionAccessors(providers, config);
        public SpringVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: spring.modulith (1.2.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getModulith() { return getVersion("spring.modulith"); }

        /**
         * Returns the group of versions at versions.spring.boot
         */
        public SpringBootVersionAccessors getBoot() {
            return vaccForSpringBootVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.spring.dependency
         */
        public SpringDependencyVersionAccessors getDependency() {
            return vaccForSpringDependencyVersionAccessors;
        }

    }

    public static class SpringBootVersionAccessors extends VersionFactory  {

        public SpringBootVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: spring.boot.plugin (3.3.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("spring.boot.plugin"); }

    }

    public static class SpringDependencyVersionAccessors extends VersionFactory  {

        public SpringDependencyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: spring.dependency.plugin (1.1.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getPlugin() { return getVersion("spring.dependency.plugin"); }

    }

    public static class ThymeleafVersionAccessors extends VersionFactory  {

        private final ThymeleafHtmxVersionAccessors vaccForThymeleafHtmxVersionAccessors = new ThymeleafHtmxVersionAccessors(providers, config);
        public ThymeleafVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: thymeleaf.layouts (3.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getLayouts() { return getVersion("thymeleaf.layouts"); }

        /**
         * Returns the group of versions at versions.thymeleaf.htmx
         */
        public ThymeleafHtmxVersionAccessors getHtmx() {
            return vaccForThymeleafHtmxVersionAccessors;
        }

    }

    public static class ThymeleafHtmxVersionAccessors extends VersionFactory  {

        public ThymeleafHtmxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: thymeleaf.htmx.integration (3.4.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog libs.versions.toml
             */
            public Provider<String> getIntegration() { return getVersion("thymeleaf.htmx.integration"); }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class BundleAccessors extends BundleFactory {
        private final MapstructBundleAccessors baccForMapstructBundleAccessors = new MapstructBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
        private final SpringBundleAccessors baccForSpringBundleAccessors = new SpringBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for events which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.modulith:spring-modulith-events-api</li>
             *    <li>org.springframework.modulith:spring-modulith-moments</li>
             *    <li>org.springframework.boot:spring-boot-starter-amqp</li>
             *    <li>org.springframework.modulith:spring-modulith-events-amqp</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getEvents() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("events");
            }

            /**
             * Creates a dependency bundle provider for jmolecules which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.jmolecules:jmolecules-ddd</li>
             *    <li>org.jmolecules:jmolecules-events</li>
             *    <li>org.jmolecules.integrations:jmolecules-spring</li>
             *    <li>org.jmolecules.integrations:jmolecules-jpa</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getJmolecules() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("jmolecules");
            }

            /**
             * Creates a dependency bundle provider for microservices which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.session:spring-session-core</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getMicroservices() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("microservices");
            }

            /**
             * Creates a dependency bundle provider for observability which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.boot:spring-boot-starter-actuator</li>
             *    <li>io.opentelemetry.instrumentation:opentelemetry-spring-boot-starter</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getObservability() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("observability");
            }

            /**
             * Creates a dependency bundle provider for testcontainers which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.boot:spring-boot-testcontainers</li>
             *    <li>org.testcontainers:postgresql</li>
             *    <li>org.testcontainers:junit-jupiter</li>
             *    <li>org.testcontainers:rabbitmq</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getTestcontainers() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("testcontainers");
            }

            /**
             * Creates a dependency bundle provider for thymeleaf which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.boot:spring-boot-starter-thymeleaf</li>
             *    <li>io.github.wimdeblauwe:htmx-spring-boot-thymeleaf</li>
             *    <li>org.thymeleaf.extras:thymeleaf-extras-springsecurity6</li>
             *    <li>nz.net.ultraq.thymeleaf:thymeleaf-layout-dialect</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getThymeleaf() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("thymeleaf");
            }

        /**
         * Returns the group of bundles at bundles.mapstruct
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public MapstructBundleAccessors getMapstruct() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForMapstructBundleAccessors;
        }

        /**
         * Returns the group of bundles at bundles.spring
         * @deprecated Will be removed in Gradle 9.0.
         */
        @Deprecated
        public SpringBundleAccessors getSpring() {
            org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
            return baccForSpringBundleAccessors;
        }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class MapstructBundleAccessors extends BundleFactory {

        public MapstructBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for mapstruct.annotation which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.mapstruct:mapstruct-processor</li>
             *    <li>org.projectlombok:lombok-mapstruct-binding</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getAnnotation() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("mapstruct.annotation");
            }

    }

    /**
     * @deprecated Will be removed in Gradle 9.0.
     */
    @Deprecated
    public static class SpringBundleAccessors extends BundleFactory {

        public SpringBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for spring.data which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.modulith:spring-modulith-starter-jdbc</li>
             *    <li>org.springframework.boot:spring-boot-starter-data-jpa</li>
             *    <li>org.liquibase:liquibase-core</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getData() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("spring.data");
            }

            /**
             * Creates a dependency bundle provider for spring.test which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.boot:spring-boot-starter-test</li>
             *    <li>org.springframework.modulith:spring-modulith-starter-test</li>
             *    <li>org.springframework.amqp:spring-rabbit-test</li>
             *    <li>org.springframework.security:spring-security-test</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getTest() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("spring.test");
            }

            /**
             * Creates a dependency bundle provider for spring.web which is an aggregate for the following dependencies:
             * <ul>
             *    <li>org.springframework.boot:spring-boot-starter-web</li>
             *    <li>org.springframework.boot:spring-boot-starter-validation</li>
             *    <li>org.springframework.boot:spring-boot-starter-security</li>
             * </ul>
             * This bundle was declared in catalog libs.versions.toml
             * @deprecated Will be removed in Gradle 9.0.
             */
            @Deprecated
            public Provider<ExternalModuleDependencyBundle> getWeb() {
                org.gradle.internal.deprecation.DeprecationLogger.deprecateBehaviour("Accessing libraries or bundles from version catalogs in the plugins block.").withAdvice("Only use versions or plugins from catalogs in the plugins block.").willBeRemovedInGradle9().withUpgradeGuideSection(8, "kotlin_dsl_deprecated_catalogs_plugins_block").nagUser();
                return createBundle("spring.web");
            }

    }

    public static class PluginAccessors extends PluginFactory {
        private final SpringPluginAccessors paccForSpringPluginAccessors = new SpringPluginAccessors(providers, config);

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for javaagent to the plugin id 'com.ryandens.javaagent-test'
             * with versionRef 'javaagent.plugin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getJavaagent() { return createPlugin("javaagent"); }

        /**
         * Returns the group of plugins at plugins.spring
         */
        public SpringPluginAccessors getSpring() {
            return paccForSpringPluginAccessors;
        }

    }

    public static class SpringPluginAccessors extends PluginFactory {

        public SpringPluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for spring.boot to the plugin id 'org.springframework.boot'
             * with versionRef 'spring.boot.plugin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getBoot() { return createPlugin("spring.boot"); }

            /**
             * Creates a plugin provider for spring.management to the plugin id 'io.spring.dependency-management'
             * with versionRef 'spring.dependency.plugin'.
             * This plugin was declared in catalog libs.versions.toml
             */
            public Provider<PluginDependency> getManagement() { return createPlugin("spring.management"); }

    }

}
