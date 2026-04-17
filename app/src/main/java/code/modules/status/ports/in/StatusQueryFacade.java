package code.modules.status.ports.in;

import code.modules.status.domain.models.ServiceStatus;

public interface StatusQueryFacade {

  ServiceStatus getStatus();
}
