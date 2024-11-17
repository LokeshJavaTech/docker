package com.lokesh.docker_demo_one.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    Long id;
    String name;
}
