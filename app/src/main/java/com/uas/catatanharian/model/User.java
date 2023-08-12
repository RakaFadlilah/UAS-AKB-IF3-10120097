/**
 * NIM : 10120097
 * NAMA : Raka Fadlilah
 * KELAS : IF-3
 */
package com.uas.catatanharian.model;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {
    public String username;
    public String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
