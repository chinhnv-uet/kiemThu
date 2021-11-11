import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class kiemThuBangQuyetDinh {
    @Test
    void testId1() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(-1.2, -5.0));
    }

    @Test
    void testId2() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(-2.0, 5.0));
    }

    @Test
    void testId3() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(-2.1, 8.7));
    }

    @Test
    void testId4() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(-1.4, 10.4));
    }

    @Test
    void testId5() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(23.1, -3.1));
    }

    @Test
    void testId6() {
        assertEquals("Trượt", main.xetTuyenCapBaV2(26.3, 5.0));
    }

    @Test
    void testId7() {
        assertEquals("Trượt", main.xetTuyenCapBaV2(25.8, 8.2));
    }

    @Test
    void testId8() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(24.9, 10.2));
    }

    @Test
    void testId9() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(27.0, -3.2));
    }

    @Test
    void testId10() {
        assertEquals("Đỗ chọn", main.xetTuyenCapBaV2(27.6, 7.6));
    }

    @Test
    void testId11() {
        assertEquals("Đỗ chuyên", main.xetTuyenCapBaV2(28.1, 8.9));
    }

    @Test
    void testId12() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(29.4, 11.2));
    }

    @Test
    void testId13() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(30.2, -1.2));
    }

    @Test
    void testId14() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(31.4, 7.1));
    }

    @Test
    void testId15() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(30.7, 9.0));
    }

    @Test
    void testId16() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBaV2(32.6, 11.7));
    }
}