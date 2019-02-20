package Airport;

public enum  FrequencyArea {
    ApornControl,Tower;

    public static double getFrequencyForArea(FrequencyArea area){
        if(area == FrequencyArea.ApornControl){
            return 121.5;
        }else if(area==FrequencyArea.Tower){
            return 128.5;
        }
        throw new RuntimeException("No Frequency");
    }
}
