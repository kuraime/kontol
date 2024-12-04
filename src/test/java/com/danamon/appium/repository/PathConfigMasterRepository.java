package com.danamon.appium.repository;

import com.danamon.appium.entity.PathConfigMasterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PathConfigMasterRepository extends JpaRepository<PathConfigMasterEntity, UUID> {
	PathConfigMasterEntity findByPageNameAndFieldNameAndPlatform(String pageName, String fieldName, String platform);
}