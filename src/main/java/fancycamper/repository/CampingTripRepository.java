package fancycamper.repository;

import fancycamper.model.CampingTrip;
import fancycamper.model.State;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampingTripRepository extends JpaRepository<CampingTrip, Long> {

    @Id
    CampingTrip findOne(Long id);

    List<CampingTrip> findByState(State state);
}