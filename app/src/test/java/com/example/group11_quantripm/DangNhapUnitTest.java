package com.example.group11_quantripm;


import org.junit.Test;
import static org.junit.Assert.*;

public class DangNhapUnitTest {

    @Test
    public void testLoginSuccess() {
        // Chuẩn bị
        AuthenticationService authService = new AuthenticationService();
        String username = "admin@gmail.com";
        String password = "123456";

        // Thực hiện đăng nhập
        boolean result = authService.DangNhap(username, password);

        // Kiểm tra kết quả
        assertTrue(result);
    }

    @Test
    public void testLoginFailure() {
        // Chuẩn bị
        AuthenticationService authService = new AuthenticationService();
        String username = "admin@gmail.com";
        String password = "123456789";

        // Thực hiện đăng nhập
        boolean result = authService.DangNhap(username, password);

        // Kiểm tra kết quả
        assertFalse(result);
    }

    public class AuthenticationService {
        public boolean DangNhap(String username, String password) {
            // Kiểm tra logic đăng nhập, trả về true nếu đúng, ngược lại trả về false
            return false;
        }
    }
}

