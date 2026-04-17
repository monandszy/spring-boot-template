package code.modules.status.mappers;

import code.bootstrap.config.SpringMapperConfig;
import code.entrypoints.http.status.dto.StatusResponse;
import code.modules.status.domain.models.ServiceStatus;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = SpringMapperConfig.class)
public interface StatusHttpMapper {

  @Mapping(target = "module", source = "moduleName")
  StatusResponse toResponse(ServiceStatus serviceStatus);
}
