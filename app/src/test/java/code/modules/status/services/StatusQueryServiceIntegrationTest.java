package code.modules.status.services;

import static org.assertj.core.api.Assertions.assertThat;

import code.TemplateApp;
import code.modules.status.domain.models.ServiceStatus;
import code.modules.status.ports.in.StatusQueryFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = TemplateApp.class)
class StatusQueryServiceIntegrationTest {

  @Autowired private StatusQueryFacade statusQueryFacade;

  @Test
  void shouldReturnModuleStatusViaFacade() {
    ServiceStatus serviceStatus = statusQueryFacade.getStatus();

    assertThat(serviceStatus).isNotNull();
    assertThat(serviceStatus.moduleName()).isEqualTo("status");
    assertThat(serviceStatus.status()).isEqualTo("UP");
    assertThat(serviceStatus.checkedAt()).isNotNull();
  }
}
