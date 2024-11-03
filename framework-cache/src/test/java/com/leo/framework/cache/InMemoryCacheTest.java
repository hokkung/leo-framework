package com.leo.framework.cache;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class InMemoryCacheTest {
    private InMemoryCache<String, String> underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new InMemoryCache<>();
    }

    @Test
    public void cacheSize() {
      Assertions.assertEquals(0, underTest.getKeyCount());

      underTest.put("name", "luffy");

      Assertions.assertEquals(1, underTest.getKeyCount());
    }
}
