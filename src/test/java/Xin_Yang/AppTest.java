package Xin_Yang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AppTest {
    @Test
    void testadd(){
    int i = new  Calc().add();
        Assertions.assertEquals(7,i);
    }

    @Test
    void subtract(){
        int i = new  Calc().subtract();
        Assertions.assertEquals(2,i);
    }
}
