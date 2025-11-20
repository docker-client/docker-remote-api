package de.gesellix.docker.remote.api;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerUpdateRequestTest {

  @Test
  public void ensureContainerUpdateRequestFields() {
    Field[] resourcesFields = Resources.class.getDeclaredFields();

    Field[] containerUpdateRequestFields = ContainerUpdateRequest.class.getDeclaredFields();

    assertEquals(
        resourcesFields.length + 1 /* RestartPolicy */,
        containerUpdateRequestFields.length);
  }
}
