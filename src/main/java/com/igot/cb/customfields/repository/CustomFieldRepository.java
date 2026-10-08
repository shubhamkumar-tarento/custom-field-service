package com.igot.cb.customfields.repository;

import com.igot.cb.customfields.entity.CustomFieldEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomFieldRepository extends JpaRepository<CustomFieldEntity, String> {
    Optional<CustomFieldEntity> findByCustomFiledIdAndIsActiveTrue(String customFiledId);
}
