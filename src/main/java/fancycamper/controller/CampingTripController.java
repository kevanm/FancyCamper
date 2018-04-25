package fancycamper.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import fancycamper.model.CampingTrip;
import fancycamper.model.State;
import fancycamper.service.CampingTripService;
import java.util.List;

@RestController
public class CampingTripController {
    private CampingTripService campingTripService;

    public CampingTripController(CampingTripService campingTripService) {
        this.campingTripService = campingTripService;
    }

    @RequestMapping(value = "/api/trip/{id:.+}", produces = MediaType.APPLICATION_JSON_VALUE)
    private CampingTrip findOne(@PathVariable Long id) {
        return campingTripService.findOne(id);
    }

    @RequestMapping("/api/trips/{state:.+}")
    private List<CampingTrip> getAllSummariesForState(@PathVariable State state) {
        return campingTripService.findByState(state);
    }

}