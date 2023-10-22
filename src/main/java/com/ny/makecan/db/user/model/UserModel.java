package com.ny.makecan.db.user.model;

import com.ny.makecan.db.common.AbstractDbModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserModel extends AbstractDbModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3751581329854470809L;

	private String userId;

	private String password;

	private String name;

	private String regDt;

}
