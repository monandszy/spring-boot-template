package code.entrypoints.http.status;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import code.TemplateApp;
import code.modules.status.domain.models.ServiceStatus;
import code.modules.status.mappers.StatusHttpMapperImpl;
import code.modules.status.ports.in.StatusQueryFacade;
import java.time.Instant;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = StatusController.class)
@Import(StatusHttpMapperImpl.class)
@ContextConfiguration(classes = TemplateApp.class)
class StatusControllerTest {

  @Autowired private MockMvc mockMvc;

  @MockBean private StatusQueryFacade statusQueryFacade;

  @Test
  void shouldReturnStatusResponse() throws Exception {
    Instant checkedAt = Instant.parse("2026-01-01T00:00:00Z");
    ServiceStatus serviceStatus = new ServiceStatus("status", "UP", checkedAt);
    given(statusQueryFacade.getStatus()).willReturn(serviceStatus);

    mockMvc
        .perform(get("/api/v1/status"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.module").value("status"))
        .andExpect(jsonPath("$.status").value("UP"))
        .andExpect(jsonPath("$.checkedAt").value("2026-01-01T00:00:00Z"));
  }
}
