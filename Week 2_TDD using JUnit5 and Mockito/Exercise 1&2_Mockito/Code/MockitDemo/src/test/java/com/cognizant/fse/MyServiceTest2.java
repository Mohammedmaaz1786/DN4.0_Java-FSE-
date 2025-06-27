package com.cognizant.fse;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class MyServiceTest2 {

    @Test
    public void testVerifyInteraction() {
        // Step 1: Create a mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Inject mock into service
        MyService service = new MyService(mockApi);

        // Step 3: Call the method under test
        service.fetchData();

        // Step 4: Verify that getData() was called on the mock
        verify(mockApi).getData();  // ✅ This ensures interaction happened
    }
}
