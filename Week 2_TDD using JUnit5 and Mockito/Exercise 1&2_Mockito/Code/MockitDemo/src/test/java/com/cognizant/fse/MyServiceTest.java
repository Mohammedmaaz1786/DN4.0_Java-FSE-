package com.cognizant.fse;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: Create mock
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        when(mockApi.getData()).thenReturn("Mock Data");

        // Act: Use the mocked API in service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Assert: Validate the result
        assertEquals("Mock Data", result);
    }
}
