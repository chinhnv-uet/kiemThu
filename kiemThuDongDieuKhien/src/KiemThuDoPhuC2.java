import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class KiemThuDoPhuC2 {
    @Test
    void testId1() {
        assertEquals("Đầu vào không hợp lệ", Main.xetTuyenCapBa(-1.0, 9.0));
    }

    @Test
    void testId2() {
        assertEquals("Trượt", Main.xetTuyenCapBa(25.5, 8.0));
    }

    @Test
    void testId3() {
        assertEquals("Đỗ chuyên", Main.xetTuyenCapBa(27.6, 8.4));
    }

    @Test
    void testId4() {
        assertEquals("Đỗ chọn", Main.xetTuyenCapBa(28.3, 6.7));
    }
}