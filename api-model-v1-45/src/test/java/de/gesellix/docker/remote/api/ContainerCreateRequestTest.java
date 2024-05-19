package de.gesellix.docker.remote.api;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContainerCreateRequestTest {

  @Test
  public void ensureContainerCreateRequestFields() {
    Field[] containerConfigFields = ContainerConfig.class.getDeclaredFields();

    Field[] containerCreateRequestFields = ContainerCreateRequest.class.getDeclaredFields();

    assertEquals(
        containerConfigFields.length + 1 /* HostConfig */ + 1 /* NetworkingConfig */,
        containerCreateRequestFields.length);
  }
}
