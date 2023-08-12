/**
 * NIM : 10120097
 * NAMA : Raka Fadlilah
 * KELAS : IF-3
 */
package com.uas.catatanharian.helper;

public class StringHelper {
    // Generate Username From Email
    public static String usernameFromEmail(java.lang.String email) {
        if (!email.contains("@")) return email;

        return email.split("@")[0];
    }
}
