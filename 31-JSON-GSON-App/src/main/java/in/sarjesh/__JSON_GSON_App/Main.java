package in.sarjesh.__JSON_GSON_App;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Order order = new Order();
        order.setOrderId(101);
        order.setOrderedBy("Sanjay");
        order.setOrderStatus("Confirmed");
        order.setOrderAmount(1345.0);

        Gson gson = new Gson();
        String json = gson.toJson(order);
        System.out.println(json);

//        Order od = gson.fromJson(new FileReader(new File("order.json")),Order.class);
//        System.out.println(od);
    }
}
