package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MembershipTest {

    @Test
    void typeCastString() {
    Kontigent k = new Kontigent("Lars", "50", "passiv", "0");
    k.setAbonnement(1220);
    assertEquals(1220, k.getAbonnement());
    }
}