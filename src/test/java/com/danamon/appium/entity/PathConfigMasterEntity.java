package com.danamon.appium.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(schema = "automation", name = "path_config_mast")
public class PathConfigMasterEntity implements Serializable {

	private static final long serialVersionUID = -6695915997569922294L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;

	@Column(name = "page_id")
	private UUID pageId;

	@Column(name = "page_name")
	private String pageName;

	@Column(name = "field_name")
	private String fieldName;

	@Column(name = "platform")
	private String platform;

	@Column(name = "locator_type")
	private String locatorType;

	@Column(name = "locator_value")
	private String locatorValue;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "created_at")
	private LocalDateTime createdAt;

	@Column(name = "updated_by")
	private String updatedBy;

	@Column(name = "updated_at")
	private LocalDateTime updatedAt;
}
