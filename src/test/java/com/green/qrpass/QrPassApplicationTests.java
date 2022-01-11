package com.green.qrpass;

import com.green.qrpass.utils.AES256;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration
@SpringBootTest
class QrPassApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void dataEncryptTest(){
        AES256 aes256 = new AES256();
        try {
            System.out.println("ENCRYPT : " + aes256.encrypt("test"));
        }catch (Exception e){
            System.out.println("ENCRYPT : FAIL" );
        }

    }

}
