package dev.gmorikawa.library.services;

import dev.gmorikawa.library.models.Reservation;
import dev.gmorikawa.library.repository.ReservationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.util.List;

@Service
public class ReservationService {
    
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    public void insertReservation(Reservation newReservation) {
        reservationRepository.save(newReservation);
    }

    @Transactional
    public void updateReservation(Reservation modifiedReservation) {
        Reservation registeredReservation = reservationRepository.findById(modifiedReservation.getId()).get();

        registeredReservation.setIssueDate(modifiedReservation.getIssueDate());
        registeredReservation.setValidity(modifiedReservation.getValidity());
        /*
         * Don't know how is going to be done with memberId and bookId
         */
    }

    public void deleteReservation(Long reservationId) {
        reservationRepository.delete(reservationRepository.findById(reservationId).get());
    }

}
