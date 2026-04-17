package code.modules.status.domain.models;

import java.time.Instant;

public record ServiceStatus(String moduleName, String status, Instant checkedAt) {}
