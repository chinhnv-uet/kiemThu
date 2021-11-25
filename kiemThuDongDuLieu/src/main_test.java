import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class main_test {
//sinh test theo do do all-c-use/some-p-use
    @Test
    void testId1() {
        assertEquals("Đỗ chọn", Main.xetTuyenCapBa(27.8, 7.5));
    }

    @Test
    void testId2() {
        assertEquals("Trượt", Main.xetTuyenCapBa(26.4, 8.3));
    }

    @Test
    void testId3() {
        assertEquals("Đỗ chuyên", Main.xetTuyenCapBa(28.1, 8.2));
    }

    @Test
    void testId4() {
        assertEquals("Đỗ chọn", Main.xetTuyenCapBa(28.5, 6.7));
    }

    @Test
    void testId5() {
        assertEquals("Đầu vào không hợp lệ", Main.xetTuyenCapBa(31.2, 4.5));
    }

    @Test
    void testId6() {
        assertEquals("Trượt", Main.xetTuyenCapBa(25.5, 9.4));
    }

    @Test
    void testId7() {
        assertEquals("Đỗ chuyên", Main.xetTuyenCapBa(29.3, 8.9));
    }

    @Test
    void testId8() {
        assertEquals("Đỗ chọn", Main.xetTuyenCapBa(28.7, 7.8));
    }
}