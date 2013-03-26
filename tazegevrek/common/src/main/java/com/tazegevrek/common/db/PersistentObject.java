package org.tazegevrek.common.db;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.GenericGenerator;

@SuppressWarnings("serial")
@MappedSuperclass
public abstract class PersistentObject implements Serializable {

	@Id
	@GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(strategy = GenerationType.IDENTITY,generator="gen")
	@Column(name = "ID", nullable = false)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_TIME",nullable=false)
	private Date insertTime;
	
	@Column(name = "INSERT_USER",nullable=false)
	private String insertUser;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME")
	private Date updateTime;
	
	@Column(name = "UPDATE_USER")
	private String updateUser;
	
	@Version
	@Column(name = "VERSION",nullable=false)
	private int version = 0;

	protected void copy(final PersistentObject source) {
		this.id = source.id;
		this.insertTime = source.insertTime;
		this.insertUser = source.insertUser;
		this.updateTime = source.updateTime;
		this.updateUser = source.updateUser;
		this.version = source.version;
	}

	protected static boolean getBooleanValue(final Boolean value) {
		return Boolean.valueOf(String.valueOf(value));
	}

	public Long getId() {
		return this.id;
	}

	@SuppressWarnings("unused")
	private void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	@SuppressWarnings("unused")
	private void setVersion(final int version) {
		this.version = version;
	}
	
	

	public Date getInsertTime() { 
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

	public String getInsertUser() {
		return insertUser;
	}

	public void setInsertUser(String insertUser) {
		this.insertUser = insertUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof PersistentObject)) {
			return false;
		}
		final PersistentObject other = (PersistentObject) obj;
		if (this.id != null && other.id != null) {
			if (this.id != other.id) {
				return false;
			}
		}
		return true;
	}
}
