package fancycamper.service;

import fancycamper.model.CampingTrip;
import fancycamper.model.State;
import fancycamper.repository.CampingTripRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CampingTripService {

    private CampingTripRepository campingTripRepository;

    public CampingTripService(CampingTripRepository campingTripRepository) {
        this.campingTripRepository = campingTripRepository;
    }
    public List<CampingTrip> findByState(State state) {
        return campingTripRepository.findByState(state);
    }
    public CampingTrip findOne(Long id) {
        CampingTrip campingTrip = campingTripRepository.findOne(id);
        return CampingTrip.builder().id(campingTrip.getId())
                .state(campingTrip.getState())
                .location(campingTrip.getLocation())
                .tripDates(campingTrip.getTripDates())
                .build();
    }

}

