package fancycamper.model;


import lombok.Builder;
import lombok.Generated;
import lombok.Getter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Builder
public class CampingTrip implements Serializable {

    @Generated
    private Long id;

    private State state;

    private int location;

    private List<Date> tripDates;

}
