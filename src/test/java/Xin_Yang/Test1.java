package Xin_Yang;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Test1 {

    @Test
    public void Testadd(){
    int i = new  Calc().add();
        Assertions.assertEquals(7,i);
    }

    @Test
    public void Testsubtract(){
        int i = new  Calc().subtract();
        Assertions.assertEquals(2,i);
    }
}
