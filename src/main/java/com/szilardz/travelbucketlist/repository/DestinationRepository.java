package com.szilardz.travelbucketlist.repository;

import com.szilardz.travelbucketlist.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, Long> {

    Destination getByDestinationId(Long id);
    List<Destination> getDestinationsByBucketList_BucketListId(Long id);
    List<Destination> findAll();

}
