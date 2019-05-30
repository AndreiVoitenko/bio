package bio.demo.dao;

import bio.demo.model.Files;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FilesRepository extends JpaRepository<Files, Long> {

    @Query("SELECT f FROM Files f WHERE f.id = ?1")
    Files getFile (Long value);

    @Modifying
    @Query("delete FROM Files f WHERE f.inputs.id = ?1")
    void deleteFile (Long id);
}
