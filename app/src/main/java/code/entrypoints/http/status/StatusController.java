package code.entrypoints.http.status;

import code.entrypoints.http.status.dto.StatusResponse;
import code.modules.status.mappers.StatusHttpMapper;
import code.modules.status.ports.in.StatusQueryFacade;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/status")
@Tag(name = "Status", description = "Application status endpoints")
public class StatusController {

  private final StatusQueryFacade statusQueryFacade;
  private final StatusHttpMapper statusHttpMapper;

  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  @Operation(
      summary = "Get module status",
      description = "Returns the current health/status snapshot for the status module")
  @ApiResponse(
      responseCode = "200",
      description = "Status returned",
      content = @Content(schema = @Schema(implementation = StatusResponse.class)))
  public StatusResponse getStatus() {
    return statusHttpMapper.toResponse(statusQueryFacade.getStatus());
  }
}
