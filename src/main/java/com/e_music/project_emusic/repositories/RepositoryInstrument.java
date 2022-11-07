package com.e_music.project_emusic.repositories;


import com.e_music.project_emusic.entities.Instrument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryInstrument extends RepositoryBase< Instrument, Long>{

    @Query ( value = "SELECT * FROM instrument WHERE instrument.active = true", nativeQuery = true )
    List< Instrument > findAllByActive( );

    @Query ( value = "SELECT * FROM instrument WHERE instrument.active = true",
            countQuery = "SELECT  count(*) from instrument",
            nativeQuery = true )
    Page< Instrument > findAllByActive(Pageable pageable);

    @Query ( value = "SELECT * FROM instrument WHERE instrument.id = :id AND instrument.active = true", nativeQuery = true)
    Optional<Instrument> findAllByAndActive(@Param("id") long id);

    Instrument findByName(String name);
}
