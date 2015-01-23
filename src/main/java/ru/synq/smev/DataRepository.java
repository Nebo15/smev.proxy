package ru.synq.smev;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface DataRepository extends JpaRepository<Data, Integer>, JpaSpecificationExecutor<Data> {
    Data findByProviderId(String providerId);
}
