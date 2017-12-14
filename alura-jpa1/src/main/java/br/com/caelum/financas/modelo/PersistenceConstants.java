package br.com.caelum.financas.modelo;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersistenceConstants {
	public static final String TRANSACTION_TYPE = "javax.persistence.transactionType";
	public static final String JTA_DATASOURCE = "javax.persistence.jtaDataSource";
	public static final String NON_JTA_DATASOURCE = "javax.persistence.nonJtaDataSource";
	public static final String JDBC_DRIVER = "javax.persistence.jdbc.driver";
	public static final String JDBC_URL = "javax.persistence.jdbc.url";
	public static final String JDBC_USER = "javax.persistence.jdbc.user";
	public static final String JDBC_PASSWORD = "javax.persistence.jdbc.password";
	public static final String NATIVE_SQL = "eclipselink.jdbc.native-sql";
	public static final String SQL_CAST = "eclipselink.jdbc.sql-cast";
	public static final String JPQL_PARSER = "eclipselink.jpql.parser";
	public static final String JPQL_VALIDATION = "eclipselink.jpql.validation";
	public static final String CONNECTION_POOL_WAIT = "wait";
	public static final String CONNECTION_POOL_MAX = "max";
	public static final String CONNECTION_POOL_MIN = "min";
	public static final String CONNECTION_POOL_INITIAL = "initial";
	public static final String CONNECTION_POOL_SHARED = "shared";
	public static final String CONNECTION_POOL_URL = "url";
	public static final String CONNECTION_POOL_JTA_DATA_SOURCE = "jtaDataSource";
	public static final String CONNECTION_POOL_NON_JTA_DATA_SOURCE = "nonJtaDataSource";
	public static final String CONNECTION_POOL_USER = "user";
	public static final String CONNECTION_POOL_PASSWORD = "password";
	public static final String CONNECTION_POOL_FAILOVER = "failover";
	public static final String CONNECTION_POOL = "eclipselink.connection-pool.";
	public static final String CONNECTION_POOL_READ = "eclipselink.connection-pool.read.";
	public static final String CONNECTION_POOL_SEQUENCE = "eclipselink.connection-pool.sequence.";
	public static final String CONNECTION_POOL_INTERNALLY_POOL_DATASOURCE = "eclipselink.connection-pool.force-internal-pool";

	@Deprecated
	public static final String JDBC_CONNECTIONS_WAIT = "eclipselink.jdbc.connections.wait-timeout";

	@Deprecated
	public static final String JDBC_CONNECTIONS_MAX = "eclipselink.jdbc.connections.max";

	@Deprecated
	public static final String JDBC_CONNECTIONS_MIN = "eclipselink.jdbc.connections.min";

	@Deprecated
	public static final String JDBC_CONNECTIONS_INITIAL = "eclipselink.jdbc.connections.initial";

	@Deprecated
	public static final String JDBC_WRITE_CONNECTIONS_MAX = "eclipselink.jdbc.write-connections.max";

	@Deprecated
	public static final String JDBC_WRITE_CONNECTIONS_MIN = "eclipselink.jdbc.write-connections.min";

	@Deprecated
	public static final String JDBC_WRITE_CONNECTIONS_INITIAL = "eclipselink.jdbc.write-connections.initial";

	@Deprecated
	public static final String JDBC_READ_CONNECTIONS_MAX = "eclipselink.jdbc.read-connections.max";

	@Deprecated
	public static final String JDBC_READ_CONNECTIONS_MIN = "eclipselink.jdbc.read-connections.min";

	@Deprecated
	public static final String JDBC_READ_CONNECTIONS_INITIAL = "eclipselink.jdbc.read-connections.initial";

	@Deprecated
	public static final String JDBC_READ_CONNECTIONS_SHARED = "eclipselink.jdbc.read-connections.shared";

	@Deprecated
	public static final String JDBC_SEQUENCE_CONNECTION_POOL_MAX = "eclipselink.jdbc.sequence-connection-pool.max";

	@Deprecated
	public static final String JDBC_SEQUENCE_CONNECTION_POOL_MIN = "eclipselink.jdbc.sequence-connection-pool.min";

	@Deprecated
	public static final String JDBC_SEQUENCE_CONNECTION_POOL_INITIAL = "eclipselink.jdbc.sequence-connection-pool.initial";

	@Deprecated
	public static final String JDBC_SEQUENCE_CONNECTION_POOL = "eclipselink.jdbc.sequence-connection-pool";

	@Deprecated
	public static final String JDBC_SEQUENCE_CONNECTION_POOL_DATASOURCE = "eclipselink.jdbc.sequence-connection-pool.non-jta-data-source";
	public static final String PARTITIONING = "eclipselink.partitioning";
	public static final String PARTITIONING_CALLBACK = "eclipselink.partitioning.callback";
	public static final String JDBC_BIND_PARAMETERS = "eclipselink.jdbc.bind-parameters";
	public static final String EXCLUSIVE_CONNECTION_MODE = "eclipselink.jdbc.exclusive-connection.mode";
	public static final String EXCLUSIVE_CONNECTION_IS_LAZY = "eclipselink.jdbc.exclusive-connection.is-lazy";
	public static final String CACHE_STATEMENTS_SIZE = "eclipselink.jdbc.cache-statements.size";
	public static final String CACHE_STATEMENTS = "eclipselink.jdbc.cache-statements";
	public static final String VALIDATOR_FACTORY = "javax.persistence.validation.factory";
	public static final String VALIDATION_MODE = "javax.persistence.validation.mode";
	public static final String VALIDATION_GROUP_PRE_PERSIST = "javax.persistence.validation.group.pre-persist";
	public static final String VALIDATION_GROUP_PRE_UPDATE = "javax.persistence.validation.group.pre-update";
	public static final String VALIDATION_GROUP_PRE_REMOVE = "javax.persistence.validation.group.pre-remove";
	public static final String DEFAULT = "default";
	public static final String CACHE_SIZE_ = "eclipselink.cache.size.";
	public static final String CACHE_TYPE_ = "eclipselink.cache.type.";
	public static final String CACHE_SHARED_ = "eclipselink.cache.shared.";
	public static final String CACHE_SIZE_DEFAULT = "eclipselink.cache.size.default";
	public static final String CACHE_TYPE_DEFAULT = "eclipselink.cache.type.default";
	public static final String CANONICAL_MODEL_PREFIX = "eclipselink.canonicalmodel.prefix";
	public static String CANONICAL_MODEL_PREFIX_DEFAULT = "";
	public static final String CANONICAL_MODEL_SUFFIX = "eclipselink.canonicalmodel.suffix";
	public static String CANONICAL_MODEL_SUFFIX_DEFAULT = "_";
	public static final String CANONICAL_MODEL_SUB_PACKAGE = "eclipselink.canonicalmodel.subpackage";
	public static String CANONICAL_MODEL_SUB_PACKAGE_DEFAULT = "";
	public static final String CANONICAL_MODEL_LOAD_XML = "eclipselink.canonicalmodel.load_xml";
	public static final String CANONICAL_MODEL_LOAD_XML_DEFAULT = "true";
	public static final String CANONICAL_MODEL_USE_STATIC_FACTORY = "eclipselink.canonicalmodel.use_static_factory";
	public static final String CANONICAL_MODEL_USE_STATIC_FACTORY_DEFAULT = "true";
	public static final String CACHE_SHARED_DEFAULT = "eclipselink.cache.shared.default";
	public static final String QUERY_CACHE = "eclipselink.cache.query-results";
	public static final String DATABASE_EVENT_LISTENER = "eclipselink.cache.database-event-listener";
	public static final String LOGGING_LOGGER = "eclipselink.logging.logger";
	public static final String LOGGING_LEVEL = "eclipselink.logging.level";
	public static final String CATEGORY_LOGGING_LEVEL_ = "eclipselink.logging.level.";
	public static final String LOGGING_PARAMETERS = "eclipselink.logging.parameters";
	public static final String LOGGING_TIMESTAMP = "eclipselink.logging.timestamp";
	public static final String MULTITENANT_PROPERTY_DEFAULT = "eclipselink.tenant-id";
	public static final String MULTITENANT_SHARED_CACHE = "eclipselink.multitenant.tenants-share-cache";
	public static final String MULTITENANT_SHARED_EMF = "eclipselink.multitenant.tenants-share-emf";
	public static final String LOGGING_THREAD = "eclipselink.logging.thread";
	public static final String LOGGING_SESSION = "eclipselink.logging.session";
	public static final String LOGGING_CONNECTION = "eclipselink.logging.connection";
	public static final String LOGGING_EXCEPTIONS = "eclipselink.logging.exceptions";
	public static final String LOGGING_FILE = "eclipselink.logging.file";
	public static final String TABLE_CREATION_SUFFIX = "eclipselink.ddl-generation.table-creation-suffix";
	public static final String TARGET_DATABASE = "eclipselink.target-database";
	public static final String EXCLUDE_ECLIPSELINK_ORM_FILE = "eclipselink.exclude-eclipselink-orm";
	public static final String SESSION_NAME = "eclipselink.session-name";
	public static final String WEAVING = "eclipselink.weaving";
	public static final String WEAVING_INTERNAL = "eclipselink.weaving.internal";
	public static final String WEAVING_LAZY = "eclipselink.weaving.lazy";
	public static final String WEAVING_EAGER = "eclipselink.weaving.eager";
	public static final String WEAVING_CHANGE_TRACKING = "eclipselink.weaving.changetracking";
	public static final String WEAVING_FETCHGROUPS = "eclipselink.weaving.fetchgroups";
	public static final String TARGET_SERVER = "eclipselink.target-server";
	public static final String SCHEMA_GENERATION_DATABASE_ACTION = "javax.persistence.schema-generation.database.action";
	public static final String SCHEMA_GENERATION_SCRIPTS_ACTION = "javax.persistence.schema-generation.scripts.action";
	public static final String SCHEMA_GENERATION_CREATE_SOURCE = "javax.persistence.schema-generation.create-source";
	public static final String SCHEMA_GENERATION_DROP_SOURCE = "javax.persistence.schema-generation.drop-source";
	public static final String SCHEMA_GENERATION_CREATE_DATABASE_SCHEMAS = "javax.persistence.schema-generation.create-database-schemas";
	public static final String SCHEMA_GENERATION_SCRIPTS_CREATE_TARGET = "javax.persistence.schema-generation.scripts.create-target";
	public static final String SCHEMA_GENERATION_SCRIPTS_DROP_TARGET = "javax.persistence.schema-generation.scripts.drop-target";
	public static final String SCHEMA_DATABASE_PRODUCT_NAME = "javax.persistence.database-product-name";
	public static final String SCHEMA_DATABASE_MAJOR_VERSION = "javax.persistence.database-major-version";
	public static final String SCHEMA_DATABASE_MINOR_VERSION = "javax.persistence.database-minor-version";
	public static final String SCHEMA_GENERATION_CREATE_SCRIPT_SOURCE = "javax.persistence.schema-generation.create-script-source";
	public static final String SCHEMA_GENERATION_DROP_SCRIPT_SOURCE = "javax.persistence.schema-generation.drop-script-source";
	public static final String SCHEMA_GENERATION_CONNECTION = "javax.persistence.schema-generation.connection";
	public static final String SCHEMA_GENERATION_SQL_LOAD_SCRIPT_SOURCE = "javax.persistence.sql-load-script-source";
	public static final String SCHEMA_GENERATION_CREATE_ACTION = "create";
	public static final String SCHEMA_GENERATION_DROP_AND_CREATE_ACTION = "drop-and-create";
	public static final String SCHEMA_GENERATION_DROP_ACTION = "drop";
	public static final String SCHEMA_GENERATION_NONE_ACTION = "none";
	public static final String SCHEMA_GENERATION_METADATA_SOURCE = "metadata";
	public static final String SCHEMA_GENERATION_SCRIPT_SOURCE = "script";
	public static final String SCHEMA_GENERATION_METADATA_THEN_SCRIPT_SOURCE = "metadata-then-script";
	public static final String SCHEMA_GENERATION_SCRIPT_THEN_METADATA_SOURCE = "script-then-metadata";
	public static final String SEQUENCING_SEQUENCE_DEFAULT = "eclipselink.sequencing.default-sequence-to-table";
	public static final String SESSION_CUSTOMIZER = "eclipselink.session.customizer";
	public static final String DESCRIPTOR_CUSTOMIZER_ = "eclipselink.descriptor.customizer.";
	public static final String NATIVE_QUERY_UPPERCASE_COLUMNS = "eclipselink.jdbc.uppercase-columns";
	public static final String UPPERCASE_COLUMN_NAMES = "eclipselink.jpa.uppercase-column-names";
	public static final String BATCH_WRITING = "eclipselink.jdbc.batch-writing";
	public static final String BATCH_WRITING_SIZE = "eclipselink.jdbc.batch-writing.size";
	public static final String ECLIPSELINK_PERSISTENCE_XML = "eclipselink.persistencexml";
	public static final String ECLIPSELINK_PERSISTENCE_XML_DEFAULT = "META-INF/persistence.xml";
	public static final String ECLIPSELINK_PERSISTENCE_UNITS = "eclipselink.persistenceunits";
	public static final String EXCEPTION_HANDLER_CLASS = "eclipselink.exception-handler";
	public static final String INCLUDE_DESCRIPTOR_QUERIES = "eclipselink.session.include.descriptor.queries";
	public static final String SESSION_EVENT_LISTENER_CLASS = "eclipselink.session-event-listener";
	public static final String SESSIONS_XML = "eclipselink.sessions-xml";
	public static final String PROJECT_CACHE = "eclipselink.project-cache";
	public static final String PROJECT_CACHE_FILE = "eclipselink.project-cache.java-serialization.file-location";
	public static final String TEMPORAL_MUTABLE = "eclipselink.temporal.mutable";
	public static final String ALLOW_NATIVE_SQL_QUERIES = "eclipselink.jdbc.allow-native-sql-queries";

	/** @deprecated */
	public static final String ALLOW_ZERO_ID = "eclipselink.allow-zero-id";
	public static final String ID_VALIDATION = "eclipselink.id-validation";
	public static final String FLUSH_CLEAR_CACHE = "eclipselink.flush-clear.cache";
	public static final String CLASSLOADER = "eclipselink.classloader";
	public static final String THROW_EXCEPTIONS = "eclipselink.orm.throw.exceptions";
	public static final String ORM_SCHEMA_VALIDATION = "eclipselink.orm.validate.schema";
	public static final String DEPLOY_ON_STARTUP = "eclipselink.deploy-on-startup";
	public static final String VALIDATION_ONLY_PROPERTY = "eclipselink.validation-only";
	public static final String DDL_GENERATION = "eclipselink.ddl-generation";
	public static final String CREATE_ONLY = "create-tables";
	public static final String DROP_ONLY = "drop-tables";
	public static final String DROP_AND_CREATE = "drop-and-create-tables";
	public static final String CREATE_OR_EXTEND = "create-or-extend-tables";
	public static final String NONE = "none";
	public static final String METADATA_SOURCE = "eclipselink.metadata-source";
	public static final String METADATA_SOURCE_RCM_COMMAND = "eclipselink.metadata-source.send-refresh-command";
	public static final String METADATA_SOURCE_XML_FILE = "eclipselink.metadata-source.xml.file";
	public static final String METADATA_SOURCE_XML_URL = "eclipselink.metadata-source.xml.url";
	public static final String METADATA_SOURCE_PROPERTIES_FILE = "eclipselink.metadata-source.properties.file";
	public static final String APP_LOCATION = "eclipselink.application-location";
	public static final String CREATE_JDBC_DDL_FILE = "eclipselink.create-ddl-jdbc-file-name";
	public static final String DROP_JDBC_DDL_FILE = "eclipselink.drop-ddl-jdbc-file-name";
	public static final String DEFAULT_APP_LOCATION = "." + File.separator;
	public static final String DEFAULT_CREATE_JDBC_FILE_NAME = "createDDL.jdbc";
	public static final String DEFAULT_DROP_JDBC_FILE_NAME = "dropDDL.jdbc";
	public static final String JAVASE_DB_INTERACTION = "INTERACT_WITH_DB";
	public static final String DDL_GENERATION_MODE = "eclipselink.ddl-generation.output-mode";
	public static final String DDL_GENERATION_INDEX_FOREIGN_KEYS = "eclipselink.ddl-generation.index-foreign-keys";
	public static final String DDL_SQL_SCRIPT_GENERATION = "sql-script";
	public static final String DDL_DATABASE_GENERATION = "database";
	public static final String DDL_BOTH_GENERATION = "both";
	public static final String DEFAULT_DDL_GENERATION_MODE = "database";
	public static final String VALIDATE_EXISTENCE = "eclipselink.validate-existence";
	public static final String ORDER_UPDATES = "eclipselink.order-updates";
	public static final String PROFILER = "eclipselink.profiler";
	public static final String TUNING = "eclipselink.tuning";
	public static final String FREE_METADATA = "eclipselink.memory.free-metadata";
	public static final String JOIN_EXISTING_TRANSACTION = "eclipselink.transaction.join-existing";
	public static final String PERSISTENCE_CONTEXT_REFERENCE_MODE = "eclipselink.persistence-context.reference-mode";
	public static final String PESSIMISTIC_LOCK_TIMEOUT = "javax.persistence.lock.timeout";
	public static final String QUERY_TIMEOUT = "javax.persistence.query.timeout";
	public static final String PERSISTENCE_CONTEXT_CLOSE_ON_COMMIT = "eclipselink.persistence-context.close-on-commit";
	public static final String PERSISTENCE_CONTEXT_PERSIST_ON_COMMIT = "eclipselink.persistence-context.persist-on-commit";
	public static final String PERSISTENCE_CONTEXT_COMMIT_WITHOUT_PERSIST_RULES = "eclipselink.persistence-context.commit-without-persist-rules";
	public static final String PERSISTENCE_CONTEXT_FLUSH_MODE = "eclipselink.persistence-context.flush-mode";
	public static final String ORACLE_PROXY_TYPE = "eclipselink.oracle.proxy-type";
	public static final String COORDINATION_PROTOCOL = "eclipselink.cache.coordination.protocol";
	public static final String COORDINATION_JMS_HOST = "eclipselink.cache.coordination.jms.host";
	public static final String COORDINATION_JMS_TOPIC = "eclipselink.cache.coordination.jms.topic";
	public static final String COORDINATION_JMS_FACTORY = "eclipselink.cache.coordination.jms.factory";
	public static final String COORDINATION_JMS_REUSE_PUBLISHER = "eclipselink.cache.coordination.jms.reuse-topic-publisher";
	public static final String COORDINATION_RMI_ANNOUNCEMENT_DELAY = "eclipselink.cache.coordination.rmi.announcement-delay";
	public static final String COORDINATION_RMI_MULTICAST_GROUP = "eclipselink.cache.coordination.rmi.multicast-group";
	public static final String COORDINATION_RMI_MULTICAST_GROUP_PORT = "eclipselink.cache.coordination.rmi.multicast-group.port";
	public static final String COORDINATION_RMI_PACKET_TIME_TO_LIVE = "eclipselink.cache.coordination.rmi.packet-time-to-live";
	public static final String COORDINATION_RMI_URL = "eclipselink.cache.coordination.rmi.url";
	public static final String COORDINATION_NAMING_SERVICE = "eclipselink.cache.coordination.naming-service";
	public static final String COORDINATION_JNDI_USER = "eclipselink.cache.coordination.jndi.user";
	public static final String COORDINATION_JNDI_PASSWORD = "eclipselink.cache.coordination.jndi.password";
	public static final String COORDINATION_JNDI_CONTEXT = "eclipselink.cache.coordination.jndi.initial-context-factory";
	public static final String COORDINATION_REMOVE_CONNECTION = "eclipselink.cache.coordination.remove-connection-on-error";
	public static final String COORDINATION_ASYNCH = "eclipselink.cache.coordination.propagate-asynchronously";
	public static final String COORDINATION_THREAD_POOL_SIZE = "eclipselink.cache.coordination.thread.pool.size";
	public static final String COORDINATION_SERIALIZER = "eclipselink.cache.coordination.serializer";
	public static final String COORDINATION_CHANNEL = "eclipselink.cache.coordination.channel";
	public static final String COMPOSITE_UNIT = "eclipselink.composite-unit";
	public static final String COMPOSITE_UNIT_MEMBER = "eclipselink.composite-unit.member";
	public static final String COMPOSITE_UNIT_PROPERTIES = "eclipselink.composite-unit.properties";
	public static final String REMOTE_PROTOCOL = "eclipselink.remote.protocol";
	public static final String REMOTE_URL = "eclipselink.remote.client.url";
	public static final String REMOTE_SERVER_NAME = "eclipselink.remote.server.name";
	public static final String NOSQL_CONNECTION_SPEC = "eclipselink.nosql.connection-spec";
	public static final String NOSQL_CONNECTION_FACTORY = "eclipselink.nosql.connection-factory";
	public static final String JDBC_CONNECTOR = "eclipselink.jdbc.connector";
	public static final String NOSQL_PROPERTY = "eclipselink.nosql.property.";
	public static final String NOSQL_USER = "eclipselink.nosql.property.user";
	public static final String NOSQL_PASSWORD = "eclipselink.nosql.property.password";
	public static final String JDBC_PROPERTY = "eclipselink.jdbc.property.";
	public static final String JDBC_RESULT_SET_ACCESS_OPTIMIZATION = "eclipselink.jdbc.result-set-access-optimization";
	public static final String SERIALIZER = "eclipselink.serializer";
	public static final Map<String, String> PROPERTY_LOG_OVERRIDES = new HashMap(
			1);
	public static final String WEAVING_REST = "eclipselink.weaving.rest";
	private static final Set<String> supportedNonServerSessionProperties;

	static {
		PROPERTY_LOG_OVERRIDES.put("javax.persistence.jdbc.password", "xxxxxx");

		supportedNonServerSessionProperties = new HashSet() {
		};
	}

	public static String getOverriddenLogStringForProperty(String propertyName) {
		return ((String) PROPERTY_LOG_OVERRIDES.get(propertyName));
	}

	public static Set<String> getSupportedNonServerSessionProperties() {
		return Collections.unmodifiableSet(supportedNonServerSessionProperties);
	}
}
