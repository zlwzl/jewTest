package com.itheima;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

/**
 * @program: javaee-dev47
 * @description:
 * @author: ZLW
 * @create: 2019-01-22 10:03
 **/
public class CreateJwtTest {

	public static void main(String[] args) {
		long millis = System.currentTimeMillis();//获取系统当前时间
		long time = millis+1000*60;//设置过期时间
		JwtBuilder builder= Jwts.builder().setId("888")
				.setSubject("小白")
				.setIssuedAt(new Date())
				.setExpiration(new Date(time))
				.signWith(SignatureAlgorithm.HS256,"itcast");//hs256算法
		System.out.println( builder.compact() );

	}
}
