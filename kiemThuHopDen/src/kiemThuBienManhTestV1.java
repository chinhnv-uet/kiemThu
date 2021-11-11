import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class kiemThuBienManhTestV1 {
    @Test
    void testId1() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBa(-0.1, 5.0));
    }

    @Test
    void testId2() {
        assertEquals("Trượt", main.xetTuyenCapBa(0.0, 5.0));
    }

    @Test
    void testId3() {
        assertEquals("Trượt", main.xetTuyenCapBa(0.1, 5.0));
    }

    @Test
    void testId4() {
        assertEquals("Đỗ chọn", main.xetTuyenCapBa(29.9, 5.0));
    }

    @Test
    void testId5() {
        assertEquals("Đỗ chọn", main.xetTuyenCapBa(30.0, 5.0));
    }

    @Test
    void testId6() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBa(30.1, 5.0));
    }

    @Test
    void testId7() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBa(15.0, -0.1));
    }

    @Test
    void testId8() {
        assertEquals("Trượt", main.xetTuyenCapBa(15.0, 0.0));
    }

    @Test
    void testId9() {
        assertEquals("Trượt", main.xetTuyenCapBa(15.0, 0.1));
    }

    @Test
    void testId10() {
        assertEquals("Trượt", main.xetTuyenCapBa(15.0, 5.0));
    }

    @Test
    void testId11() {
        assertEquals("Trượt", main.xetTuyenCapBa(15.0, 9.9));
    }

    @Test
    void testId12() {
        assertEquals("Trượt", main.xetTuyenCapBa(15.0, 10.0));
    }

    @Test
    void testId13() {
        assertEquals("Đầu vào không hợp lệ", main.xetTuyenCapBa(15.0, 10.1));
    }
}