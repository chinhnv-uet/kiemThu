public class main {
    public static String xetTuyenCapBa(double dxt, double dc) {
        if (dxt < 27) {
            return "Trượt";
        } else if (dc >= 8) {
            return "Đỗ chuyên";
        } else {
            return "Đỗ chọn";
        }
    }

    public static String xetTuyenCapBaV2(double dxt, double dc) {
        if (dxt < 0 || dxt > 30 || dc < 0 || dc > 10) {
            return "Đầu vào không hợp lệ";
        }
        if (dxt < 27) {
            return "Trượt";
        } else if (dc >= 8) {
            return "Đỗ chuyên";
        } else {
            return "Đỗ chọn";
        }
    }
}
