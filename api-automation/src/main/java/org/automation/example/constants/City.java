package org.automation.example.constants;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum City {

    FANCODE("FanCode"){
            @Override
            double getMinLat() {
            return -40.0;
            }
        @Override
        double getMaxLat() {
            return 5.0;
        }
        @Override
        double getMinLng() {
            return 5.0;
        }
        @Override
        double getMaxLng() {
            return 100.0;
        }
    };
    private final String fullName;
    double getMinLat() {
        return -180.0;
    }
    double getMaxLat() {
        return 180.0;
    }
    double getMinLng() {
        return -180.0;
    }
    double getMaxLng() {
        return 180.0;
    }

    public boolean inRange(double lat, double lng){
       return lat > getMinLat() && lat < getMaxLat() && lng > getMinLng() && lng < getMaxLng() ;
    }

    public static City valueOfFullName(String fullName) {
        for (City e : values()) {
            if (e.fullName.equals(fullName)) {
                return e;
            }
        }
        return null;
    }

}
