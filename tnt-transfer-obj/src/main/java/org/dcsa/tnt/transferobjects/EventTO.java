package org.dcsa.tnt.transferobjects;

import lombok.Builder;

public record EventTO(
  EventMetadataTO metadata,
  EventPayloadTO payload
) {
  @Builder(toBuilder = true)
  public EventTO { }
}
