package code.entrypoints.http.status.dto;

import java.time.Instant;

public record StatusResponse(String module, String status, Instant checkedAt) {}
