package dev.gmorikawa.library.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dev.gmorikawa.library.models.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    @Query("SELECT x FROM Member x WHERE x.email = ?1")
    Optional<Member> findMemberByEmail(String email);

}
