package dev.gmorikawa.library.repository;

import dev.gmorikawa.library.models.Reservation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("SELECT x FROM Reservation x WHERE x.memberId = :memberId")
    Optional<Reservation> findByMember(@Param("memberId") Integer memberId);

}
