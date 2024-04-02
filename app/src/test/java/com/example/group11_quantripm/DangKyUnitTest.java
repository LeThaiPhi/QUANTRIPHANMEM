package com.example.group11_quantripm;
import org.junit.Test;
import static org.junit.Assert.*;
import com.example.group11_quantripm.model.User;
import java.util.ArrayList;
import java.util.List;
public class DangKyUnitTest {
    public class User {
        private String username;
        private String email;
        private String phoneNumber;
        private String password;

        public User(String username, String email, String phoneNumber, String password) {
            this.username = username;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.password = password;
        }

        // Getters và setters cho các trường dữ liệu
    }
    @Test
    public void testDangKySuccess() {
        AuthenticationService authService = new AuthenticationService();
        String username = "Phi123";
        String email = "Phi123@gmaul.com";
        String phoneNumber = "0903156292";
        String password = "123456";

        boolean result = authService.dangKy(username, email, phoneNumber, password);

        assertTrue(result);
    }

    @Test
    public void testDangKyFailure_ExistingUsername() {
        AuthenticationService authService = new AuthenticationService();
        String existingUsername = "existing_user";
        String email = "existing_user@example.com";
        String phoneNumber = "987654321";
        String password = "existing_password";

        // Add an existing user for this test case
        authService.dangKy(existingUsername, email, phoneNumber, password);

        boolean result = authService.dangKy(existingUsername, email, phoneNumber, password);

        assertFalse(result);
    }
    public class AuthenticationService {
        private List<User> userList;

        public AuthenticationService() {
            this.userList = new ArrayList<>();
        }

        public boolean dangKy(String username, String email, String phoneNumber, String password) {
            // Kiểm tra xem username đã tồn tại chưa
            for (User user : userList) {
                if (user.getClass().equals(username)) {
                    return false; // Username đã tồn tại
                }
            }

            // Thêm người dùng mới vào danh sách
            userList.add(new User(username, email, phoneNumber, password));
            return true;
        }

        // Các phương thức khác, như kiểm tra đăng nhập, có thể được triển khai ở đây
    }

}
