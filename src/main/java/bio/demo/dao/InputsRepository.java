package bio.demo.dao;

import bio.demo.model.Files;
import bio.demo.model.Inputs;
import org.hibernate.search.bridge.builtin.IntegerBridge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Repository
public interface InputsRepository extends JpaRepository<Inputs, Long>, CrudRepository<Inputs, Long> {

    @Query("SELECT u FROM Inputs u WHERE u.id = ?1")
    List<Inputs> findAcr(Long id);


    @Modifying
    @Query("delete FROM Inputs u WHERE u.id = ?1")
    void deleteById(@Param("Id") Long Id);

    @Query("SELECT u FROM Inputs u WHERE u.Isolation_date >= ?1")
    List<Inputs> FromData(LocalDate startDate);

    @Query("SELECT u FROM Inputs u WHERE u.Isolation_date <= ?1")
    List<Inputs> ToData(LocalDate endDate);

    @Query("SELECT u FROM Inputs u WHERE u.Old_nummeration >= ?1")
    List<Inputs> OldNumerationFrom(Integer number);

    @Query("SELECT u FROM Inputs u WHERE u.Old_nummeration <= ?1")
    List<Inputs> OldNumerationTo(Integer number);

    @Query("SELECT u FROM Inputs u WHERE u.Isolation_source = ?1")
    List<Inputs> IsolationSource(String value);

    @Query("SELECT u FROM Inputs u WHERE u.MALDI_score >= ?1")
    List<Inputs> MaldiScoreFrom(Integer value);

    @Query("SELECT u FROM Inputs u WHERE u.MALDI_score <= ?1")
    List<Inputs> MaldiScoreTo(Integer value);

    @Query("SELECT u FROM Inputs u WHERE u.Position_in_fridge >= ?1")
    List<Inputs> PositionInFridgeFrom(Integer value);

    @Query("SELECT u FROM Inputs u WHERE u.Position_in_fridge <= ?1")
    List<Inputs> PositionInFridgeTo(Integer value);

    @Query("SELECT u FROM Inputs u WHERE u.Storage_date >= ?1")
    List<Inputs> StorageDateStart(LocalDate value);

    @Query("SELECT u FROM Inputs u WHERE u.Storage_date <= ?1")
    List<Inputs> StorageDateEnd(LocalDate value);

}

