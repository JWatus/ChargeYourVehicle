package charge_your_vehicle.service.json_parser;

import charge_your_vehicle.model.entity.charging_points_data.ChargingPoint;
import java.util.List;

public class JsonParser {

    private CustomGsonBuilder gsonBuilder;

    public JsonParser(CustomGsonBuilder gsonBuilder) {
        this.gsonBuilder = gsonBuilder;
    }

    public List<ChargingPoint> jsonToChargingPointList(String json) {
        return gsonBuilder.deserialize(new ChargingPointDeserializer(), json);
    }
}