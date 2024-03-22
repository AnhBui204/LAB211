
package Model;

public class Model {
    private int total;
    private int time;
    private int cost;
    private final int dumpCost = 57000; // Chi phí bãi chôn

    public Model() {
        total = 0;
        time = 0;
    }

    public void addGarbage(int garbage) {
    if (total + garbage <= 10000) { // Nếu tổng lượng rác sau khi thêm không vượt quá 10 tấn
        total += garbage;
        time += 8; // Thời gian thu gom ở mỗi trạm là 8 phút
    } else { // Nếu tổng lượng rác sau khi thêm vượt quá 10 tấn
        dumpGarbage(); // Đổ rác
        total += garbage; // Thêm rác vào xe
        time += 8; // Thời gian thu gom ở mỗi trạm là 8 phút
    }
}


    private void dumpGarbage() {
        total = 0;
        time += 30; // Thời gian đi tới và từ bãi chôn là 30 phút
        cost += dumpCost; // Chi phí chôn mỗi lần đổ rác
    }

    public void returnToStation() {
        time += 30; // Thời gian trở lại trạm cuối cùng
        cost += dumpCost; //Lần chôn cuối cùng khi trở về
    }

    public double calculateTotalCost() {
        double laborAndTransportationCost = (double) time / 60 * 120000;
        return laborAndTransportationCost + cost;
    }
}