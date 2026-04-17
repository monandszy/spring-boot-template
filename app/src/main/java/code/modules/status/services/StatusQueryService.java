package code.modules.status.services;

import code.modules.status.domain.models.ServiceStatus;
import code.modules.status.ports.in.StatusQueryFacade;
import java.time.Instant;
import org.springframework.stereotype.Service;

@Service
public class StatusQueryService implements StatusQueryFacade {

  @Override
  public ServiceStatus getStatus() {
    return new ServiceStatus("status", "UP", Instant.now());
  }
}
