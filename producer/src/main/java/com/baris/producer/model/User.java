package com.baris.producer.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class User {
    int id;
    String first_name;
    String last_name;

    @Override
    public String toString() {
        return "User:\n" +
                "ID: " + this.id + "\n" +
                "First Name: " + this.first_name + "\n" +
                "Last Name: " + this.last_name;
    }
}
