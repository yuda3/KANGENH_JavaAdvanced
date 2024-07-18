package com.file_io.lsn5;

import lombok.Getter;

import java.io.Serializable;

@Getter
public record Person(String name, int age, String gender) implements Serializable {

}
