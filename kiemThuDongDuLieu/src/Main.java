public class Main {

    public static String xetTuyenCapBa(double dxt, double dc) {
        String res;
        if (dxt < 0 || dxt > 30 || dc < 0 || dc > 10) {
            res = "Đầu vào không hợp lệ";
        } else if (dxt < 27) {
            res = "Trượt";
        } else if (dc >= 8) {
            res = "Đỗ chuyên";
        } else {
            res = "Đỗ chọn";
        }
        return res;
    }
}