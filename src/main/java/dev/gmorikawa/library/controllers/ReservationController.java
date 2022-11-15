package dev.gmorikawa.library.controllers;

import dev.gmorikawa.library.models.Reservation;
import dev.gmorikawa.library.services.ReservationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/reservation")
public class ReservationController {
    
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getReservations() {
        return reservationService.getReservations();
    }

    @PostMapping
    public void registerNewReservation(@RequestBody Reservation newReservation) {
        reservationService.insertReservation(newReservation);
    }

    @DeleteMapping(path = "{reservationId}")
    public void deleteReservation(@PathVariable Long reservationId) {
        reservationService.deleteReservation(reservationId);
    }

    @PutMapping
    public void modifyReservation(@RequestBody Reservation modifiedReservation) {
        reservationService.updateReservation(modifiedReservation);
    }
    
}
