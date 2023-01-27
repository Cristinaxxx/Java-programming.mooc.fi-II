
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        
        IOU iou = new IOU();
        iou.setSum("Ele", 80.0);
        iou.setSum("Aga", 20.0);
        
        iou.howMuchDoIOweTo("Ele");
        iou.howMuchDoIOweTo("Aga");
        System.out.println(iou.howMuchDoIOweTo("Ele"));
        System.out.println(iou.howMuchDoIOweTo("Aga"));
        
    }
}
