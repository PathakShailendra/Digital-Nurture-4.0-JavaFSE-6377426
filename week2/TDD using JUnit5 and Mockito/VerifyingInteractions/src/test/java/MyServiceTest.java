import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Stub if needed (not needed here but okay to add)
        when(mockApi.getData()).thenReturn("Mocked Data");

        // Step 3: Use the mock in service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Step 4: Verify interaction
        verify(mockApi).getData();

        // Optional Print
        System.out.println("Test Output: " + result);
    }
}
