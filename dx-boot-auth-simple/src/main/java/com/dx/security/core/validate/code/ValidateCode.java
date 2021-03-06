package com.dx.security.core.validate.code;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Description: 短信验证码
 *
 * @author yaoj
 * @version 1.0
 * @copyright Copyright (c) 文理电信
 * @since 2018-12-23
 */
@Data
public class ValidateCode implements Serializable{

	private static final long serialVersionUID = -8366929034564774130L;

	/**
	 * 验证码
	 */
	private String code;
	/**
	 * 过期时间点
	 */
	private LocalDateTime expireTime;

	/**
	 * @param code 验证码
	 * @param expireTn 多少秒过期
	 */
	public ValidateCode(String code, int expireTn) {
		this.code = code;
		//过期时间=当前时间+过期秒数 
		this.expireTime = LocalDateTime.now().plusSeconds(expireTn);
	}

	/**
	 * @param code 验证码
	 * @param expireTime 过期时间
	 */
	public ValidateCode(String code, LocalDateTime expireTime) {
		this.code = code;
		this.expireTime = expireTime;
	}

	/**
	 * 判断验证码是否过期
	 * @return  true 过期,false 没过期
	 */
	public boolean isExpired(){
		return LocalDateTime.now().isAfter(expireTime);
	}

}
