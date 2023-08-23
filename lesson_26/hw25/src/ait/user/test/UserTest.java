package ait.user.test;

import ait.user.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    private String email = "john@gmail.com";
    private String password = "1234567aS!";


    @BeforeEach
    void setUp() {
        user = new User(email, password); // перед каждым тестом создать юзера
    }

    @Test
    void testValidEmail(){
        String validEmail = "john@gmx.de";
        user.setEmail(validEmail);
        assertEquals(validEmail, user.getEmail());
    }

    @Test
    void testEmailWithoutAt(){
        String invalidEmail = "john.gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailDoubleAt(){
        String invalidEmail = "@jo@hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailAfterAt(){
        String invalidEmail = "john@gmxde";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }

    @Test
    void testEmailLastDot(){
        String invalidEmail = "john@gmxde.";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());

        invalidEmail = "john@gmxd.e";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());

    }

    @Test
    void testEmailIncorrectSymbol(){
        String invalidEmail = "jo!hn@gmx.de";
        user.setEmail(invalidEmail);
        assertEquals(email, user.getEmail());
    }



    //-------------------------

    @Test
    void testValidPassword(){
        String validPassword = "123eeeS@";
        user.setPassword(validPassword);
        assertEquals(validPassword, user.getPassword());
    }

    @Test
    void testPasswordMin8symbols(){
        String invalidPassword = "fgD1!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMin1SymbolInUppercase(){
        String invalidPassword = "fgssssss1!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMin1SymbolInLowercase(){
        String invalidPassword = "DDHHGGGGGG1!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordMin1SymbolInDigit(){
        String invalidPassword = "DDHHGwwss!";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }

    @Test
    void testPasswordInCorrectSymbol(){
        String invalidPassword = "DDHHGww1ss";
        user.setPassword(invalidPassword);
        assertEquals(password, user.getPassword());
    }




}